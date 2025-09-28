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

        NotificationObserver emailObserver = new EmailNotificationObserver(user);
        NotificationObserver smsObserver = new SMSNotificationObserver(user);
        NotificationObserver pushObserver = new PushNotificationObserver(user);



    }
}