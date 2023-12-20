package ord.example.homework.four.ex4;

import java.util.Date;

public class Message {

    private final User sender;
    private final User receiver;
    private boolean isIncoming;
    private final String textMessage;
    private final Date date;

    public Message(User sender, User receiver, String textMessage) {
        this.sender = sender;
        this.receiver = receiver;
        this.textMessage = textMessage;
        this.date = new Date();
    }

    public void setIncoming(boolean incoming) {
        isIncoming = incoming;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public boolean isIncoming() {
        return isIncoming;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Message{"
                + "FROM:" + sender
                + ", TO" + receiver
                + ", ON:" + date
                + ", isIncoming:" + isIncoming
                + ", Текст сообщения'" + textMessage + '\''
                + '}';
    }
}
