# Uygulanan Tasarım Örüntüleri

## Faz 1: Creational Patterns - Factory Method
- **Nerede:** `NotificationFactory` sınıfında uygulandı.
- **Neden:** İstemci kodun (main) hangi somut bildirim sınıfını (SMS/Email) yaratacağını bilmesine gerek kalmaması için seçildi.
- **Ne Kazandırdı:** Nesne yaratma mantığı tek bir merkezde toplandı. Yeni bir bildirim tipi eklemek artık sadece fabrikayı güncellemeyi gerektiriyor, mevcut iş akışını bozmuyor.

## Faz 2: Structural Patterns

### 1. Adapter Pattern
- [cite_start]**Nerede:** `TwitterAdapter` sınıfında uygulandı[cite: 54].
- **Neden:** `ExternalTwitterService` adlı dış kütüphanenin metod isimleri (`postDirectMessage`) bizim `Notification` arayüzümüzle (`sendMessage`) uyumsuzdu. [cite_start]Mevcut sistemi bozmadan bu servisi entegre etmek için seçildi[cite: 53, 59].
- **Ne Kazandırdı:** Dış servisleri sisteme sanki yerli birer bileşenmiş gibi ekleyebildik.

### 2. Decorator Pattern
- [cite_start]**Nerede:** `LogDecorator` sınıfında uygulandı[cite: 54].
- [cite_start]**Neden:** Bildirim sistemine "loglama" özelliği eklemek istedik ancak bu özelliği tüm sınıfları tek tek değiştirerek değil, isteğe bağlı bir katman olarak eklemeyi tercih ettik[cite: 53, 60].
- **Ne Kazandırdı:** Nesnelere dinamik olarak (runtime) yeni sorumluluklar yükleyebilme esnekliği kazandık.
