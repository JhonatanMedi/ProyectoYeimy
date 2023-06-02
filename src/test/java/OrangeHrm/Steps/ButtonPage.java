package OrangeHrm.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {

    private Questions questions;
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

    public ButtonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.questions = new Questions(driver);
    }

    public void btnLogin() {
        this.btnLogin.isDisplayed();
        this.questions.timeSeconds(1);
        this.btnLogin.click();
    }

    public void btnPim() {
        this.btnPim.isDisplayed();
        this.questions.timeSeconds(1);
        this.btnPim.click();
    }

    public void btnAdd() {
        this.btnAdd.isDisplayed();
        this.questions.timeSeconds(1);
        this.btnAdd.click();
    }

    public void btnSave() {
        this.questions.timeSeconds(1);
        this.btnSave.isDisplayed();
        this.questions.timeSeconds(1);
        this.btnSave.click();
    }

    public void btnMyInfo() {
        this.btnMyInfo.isDisplayed();
        this.questions.timeSeconds(1);
        this.btnMyInfo.click();
    }
}
