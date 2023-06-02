package OrangeHrm.Definitions;

import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.MyInfoPage;
import OrangeHrm.Pages.PimPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;

public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private PimPage pimPage = new PimPage(driver);
    private MyInfoPage myInfoPage = new MyInfoPage(driver);

    @Given("^the user open brower$")
    public void open_brower() {
        this.conexion = new Conexion();
        this.driver = this.conexion.openBrower();
    }

    @When("^the user fill out user (.*) password (.*)$")
    public void fillOutLogin(String user, String password) {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(user, password);
    }

    @When("^the user select add employee and fill out first name (.*) last name (.*)$")
    public void fillOutAddEmployee(String firstName, String lastName) {
        this.pimPage = new PimPage(driver);
        this.pimPage.optionAddEmployee();
        this.pimPage.fillOutAddEmployee(firstName, lastName);
    }

    @When("^the user updates my information personal detail middle (.*) nationality (.*) marital status (.*)$")
    public void updatePersonalDetails(String middleName, String nationality, String maritalStatus) {
        this.myInfoPage = new MyInfoPage(driver);
        this.myInfoPage.updateMyInfo(middleName, nationality, maritalStatus);
    }

    @Then("^the user validate page Dashboard$")
    public void validateDashboard() {
        this.loginPage = new LoginPage(driver);
        this.loginPage.validateDashboard();
    }
}