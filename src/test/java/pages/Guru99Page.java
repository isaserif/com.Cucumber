package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Guru99Page {
    public Guru99Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> companyElementList;

@FindBy(xpath = "//*[@id='text']")
    public WebElement usernameBoxElement;

@FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBoxElement;

@FindBy(xpath = "login-button")
    public WebElement loginButtonElement;




}