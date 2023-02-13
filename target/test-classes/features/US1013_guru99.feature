
Feature:US1013 Kullanici Web tablosunda istedigi degerin varligini test eder

  Scenario: TC18 Kullanici tablodan deger test edebilmeli

    Given kullanici "guru99URL" anasayfaya gider
    Then Company listesini consola yazdirir
    And "Bata India" in listede oldugunu test eder
