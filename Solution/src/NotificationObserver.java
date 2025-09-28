import models.Notification;

public interface NotificationObserver {
    void update(Notification notification);
}
