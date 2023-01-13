
Feature: US1009 Yanlis kullanici adi ve password listesi ile negatif login testi
  Scenario Outline: TC14 Yanlis  kullanici listesi ile giris yapılamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    Then kullanci kutusuna manuel olarak "<yanlisUsername>" yazar
    Then pasword kutusuna manuel olarak"<yanlisPassword>"yazar
    Then login butonuna basar
    Then giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir

    Examples:
    |yanlisUsername|yanlisPassword|
    |ilker          |ilker@a.com  |
    |mehmet         |mehmet@a.com  |
    |isa            |isa@a.com  |
    |ozgur          |ozgur@a.com  |