package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test5 extends BaseTest {
    By inputForm = By.xpath("//a[text()='Input Forms']");
    By selectDropDownList = By.xpath("//div[@id='easycont']//a[text()='Select Dropdown List']");
    By selectListDemo = By.xpath("//select[@id='select-demo']");
    By selectFriday = By.xpath("//select[@id='select-demo']//option[@value='Friday']");
    By daySelected = By.xpath("//p[@class='selected-value']");

    @Test
    public void checkDaySelected() {
        $(inputForm).shouldBe(visible).click();
        $(selectDropDownList).shouldBe(visible).click();
        $(selectListDemo).shouldBe(visible).click();
        $(selectFriday).shouldBe(visible).click();
        String expectedResult = "Day selected :- Friday";
        $(daySelected).shouldHave(text(expectedResult));
    }
}
