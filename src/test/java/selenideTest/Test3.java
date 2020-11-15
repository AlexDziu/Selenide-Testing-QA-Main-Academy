package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test3 extends BaseTest {
    By inputForm = By.xpath("//a[text()='Input Forms']");
    By checkboxDemo = By.xpath("//div[@id='easycont']//a[text()='Checkbox Demo']");
    By option1 = By.xpath("//label[text()='Option 1']//input");
    By option3 = By.xpath("//label[text()='Option 3']//input");
    @Test
    public void checkedCheckbox() {
        $(inputForm).shouldBe(visible).click();
        $(checkboxDemo).shouldBe(visible).click();
        $(option1).shouldBe(visible).setSelected(true);
        $(option3).shouldBe(visible).setSelected(true);
        $(option1).shouldBe(selected);
        $(option3).shouldBe(selected);

    }
}
