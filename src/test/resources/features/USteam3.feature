

Feature: USfree Kullanici amazon anasayfaya gider
  Scenario: Kullanici  adresine gider
    Given amazon "amazonUrl" adresine gider
    Then aramaKutusunda "aranacakUrun" aratir
    Then aramasnuclarinin "aranacakUrun" içerdigini test eder
    And sayfayi kapatir