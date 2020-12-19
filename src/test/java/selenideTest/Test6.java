package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test6 extends BaseTest {
    By inputForm = By.xpath("//a[text()='Input Forms']");
    By selectDropDownList = By.xpath("//div[@id='easycont']//a[text()='Select Dropdown List']");
    By getAllSelected = By.xpath("//button[@id='printAll']");
    By optionSelectedAre = By.xpath("//p[@class='getall-selected']");
    By multiSelect = By.name("States");

    @Test
    public void checkText() {
        $(inputForm).shouldBe(visible).click();
        $(selectDropDownList).shouldBe(visible).click();
        String expectedText = "Options selected are : Florida";
        $(multiSelect).selectOption(1);
        $(getAllSelected).shouldBe(visible).click();
        $(optionSelectedAre).shouldBe(text(expectedText));
    }
}
