package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.WepUniversityPage;
import utilities.Driver;

import javax.swing.*;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WebUniversityStepdefinitions {
Faker faker=new Faker();
WepUniversityPage wepUniversityPage=new WepUniversityPage();
String ilkSayfaHandleDegeri;
    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {

    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();

        wepUniversityPage.loginPortalButonu.click();
    }
    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
// eger yeni window a geçiyorsa,
// yeni sayfanın window handle değerini kaydetmeliyiz
        Set<String> windowHandlesSeti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri="";
        for (String each : windowHandlesSeti) {
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

    }
    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
        wepUniversityPage.usernameBoxElement.sendKeys(faker.name().username());
    }

    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        wepUniversityPage.passwordBoxElement.sendKeys(faker.internet().password());
    }

    @Then("webunuversity login butonuna basar")
    public void webunuversity_login_butonuna_basar() {
        wepUniversityPage.loginButtonElement.click();
    }

    @And("Popup ta cikan yazinin {string} oldugunu test eder")
    public void popupTaCikanYazininOldugunuTestEder(String AllertYazi) {
        String actualPopUpYazi=Driver.getDriver().switchTo().alert().getText();
        assertEquals(actualPopUpYazi, AllertYazi);

    }
    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
    }

    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {
    assertTrue(wepUniversityPage.contactUsLinki.isDisplayed());
    }


    @Then("acilan tüm sayfayi kapatir")
    public void acilan_tüm_sayfayi_kapatir() {
       Driver.quitDriver();
    }
}
