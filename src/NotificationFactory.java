package src;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) return null;
        
        return switch (type.toUpperCase()) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            case "TWITTER" -> new TwitterAdapter(new ExternalTwitterService());
            default -> throw new IllegalArgumentException("Bilinmeyen tip: " + type);
        };
    }
}
