package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
public class AmazonStepdefinitions {
    AmazonPage amazonPage= new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Samsung";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {

        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);

    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
        Thread.sleep(2000);
    }


    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {

        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(arananKelime));
    }

    @Given("amazon {string} adresine gider")
    public void amazon_adresine_gider(String istenenAmazonUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("aramaKutusunda {string} aratir")
    public void aramakutusundaAratir(String arananUrun) {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(ConfigReader.getProperty("aranacakUrun")+Keys.ENTER);

    }

    @Then("aramasnuclarinin {string} i??erdigini test eder")
    public void aramasnuclarininI??erdiginiTestEder(String aranacakUrun) {
        AmazonPage amazonPage=new AmazonPage();
     String actualAramaSonucElementi= amazonPage.aramaSonucuElementi.getText();
     Assert.assertTrue(actualAramaSonucElementi.contains(ConfigReader.getProperty("aranacakUrun")));


    }
}
