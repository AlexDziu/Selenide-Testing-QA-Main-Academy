package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test14 extends BaseTest {
    By listBox = By.xpath("//a[text()='List Box']");
    By jqueryListBox = By.xpath("//li[@style]/a[text()='JQuery List Box']");
    By selectPickData = By.cssSelector("select.pickData");

    @Test
    public void checkNamesAppearsInTheRightList() {
        $(listBox).shouldBe(visible).click();
        $(jqueryListBox).shouldBe(visible).click();
        $(selectPickData).selectOption(2, 5, 8);
    }
}
