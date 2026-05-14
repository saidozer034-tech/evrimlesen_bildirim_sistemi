public class AnalyticsService implements NotificationObserver {
    @Override
    public void update(String message) {
        System.out.println("[ANALYTICS]: Bildirim trafiği analiz edildi: " + message);
    }
}
