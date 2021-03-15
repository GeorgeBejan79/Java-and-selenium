package selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.Base;

public class HomeworkPractice extends Base {
    @Test
    public void test(){
        driver.get("https://www.audiusa.com/us/web/en.html");
        WebElement SuvButton=driver.findElement(By.xpath("//span[text()='SUVs & Wagons'][1]"));
        SuvButton.click();
    }
}
