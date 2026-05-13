public abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification notification) {
        this.decoratedNotification = notification;
    }

    @Override
    public void sendMessage(String message, String receiver) {
        decoratedNotification.sendMessage(message, receiver);
    }
}
