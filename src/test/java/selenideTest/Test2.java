package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test2 extends BaseTest {
    By inputForm = By.xpath("//a[text()='Input Forms']");
    By simpleFormDemo = By.xpath("//*[@id='treemenu']//a[text()='Simple Form Demo']");
    By enterA = By.xpath("//form[@id='gettotal']//input[@id='sum1']");
    By enterB = By.xpath("//form[@id='gettotal']//input[@id='sum2']");
    By buttonGetTotal = By.xpath("//form[@id='gettotal']//button[@class='btn btn-default']");
    By totalResult = By.xpath("//*[@id='displayvalue']");

    @Test
    public void checkTotalNumbers() {
        $(inputForm).shouldBe(visible).click();
        $(simpleFormDemo).shouldBe(visible).click();
        String addNumber = "2";
        String addNumber2 = "8";
        String expectedResult = "10";
        $(enterA).setValue(addNumber);
        $(enterB).setValue(addNumber2);
        $(buttonGetTotal).shouldBe(visible).click();
        $(totalResult).shouldHave(text(expectedResult));
    }
}
