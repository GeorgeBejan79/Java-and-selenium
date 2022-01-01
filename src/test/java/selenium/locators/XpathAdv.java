package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdv {
    @Test
    public void test1()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement checkedbox1 = driver.findElement(By.xpath("//*[@type='checkbox']/preceding-sibling::input"));
        //WebElement checkedbox2 = driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::input"));
        checkedbox1.click();
        boolean isChecked = checkedbox1.isSelected();
        Assert.assertTrue(isChecked); // checks if the box is checked or not
    }

    @Test
    public void test2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkedbox2 = driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::input"));
        checkedbox2.click();
        boolean isChecked = checkedbox2.isSelected();
        Assert.assertFalse(isChecked);

    }
    @Test
    public void test3()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");//navigates to web page
        WebElement checkedbox1 = driver.findElement(By.xpath("//*[@type='checkbox']/preceding-sibling::input"));

        boolean isChecked = checkedbox1.isSelected();
        if (!isChecked)
        {
            checkedbox1.click();   //check if the first box is selected if not it will check it
            Assert.assertTrue(checkedbox1.isSelected());
        }
        WebElement checkedbox2 = driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::input"));
        boolean isChecked2 = checkedbox2.isSelected();
        if (isChecked2) {  ////check if the second box is selected if it is will uncheck it
            checkedbox2.click();
            Assert.assertFalse(checkedbox2.isSelected());
        }
    }
}