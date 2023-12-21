package ord.example.homework.four.ex4;

public class User {
    private String login;
    private String password;
    private final Message[] messageDataBase;
    private int numberOfCurrentMessage;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.messageDataBase = new Message[100];
        this.numberOfCurrentMessage = 0;
    }

    public User() {
        this.messageDataBase = new Message[100];
    }

    public int getNumberOfCurrentMessage() {
        return numberOfCurrentMessage;
    }

    public void setNumberOfCurrentMessage(int numberOfCurrentMessage) {
        this.numberOfCurrentMessage = numberOfCurrentMessage;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Message[] getMessageDataBase() {
        return messageDataBase;
    }

    public void saveMessage(Message message, boolean isIncoming) {
        message.setIncoming(isIncoming);
        messageDataBase[numberOfCurrentMessage] = message;
        numberOfCurrentMessage++;
    }

    @Override
    public String toString() {
        return "User{"
                + "login='" + login + '\''
                + ", password='" + password + '\''
                + '}';
    }
}
