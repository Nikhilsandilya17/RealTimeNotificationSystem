import models.Notification;
import models.User;

public class PushChannel implements NotificationStrategy, NotificationObserver{

    @Override
    public void update(Notification notification) {
        if(notification.getChannelType().equals(models.ChannelType.PUSH)){
            this.send(notification);
        }
    }

    @Override
    public void send(Notification notification) {
        User user = notification.getUser();
        if(user.getSubscribedChannels().contains(models.ChannelType.PUSH)){
            System.out.printf("Sending PUSH to %s: %s%n", user.getName(), notification.getMessage());
        }
        else{
            System.out.println("User is not subscribed to PUSH channel.");
        }
    }
}
