package selenideTest;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Test9 extends BaseTest {
    By table = By.xpath("//li[@class='tree-branch'][3]");
    By tableDataSearch = By.xpath("//div[@class='container-fluid text-center']//a[text()='Table Data Search']");
    By fieldTasks = By.xpath("//*[@id='task-table-filter']");
    By column1 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[1]");
    By column2 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[2]");
    By column3 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[3]");
    By column4 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[4]");

    @Test
    public void checkRecordAppears() {
        $(table).shouldBe(visible).click();
        $(tableDataSearch).shouldBe(visible).click();
        $(fieldTasks).shouldBe(visible).setValue("Emily John");
        String expectedText1 = "4";
        String expectedText2 = "Bootstrap 3";
        String expectedText3 = "Emily John";
        String expectedText4 = "in progress";
        $(column1).shouldHave(text(expectedText1));
        $(column2).shouldHave(text(expectedText2));
        $(column3).shouldHave(text(expectedText3));
        $(column4).shouldHave(text(expectedText4));
    }
}
