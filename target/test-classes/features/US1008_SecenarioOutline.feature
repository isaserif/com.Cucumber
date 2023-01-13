
Feature: US1008 Scenario Outline ile birden fazla data icin test calistirma

  Scenario Outline:TC13 Scenario Outline ile amazonda arama yapabilmeli
    # Amazon anasayfaya gidelim. Nutella,Java, ve Samsung için arama yapıp
    #arama sonuclarinin aradiğimiz kelimeyi içerdiğini test edelim
    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "<arananUrun>" yazip aratir
    Then arama sonuclarinin "<arananUrun>" icerdigini test eder
    Then sayfayi kapatir

    Examples:
    |arananUrun|
    |Nutella   |
    |Samsung   |
    |Aple      |
    |Java      |