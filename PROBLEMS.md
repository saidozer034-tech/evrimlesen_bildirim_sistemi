# Faz 0: Mevcut Tasarım Sorunları

Bu projeye başlarken, tüm bildirim mantığı tek bir sınıf içinde ve karmaşık kontrol yapılarıyla kurgulanmıştır. Tespit edilen sorunlar:

1. **Sıkı Bağlılık (Tight Coupling):** SMS ve E-posta gönderim mantığı birbirine karışmış durumda.
2. **Açık/Kapalı Prensibi İhlali (OCP):** Yeni bir bildirim türü (örn: WhatsApp) eklemek için mevcut kodu değiştirmek gerekiyor.
3. **Tek Sorumluluk İlkesi İhlali (SRP):** Tek bir sınıf hem karar verme hem de gönderim süreçlerini yönetiyor.
4. **Bakım Zorluğu:** if-else blokları büyüdükçe hata yapma riski artıyor.
5. ## AI Karşılaştırması (Faz 0)
AI ile yapılan tartışma sonucunda listeme şu eklemeler yapılmıştır:
- **Liskov Substitution Prensibi:** Mevcut yapıda farklı bildirim tipleri aynı arayüzü paylaşmadığı için birbirinin yerine geçemiyor.
- **Yaratım Karmaşıklığı:** Nesne yaratma mantığı (new anahtar kelimesi) istemci kodun içinde, bu da esnekliği öldürüyor.

  
"Faz 3 sonunda GitHub Actions ve Merge Conflict süreçleri başarıyla yönetilmiştir."
