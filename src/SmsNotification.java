public class SmsNotification implements Notification {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS gönderiliyor (" + receiver + "): " + message);
    }
}
