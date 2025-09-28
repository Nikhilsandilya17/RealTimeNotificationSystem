import models.ChannelType;
import models.Notification;
import models.User;

import java.util.UUID;

public class RealTimeNotificationSystemDemo {
    public static void main(String[] args) {
        NotificationService notificationService = NotificationService.getInstance();
        // Create observers and subscribe them to the notification service

        User user = new User("nikhil@gmail.com", "Nikhil", UUID.randomUUID().toString());
        user.subscribeChannel(ChannelType.EMAIL);
        user.subscribeChannel(ChannelType.PUSH);

        NotificationObserver emailChannel = ChannelFactory.getChannel(ChannelType.EMAIL);
        NotificationObserver smsChannel = ChannelFactory.getChannel(ChannelType.SMS);
        NotificationObserver pushChannel = ChannelFactory.getChannel(ChannelType.PUSH);

        notificationService.subscribe(emailChannel);
        notificationService.subscribe(smsChannel);
        notificationService.subscribe(pushChannel);

        notificationService.sendNotification(new Notification("This is a EMAIL", ChannelType.EMAIL, user));
        notificationService.sendNotification(new Notification("This is SMS", ChannelType.SMS, user));
        notificationService.sendNotification(new Notification("This is PUSH", ChannelType.PUSH, user));


    }
}