import models.Notification;

public interface NotificationSubject {
    void subscribe(NotificationObserver observer);
    void unsubscribe(NotificationObserver observer);
    void notifyObservers(Notification notification);
}

/**
 * The Subject interface (part of the Observer Pattern).
 */