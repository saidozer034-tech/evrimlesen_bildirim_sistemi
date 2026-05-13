public class UrgentNotification implements NotificationStrategy {
    @Override
    public void formatAndSend(String message, Notification notification, String receiver) {
        // Mesajı büyük harfe çevirip başına [ACİL] ekliyoruz
        notification.sendMessage("[ACİL] " + message.toUpperCase(), receiver);
    }
}
