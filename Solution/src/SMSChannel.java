public class SMSChannel implements NotificationObserver, NotificationStrategy{
    @Override
    public void update(models.Notification notification) {
        if(notification.getChannelType().equals(models.ChannelType.SMS)){
            this.send(notification);
        }

    }

    @Override
    public void send(models.Notification notification) {
        models.User user = notification.getUser();
        if(user.getSubscribedChannels().contains(models.ChannelType.SMS)){
            System.out.printf("Sending SMS to %s: %s%n", user.getName(), notification.getMessage());
        }
        else {
            System.out.println("User is not subscribed to SMS channel.");
        }
    }
}
