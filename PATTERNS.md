# Uygulanan Tasarım Örüntüleri

## Faz 1: Creational Patterns - Factory Method
- **Nerede:** `NotificationFactory` sınıfında uygulandı.
- **Neden:** İstemci kodun (main) hangi somut bildirim sınıfını (SMS/Email) yaratacağını bilmesine gerek kalmaması için seçildi.
- **Ne Kazandırdı:** Nesne yaratma mantığı tek bir merkezde toplandı. Yeni bir bildirim tipi eklemek artık sadece fabrikayı güncellemeyi gerektiriyor, mevcut iş akışını bozmuyor.
