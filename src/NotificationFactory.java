public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) return null;

        if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        }
        // Gelecekte buraya Email eklenecek
        throw new IllegalArgumentException("Bilinmeyen tip: " + type);
    }
}
