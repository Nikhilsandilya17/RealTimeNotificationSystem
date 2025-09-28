import models.Notification;

public interface NotificationObserver {
    void update(Notification notification);
}

/**
 * The Observer interface (part of the Observer Pattern).
 * Their job is to listen for the announcement.
 */