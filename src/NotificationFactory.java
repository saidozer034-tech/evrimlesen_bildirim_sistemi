public class NotificationFactory {
    public static Notification createNotification(String type) {
<<<<<<< phase-3
        if (type == null) return null;
        return switch (type.toUpperCase()) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Bilinmeyen tip: " + type);
        };
=======
        if (type == null || type.isEmpty()) return null;

        if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        }
        // Gelecekte buraya Email eklenecek
        throw new IllegalArgumentException("Bilinmeyen tip: " + type);
>>>>>>> main
    }
}
