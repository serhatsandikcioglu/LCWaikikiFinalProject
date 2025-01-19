# Web Otomasyonu Projesi - LCW Alışveriş Otomasyonu

Bu proje, LCW web sitesinde otomatikleştirilmiş alışveriş işlemleri gerçekleştirir. Proje, Selenium, Java, TestNG, ve Maven kullanılarak geliştirilmiştir. Ayrıca, POM (Page Object Model) tasarım deseni kullanılarak kodun okunabilirliği ve sürdürülebilirliği artırılmıştır. Raporlama için Allure Report entegrasyonu yapılmıştır.

## Proje Amacı

Bu projede, LC Waikiki web sitesinin temel işlevselliklerini otomatik olarak test etmek amaçlanmıştır. Kullanıcı deneyimini iyileştirmek ve olası hataları en aza indirmek için test süreçlerinin etkin bir şekilde yürütülmesi hedeflenmiştir.

---

## Proje Gereksinimleri

- **Programlama Dili:** Java
- **Test Araçları:** Selenium, TestNG
- **Build Araçları:** Maven
- **Raporlama:** Allure Report

---

## Proje Senaryosu

### Giriş Adımları

1. **LC Waikiki ana sayfasına gidilir:**
   - URL: https://www.lcw.com/
   - "Giriş Yap" butonuna tıklanır.

2. **Geçerli email ve şifre ile oturum açılır:**

   - Email: `ornek@email.com`
   - Şifre: `password123`


1. **Kategorilerden aşağıdaki adımlar takip edilir:**
   - Çocuk & Bebek > Kız Çocuk (6-14 YAŞ) > Mont ve Kaban


2. **Sol taraftaki filtreleme bölümünden şu filtreler uygulanır:**
   - Beden: 5-6, 6, 6-7
   - Renk: Bej


2. **Sıralama:**
   - Sıralama menüsünden "En Çok Satanlar" seçeneği tercih edilir.

1. **Ürün Detayı:**
   - Listeleme sonucunda ilk sıradaki dördüncü ürünün detay sayfasına gidilir.
   - Bedeni tükenmemiş bir ürün seçilir ve sepete eklenir.

   4. **Sepet Doğrulama:**
   - Speetim sayfasına gidilir.
   - Sepetteki ürünün **adı**, **rengi** ve **adeti** kontrol edilir.
   - Ödeme tutarı, toplam ürün tutarı ile karşılaştırılır.


3. **Favorilere Ekleme:**
   - Ürün kartındaki kalp simgesine tıklanarak ürün favorilere eklenir.



5. **Favoriler Kontrolü:**
   - "Favorilerim" bölümü kontrol edilerek ürünün listelendiği doğrulanır.



![projenin çalışan ekran görüntüsü](https://github.com/user-attachments/assets/c0a6ec69-27aa-4a21-a0a0-64eff95f81be)

---

## Raporlama

Test sonuçları **Allure Report** ile raporlanmıştır. Raporlar, hem başarılı hem de başarısız test durumları için ayrıntılı bilgiler sunar. Raporlara proje dizinine gelerek, aşağıdaki komutla erişebilirsiniz:
```bash
allure serve allure-results
```
![allure report çıktısı](https://github.com/user-attachments/assets/b4bfba31-c278-4264-b5c0-027a9849afd8)


