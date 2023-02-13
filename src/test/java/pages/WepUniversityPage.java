package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WepUniversityPage {

 public  WepUniversityPage(){
     PageFactory.initElements(Driver.getDriver(),this);
 }
    @FindBy(xpath = "//h1[text() ='LOGIN PORTAL']")
    public WebElement loginPortalButonu;
    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> companyElementList;

    @FindBy(xpath = "//*[@id='text']")
    public WebElement usernameBoxElement;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBoxElement;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButtonElement;
@FindBy(xpath = "//h1[text()='CONTACT US']")
    public WebElement contactUsLinki;

}
