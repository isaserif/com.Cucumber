package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Guru99Stepdefinitions {
    List<String>companyListStr;
Guru99Page guru99Page=new Guru99Page();
    @Given("guru99 cookies kabul eder")
    public void guru99_cookies_kabul_eder() {

    }
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        List<WebElement> companyList=guru99Page.companyElementList;
        companyListStr= ReusableMethods.getElementsText(companyList);
        System.out.println(companyListStr);
    }
    @Then("{string} in listede oldugunu test eder")
    public void in_listede_oldugunu_test_eder(String istenenCompany) {
        assertTrue(companyListStr.contains(istenenCompany));

    }



}
