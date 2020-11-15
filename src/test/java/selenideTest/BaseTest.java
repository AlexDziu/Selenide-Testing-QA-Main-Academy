package selenideTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    By windowAlert = By.xpath("//*[@id='at-cv-lightbox-close']");

    @BeforeClass
    public static void beforeClass() {
        Configuration.baseUrl = "https://www.seleniumeasy.com/";
        Configuration.startMaximized = true;
    }

    @Before
    public void beforeTest() {
        open("test");
        try {
            WebDriver webDriver = WebDriverRunner.getWebDriver();
            WebDriverWait wait = new WebDriverWait(webDriver, 6);
            wait.until(ExpectedConditions.visibilityOfElementLocated(windowAlert)).click();
        } catch (Exception e) {
            System.out.println("Window is not open");
        }
    }

    @After
    public void afterTest() {
        Selenide.closeWebDriver();
    }
}
