import models.ChannelType;
import models.Notification;
import models.User;

public class EmailChannel implements NotificationObserver, NotificationStrategy{
    @Override
    public void update(models.Notification notification) {
        if(notification.getChannelType().equals(ChannelType.EMAIL)){
            this.send(notification);
        }

    }

    @Override
    public void send(Notification notification) {
        User user = notification.getUser();
        if(user.getSubscribedChannels().contains(ChannelType.EMAIL)){
            System.out.printf("Sending EMAIL to %s: %s%n", user.getEmail(), notification.getMessage());
        }
        else{
            System.out.println("User is not subscribed to EMAIL channel.");
        }
    }
}

/**
 * SMSChannel is both an Observer and a Strategy.
 * Their job is to listen for the announcement.
 * When they hear it, each one checks if the notification is meant for them and then acts accordingly.
 */