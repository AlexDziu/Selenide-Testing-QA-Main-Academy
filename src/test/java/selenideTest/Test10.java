package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test10 extends BaseTest {
    By table = By.xpath("//li[@class='tree-branch'][3]");
    By tableFilter = By.xpath("//ul[@id='treemenu']//a[text()='Table Filter ']");
    By orangeButton = By.xpath("//button[@class='btn btn-warning btn-filter']");
    By orange1 = By.xpath("//*/tbody/tr[2]/td[3]/div/div/h4/span");
    By orange2 = By.xpath("//*/tbody/tr[5]/td[3]/div/div/h4/span");

//    @Test
    public void checkOrangeSmile() {
        $(table).shouldBe(visible).click();
        $(tableFilter).shouldBe(visible).click();
        $(orangeButton).shouldBe(visible).click();
        String expectedColor = "#f0ad4e";
        String color = $(orange1).getCssValue("color");
        String color2 = $(orange2).getCssValue("color");
        String actualColor = Color.fromString(color).asHex();
        String actualColor2 = Color.fromString(color2).asHex();
        $(orange1).shouldHave(cssValue("color", actualColor));
        $(orange2).shouldHave(cssValue("color", actualColor2));
    }
}
