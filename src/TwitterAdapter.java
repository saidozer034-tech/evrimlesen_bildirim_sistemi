public class TwitterAdapter implements Notification {
    private ExternalTwitterService twitterService;

    public TwitterAdapter(ExternalTwitterService twitterService) {
        this.twitterService = twitterService;
    }

    @Override
    public void sendMessage(String message, String receiver) {
        // Bizim metodumuz çağrıldığında, arka planda dış servisin metodunu çalıştırıyoruz
        twitterService.postDirectMessage(message, receiver);
    }
}
