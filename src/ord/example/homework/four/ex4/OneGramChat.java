package ord.example.homework.four.ex4;

import java.util.Scanner;

public class OneGramChat {
    public static final String ENTER_LOGIN = "Введите логин";
    public static final String ENTER_PASSWORD = "Введите пароль";
    public static final String SIGN_IN = "Войти";
    public static final String SIGN_OUT = "Выйти";
    public static final String NOW_USER = "Новый";
    public static final String SEND_MESSAGE = "Написать";
    public static final String READ_MESSAGE = "Прочитать";
    public static final String EXIT = "Exit";
    public static int numberUser = 0;
    private User currentUser;
    private User[] users = new User[1];
    public static Scanner scannerChat = new Scanner(System.in);

    public OneGramChat() {
    }

    public void createUser() {
        if (users.length == numberUser) {
            User[] copyUser = new User[users.length + 1];
            System.arraycopy(users, 0, copyUser, 0, users.length);
            users = copyUser;
        }
        users[numberUser] = new User();
        System.out.println(ENTER_LOGIN);
        users[numberUser].setLogin(scannerChat.nextLine());
        System.out.println(ENTER_PASSWORD);
        users[numberUser].setPassword(scannerChat.nextLine());
        numberUser++;
        System.out.println("Пользватель создан");
    }

    public void loginUser() throws NotFoundUserException {
        System.out.println(ENTER_LOGIN);
        String login = scannerChat.nextLine();
        System.out.println(ENTER_PASSWORD);
        String password = scannerChat.nextLine();
        for (User user : users) {
            if (checkCorrectUser(user, login, password)) {
                currentUser = user;
                System.out.println("Вход под именем " + user.getLogin());
            }
        }
        if (currentUser == null) {
            throw new NotFoundUserException("Пользователь не найден");
        }
    }

    public void exitUser() {
        this.currentUser = null;
    }

    public void sendMessage() throws NotFoundUserException {
        System.out.println("Введите имя пользователя кому отправить сообщение");
        String userRec = scannerChat.nextLine();
        if (currentUser == null) {
            throw new NotFoundUserException("Вы не авторизованы");
        }
        User currentUser = this.currentUser;
        if (!checkReceiver(userRec)) {
            throw new NotFoundUserException("Такого пользователя нет");
        }
        User userReceiver = receiverIn(userRec);
        System.out.println("Введите сообщение");
        String text = scannerChat.nextLine();
        currentUser.saveMessage(new Message(currentUser, userReceiver, text), false);
        userReceiver.saveMessage(new Message(currentUser, userReceiver, text), true);
        System.out.println("Сообщение отправлено");
    }

    public void readMessage() throws NullPointerException {
        Message[] messages = currentUser.getMessageDataBase();
        for (Message message : messages) {
            if (message.isIncoming()) {
                System.out.printf("Пьсьмо от %s: Содержание: %s\n",
                        message.getSender().getLogin(), message.getTextMessage());
            } else {
                System.out.printf("Пьсьмо к %s: Содержание: %s\n",
                        message.getReceiver().getLogin(), message.getTextMessage());
            }
        }
    }

    public void start() {
        Chat:
        while (true) {
            printCommand();
            String command = scannerChat.nextLine();
            switch (command) {
                case SIGN_IN:
                    try {
                        loginUser();
                    } catch (NotFoundUserException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    break;
                case NOW_USER:
                    createUser();
                    break;
                case SIGN_OUT:
                    exitUser();
                    break;
                case SEND_MESSAGE:
                    try {
                        sendMessage();
                    } catch (NotFoundUserException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    break;
                case READ_MESSAGE:
                    try {
                        readMessage();
                    } catch (NullPointerException e) {
                        break;
                    }
                    break;
                case EXIT:
                    break Chat;
                default:
                    System.out.println("Неверная команда, введите заного");
            }
        }
    }

    private boolean checkReceiver(String receiver) {
        for (User user : users) {
            if (user.getLogin().equals(receiver)) {
                return true;
            }
        }
        return false;
    }

    private User receiverIn(String receiver) {
        for (User user : users) {
            if (user.getLogin().equals(receiver)) {
                return user;
            }
        }
        return null;
    }

    private boolean checkCorrectUser(User user, String login, String password) {
        try {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("Есть такой пользователь");
                return true;
            }
        } catch (NullPointerException e) {
            return false;
        }
        return false;
    }

    private void printCommand() {
        System.out.println("Введите команду чата");
        System.out.println("Список команд:");
        System.out.println(SIGN_IN);
        System.out.println(SIGN_OUT);
        System.out.println(NOW_USER);
        System.out.println(SEND_MESSAGE);
        System.out.println(READ_MESSAGE);
        System.out.println(EXIT);
        System.out.println("__________________________");
    }
}


