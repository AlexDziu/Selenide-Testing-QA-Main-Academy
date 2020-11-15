package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test7 extends BaseTest {
    By inputForm = By.xpath("//a[text()='Input Forms']");
    By ajaxFormSubmit = By.xpath("//ul[@id='treemenu']//ul//a[text()='Ajax Form Submit']");
    By submitButton = By.xpath("//input[@id='btn-submit']");
    By fieldName = By.xpath("//input[@id='title']");

    @Test
    public void checkName() {
        $(inputForm).shouldBe(visible).click();
        $(ajaxFormSubmit).shouldBe(visible).click();
        $(submitButton).shouldBe(enabled).click();
        String expectedColor = "rgb(255, 0, 0)";
        $(fieldName).shouldHave(cssValue("borderColor", expectedColor));

    }
}
