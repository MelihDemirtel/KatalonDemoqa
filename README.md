# KatalonDemoqa

## Proje Hakkında

**KatalonDemoqa**, [demoqa.com](https://demoqa.com/) web sitesinde yer alan çeşitli UI test senaryolarını otomatikleştirmek için Katalon Studio kullanılarak hazırlanmış bir test otomasyon projesidir. Bu proje, farklı buton türleri, formlar ve diğer web bileşenlerini otomatik olarak test ederken, Katalon'un temel yeteneklerini de göstermektedir.

## İçindekiler

- [Kullanılan Teknolojiler](#kullanılan-teknolojiler)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)
- [Test Senaryoları](#test-senaryoları)
- [Katkıda Bulunanlar](#katkıda-bulunanlar)
- [Sürüm Bilgileri](#sürüm-bilgileri)
- [Lisans](#lisans)

## Kullanılan Teknolojiler

Bu projede aşağıdaki teknolojiler ve araçlar kullanılmıştır:

- **Katalon Studio**: Test otomasyonu için kullanılan IDE.
- **Groovy**: Katalon içinde kullanılan test senaryolarının yazıldığı dil.
- **Selenium WebDriver**: Web sayfaları üzerinde etkileşim sağlamak için kullanılan araç.
- **Git**: Sürüm kontrol sistemi.

## Kurulum

Proje ortamını kurmak için aşağıdaki adımları izleyebilirsiniz:

### 1. Katalon Studio Kurulumu

1. [Katalon Studio](https://www.katalon.com/download/) indirin ve bilgisayarınıza kurun.
2. Katalon Studio'yu başlatın ve bir hesap oluşturun veya mevcut hesabınızla giriş yapın.

### 2. Projenin Kopyalanması

1. Git'i bilgisayarınıza kurun.
2. Terminal veya komut satırını açın.
3. Projeyi klonlamak için aşağıdaki komutu kullanın:

    ```sh
    git clone https://github.com/MelihDemirtel/KatalonDemoqa.git
    ```

4. Katalon Studio'da `File > Open Project` seçeneğiyle klonladığınız projeyi açın.

### 3. Gereksinimlerin Kurulumu

Projede kullanılan kütüphane ve bağımlılıkları kurmak için herhangi bir ek işlem yapmanıza gerek yoktur. Katalon Studio, gerekli tüm bağımlılıkları projenize dahil eder.

## Kullanım

Projedeki test senaryolarını çalıştırmak için:

1. Katalon Studio'da projeyi açın.
2. Sol taraftaki `Test Cases` sekmesi altında bulunan test senaryolarını görüntüleyin.
3. Herhangi bir test senaryosunu çalıştırmak için senaryoya tıklayın üst bardan Run butonuna basın ya da "ctrl+shift+a" kısayolunu kullanın.
4. Herhangi bir test suitini çalıştırmak için suite tıklayın üst bardan Run butonuna basın ya da "Ctrl+Shift+A" kısayolunu kullanın.
5. Test sonuçlarını `Reports` sekmesi altında görüntüleyebilirsiniz.

### CI/CD Entegrasyonu

Proje, Jenkins ile entegre edilebilir. Jenkins üzerinde bu projeyi otomatikleştirmek için bir `Jenkinsfile` oluşturabilir ve test senaryolarını sürekli entegrasyon (CI) süreçlerine dahil edebilirsiniz.

## Test Senaryoları

Projedeki test senaryoları, demoqa.com sitesinde ki alanları test eder:

Her test senaryosu, belirli bir kullanıcı senaryosunu doğrulamak amacıyla tasarlanmıştır ve Katalon Studio'nun test adımlarıyla uyumludur.

## Katkıda Bulunanlar

- **Melih Demirtel** - [GitHub Profil](https://github.com/MelihDemirtel)

Projeye katkıda bulunmak isteyenler, GitHub'da bir `fork` oluşturarak, değişikliklerini `pull request` ile sunabilirler.

## Sürüm Bilgileri

- **v1.0.0** - İlk sürüm. Temel test senaryoları oluşturuldu ve demoqa.com üzerinde test edildi.

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasını inceleyebilirsiniz.