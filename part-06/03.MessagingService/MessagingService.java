import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messagesList;

    public MessagingService() {
        this.messagesList = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280 &&
            !this.messagesList.contains(message)) {
            this.messagesList.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messagesList;
    }

}
