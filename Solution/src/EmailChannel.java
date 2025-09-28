import models.Notification;

public class EmailChannel implements NotificationObserver, NotificationStrategy{
    @Override
    public void update(models.Notification notification) {
        if(Notification.)
        System.out.println("EmailChannel received notification");
    }

    @Override
    public void send(Notification notification) {

    }
}
