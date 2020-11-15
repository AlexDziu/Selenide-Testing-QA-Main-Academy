package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test4 extends BaseTest {
    By inputForm = By.xpath("//a[text()='Input Forms']");
    By radioButtonsDemo = By.xpath("//*[@id='treemenu']//a[text()='Radio Buttons Demo']");
    By sexMale = By.xpath("//div[@class='col-md-6 text-left']//div[2]//div[2]//div//input[@value='Male']");
    By ageGroup = By.xpath("//input[@value='15 - 50']");
    By getValuesButton = By.xpath("//*[@onclick='getValues();']");
    By resultMessage = By.xpath("//p[@class='groupradiobutton']");

    @Test
    public void checkMessageSex() {
        $(inputForm).shouldBe(visible).click();
        $(radioButtonsDemo).shouldBe(visible).click();
        $(sexMale).shouldBe(visible).click();
        $(ageGroup).shouldBe(visible).click();
        $(getValuesButton).shouldBe(visible).click();
        String expectedResult = "Sex : Female Age group: 5 - 15";
        $(resultMessage).shouldNotHave(text(expectedResult));
    }
}
