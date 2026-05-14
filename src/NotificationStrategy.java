public interface NotificationStrategy {
    void formatAndSend(String message, Notification notification, String receiver);
}
