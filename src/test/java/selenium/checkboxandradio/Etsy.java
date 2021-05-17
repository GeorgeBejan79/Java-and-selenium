package selenium.checkboxandradio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://etsy.com");
        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();
        Thread.sleep(3000);
        WebElement shipIn1Day = driver.findElement(By.xpath("//label[@for='max-processing-days-1']"));
        shipIn1Day.click();

        Thread.sleep(2000);
        shipIn1Day = driver.findElement(By.xpath("//label[@for='max-processing-days-1']/preceding-sibling::input"));

        Assert.assertTrue(shipIn1Day.isSelected());
        WebElement shipIn3Day = driver.findElement(By.xpath("//label[@for='max-processing-days-3']"));
        shipIn3Day.click();

        shipIn3Day = driver.findElement(By.xpath("//label[@for='max-processing-days-3']/preceding-sibling::input"));
        Assert.assertTrue(shipIn3Day.isSelected());
    }

    @Test
    public void test2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
        Assert.assertFalse(bmwRadio.isSelected());
        bmwRadio.click();
        Assert.assertTrue(bmwRadio.isSelected());
        //or
        Assert.assertEquals(true, bmwRadio.isSelected());
        WebElement benzRadio = driver.findElement(By.id("benzradio"));
        Assert.assertEquals(false, benzRadio.isSelected());
        //or we can do assertFalse assertion
        Assert.assertFalse(benzRadio.isSelected());

        WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
        Assert.assertEquals(false, hondaRadio.isSelected());
        Assert.assertFalse(hondaRadio.isSelected());

    }
}
