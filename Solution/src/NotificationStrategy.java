import models.Notification;

public interface NotificationStrategy {
    void send(Notification notification);
}
