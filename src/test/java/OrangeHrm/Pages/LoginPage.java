package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private ButtonPage buttonPage;

    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPass;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPage = new ButtonPage(driver);
    }

    public void fillOutLogin(String user, String password){
       this.txtUser.sendKeys(user);
       this.txtPass.sendKeys(password);
       this.buttonPage.btnLogin();
    }
}
