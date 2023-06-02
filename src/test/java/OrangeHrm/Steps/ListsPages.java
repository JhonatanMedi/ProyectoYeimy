package OrangeHrm.Steps;

import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListsPages {

    private WebDriver driver;

    public ListsPages(WebDriver driver) {
        this.driver = driver;
    }

    public void listNationality(String nationality){
        WebElement list = driver.findElement(By.xpath("//div//label[text()='Nationality']//..//..//div//i"));
        list.click();

        WebElement listsNationality = list.findElement(By.xpath("//*[text()='"+nationality+"']"));
        listsNationality.click();
    }

    public void listMarital(String maritalStatus){
        WebElement list = driver.findElement(By.xpath("//div//label[text()='Marital Status']//..//..//div//i"));
        list.click();

        WebElement listsMarital = list.findElement(By.xpath("//*[text()='"+maritalStatus+"']"));
        listsMarital.click();
    }

    public void listCountry(String country){
        WebElement list = driver.findElement(By.xpath("//div//label[text()='Country']//..//..//div//i"));
        list.click();

        WebElement listsCountry = list.findElement(By.xpath("//*[text()='"+country+"']"));
        listsCountry.click();
    }

}
