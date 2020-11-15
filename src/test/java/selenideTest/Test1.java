package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Test1 extends BaseTest{
    By inputForm = By.xpath("//a[text()='Input Forms']");
    By simpleFormDemo = By.xpath("//*[@id='treemenu']//a[text()='Simple Form Demo']");
    By inputElement = By.xpath("//input[@id='user-message']");
    By buttonShowMassage = By.xpath("//form[@id='get-input']//button[@class='btn btn-default']");
    By yourMassage = By.xpath("//span[@id='display']");

    @Test
    public void checkYourMassage() {
        $(inputForm).shouldBe(visible).click();
        $(simpleFormDemo).shouldBe(visible).click();
        String expectedText = "Hello, my name is Sasha";
        $(inputElement).setValue(expectedText);
        $(buttonShowMassage).shouldBe(visible).click();
        $(yourMassage).shouldHave(text(expectedText));
    }
}
