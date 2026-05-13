public class LogDecorator extends NotificationDecorator {
    public LogDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("[LOG]: Bildirim süreci başlatıldı. Alıcı: " + receiver);
        super.sendMessage(message, receiver);
    }
}
