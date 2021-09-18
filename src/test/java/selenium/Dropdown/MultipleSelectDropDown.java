package selenium.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MultipleSelectDropDown
{

    @Test
    public void test1()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement multiOptionDD = driver.findElement(By.id("multiple-select-example"));
        Select ddHandler = new Select(multiOptionDD);
        boolean isMultiSelect = ddHandler.isMultiple();
        if (isMultiSelect) { //if is multiple select will chose 0 and 1 indexes
            ddHandler.selectByIndex(0);
            ddHandler.selectByIndex(1);
        }
    }

    @Test
    public void test2() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement dd = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(dd);
        boolean isMultiSelect = select.isMultiple();
        if (isMultiSelect) {
            select.selectByValue("apple");
            select.selectByValue("peach"); // ask to select two fields
        }
        List<WebElement> selectedOptionList = select.getAllSelectedOptions(); // this is showing the list with options
        //fail fast approach, important to validate the total number of selected options First
        //before validating the selected values
        Assert.assertEquals(2, selectedOptionList.size()); // tests if all the fields were selected

        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("Apple");
        expectedValues.add("Peach");

        for (WebElement element : selectedOptionList)
        {
            Assert.assertTrue(expectedValues.contains(element.getText())); // check if selected values are in expected list
        }
    }

    @Test
    public void test3() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement dd = driver.findElement(By.id("multiple-select-example"));
        Select ddHandler = new Select(dd);
        ddHandler.selectByVisibleText("Orange");
        ddHandler.selectByVisibleText("Peach");
        Thread.sleep(1000);
        ddHandler.deselectByVisibleText("Orange");
        ddHandler.deselectByVisibleText("Peach");
        Thread.sleep(1000);
        ddHandler.deselectByIndex(2);
        ddHandler.deselectAll();
    }
}


