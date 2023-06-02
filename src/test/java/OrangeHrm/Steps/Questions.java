package OrangeHrm.Steps;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.junit.Assert;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Questions {

    @FindBy(how = How.XPATH, using = "//nav[@aria-label= 'Sidepanel']")
    private WebElement navOpcion;
    private WebDriver driver;

    public Questions(WebDriver driver) {
        this.driver = driver;
    }
    public void timeSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void validateDashboard() {
        this.navOpcion.isDisplayed();
    }

    public void scrollBtnSave() {
        WebElement btnSave = driver.findElement(By.xpath("//button[text() = ' Save ']"));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true)", btnSave);

    }
}