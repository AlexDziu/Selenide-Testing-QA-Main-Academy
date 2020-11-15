package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test12 extends BaseTest {
    By listBox = By.xpath("//a[text()='List Box']");
    By bootstrapListBox = By.xpath("//li[@style]/a[text()='Bootstrap List Box']");
    By selectMorbiLeoRisus = By.xpath("//div[contains(@class,'list-left')]//li[text()='Morbi leo risus']");
    By buttonInRight = By.className("move-right");
    By listRight = By.xpath("//div[contains(@class,'list-right')]//li[text()='Morbi leo risus']");

//    @Test
    public void checkTwoOptionsOnTheRight() {
        $(listBox).shouldBe(visible).click();
        $(bootstrapListBox).shouldBe(visible).click();
        $(selectMorbiLeoRisus).shouldBe(visible).click();
        $(buttonInRight).shouldBe(visible).click();

    }
}
