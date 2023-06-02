package OrangeHrm.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {

    @FindBy(how = How.XPATH, using = "//button[@type= 'submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//a//span[text() = 'PIM']")
    private WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//button[text() = ' Add ']")
    private WebElement btnAdd;

    @FindBy(how = How.XPATH, using = "//button[text() = ' Save ']")
    private WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//a//span[text() = 'My Info']")
    private WebElement btnMyInfo;
    public ButtonPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void btnLogin(){
        this.btnLogin.isDisplayed();
        this.btnLogin.click();
    }

    public void btnPim(){
        this.btnPim.isDisplayed();
        this.btnPim.click();
    }

    public void btnAdd(){
        this.btnAdd.isDisplayed();
        this.btnAdd.click();
    }

    public void btnSave(){
        this.btnSave.isDisplayed();
        this.btnSave.click();
    }

    public void btnMyInfo(){
        this.btnMyInfo.isDisplayed();
        this.btnMyInfo.click();
    }
}
