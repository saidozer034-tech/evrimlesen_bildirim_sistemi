public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email gönderiliyor (" + receiver + "): " + message);
    }
}
