import models.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements NotificationSubject{

    private static NotificationService instance;

    public static NotificationService getInstance() {
        if(instance == null){
            return new NotificationService();
        }
        return instance;
    }

    private List<NotificationObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for(NotificationObserver notificationObserver: observers){
            notificationObserver.update(notification);
        }
    }
}
