Feature: US1005 Kullanici bastaki ortak adimlar icin Background kullanir

  Background: Tum scenario'lar icin ortak ilk adim
    Given kullanici amazon anasayfaya gider

  Scenario: TC03 Kullanici Parametreli method ile Nutella aratir

    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC04 Kullanici Parametreli method ile Java aratir

    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 Kullanici Parametreli method ile Samsung aratir

    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin "Samsung" icerdigini test eder
    And sayfayi kapatirFeature: US1005 Kullanici configuration.properties'de yazilan datalari parametre olarak kullanir
  # 3 Scenario olusturup, amazon,wisequarter ve walmart anasayfalarina gidin
  # ve o anasayfalara gittigimizi test edin
  # parametre olarak kullandigimiz kelimeler direk testte kullanilacak datalar olabilecegi gibi
  # configuration.properties'de bulunan key'ler de olabilir
  # Bu durumda stepdefinition'da yolladigimiz key ile
  # ConfigReader'daki getProperty() kullanilip
  # configuration.properties dosyasindaki value testte kullanilabilir

  Scenario: TC06 Kullanici amazon sitesine gidisi test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then url de "amazon" oldugunu test eder
    And sayfayi kapatir


  Scenario: TC07 Kullanici wisequarter sitesine gidisi test eder

    Given kullanici "wqUrl" anasayfaya gider
    Then url de "wisequarter" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC08 Kullanici walmart sitesine gidisi test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then url de "walmart" oldugunu test eder
    And sayfayi kapatir