package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPage;
import OrangeHrm.Steps.ListsPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

    private ButtonPage buttonPage;
    private Questions questions;

    private ListsPages listsPages;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddleName;

    public MyInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPage = new ButtonPage(driver);
        this.questions = new Questions(driver);
        this.listsPages = new ListsPages(driver);
    }

    public void updateMyInfo(String middleName, String nationality, String maritalStatus) {
        this.buttonPage.btnMyInfo();
        this.questions.timeSeconds(6);
        this.txtMiddleName.sendKeys(Keys.CLEAR);
        this.txtMiddleName.sendKeys(middleName);
        this.listsPages.listNationality(nationality);
        this.listsPages.listMarital(maritalStatus);
        this.questions.scrollGender();
        this.buttonPage.btnSave();
    }

    public void assertUpdatePersonalDetails(String nationality, String maritalStatus) {
        this.questions.scrollPersonalDetails();
        this.questions.timeSeconds(1);
        this.questions.assertUpdatePersonalDetails(nationality, maritalStatus);
    }
}
