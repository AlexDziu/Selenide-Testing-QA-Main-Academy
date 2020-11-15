package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class Test11 extends BaseTest {
    By alertModals = By.xpath("//a[text()='Alerts & Modals']");
    By javaScriptAlerts = By.xpath("//li[@style]/a[text()='Javascript Alerts']");
    By javaScriptConfirmBoxClickMe = By.xpath("//div[text()='Java Script Confirm Box']/../div/button");
    By confirmDemo = By.cssSelector("#confirm-demo");

    @Test
    public void checkTextAppears() {
        $(alertModals).shouldBe(visible).click();
        $(javaScriptAlerts).shouldBe(visible).click();
        $(javaScriptConfirmBoxClickMe).shouldBe(visible).click();
        String expectedText = "You pressed Cancel!";
        switchTo().alert().dismiss();
        $(confirmDemo).shouldHave(text(expectedText));

    }
}
