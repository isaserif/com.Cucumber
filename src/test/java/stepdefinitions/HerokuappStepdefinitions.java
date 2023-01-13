package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.HerokuappPage;

public class HerokuappStepdefinitions {

  HerokuappPage herokuappPage=new HerokuappPage();
    WebElement deleteButton;

    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonu.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() throws InterruptedException {
    Thread.sleep(2000);
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        WebElement deleteButton= herokuappPage.deleteButonu;
        Assert.assertTrue(deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
    herokuappPage.deleteButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        int flag=3;

        try {
            herokuappPage.deleteButonu.click();
            Assert.assertNotEquals(3, flag);
            // exception olusmazsa bekledigimiz durum gerceklesmedi demektir
            // bu durumda test failed olmali
            // bunun icin 36.satirda failed olacak bir assertion yazdim
        } catch (NoSuchElementException e) {
            Assert.assertEquals(3, flag);
            // 35.satirda delete butonu gorunmuyorsa exception olusur
            // bu bizim bekledigimiz durum oldugundan testin passed olmasi gerekir
            // exception olusunca onu catch ile yakaladik ve
            // 41.satirda PASSED olacak bir assertion yazdik

        }





    }



}
