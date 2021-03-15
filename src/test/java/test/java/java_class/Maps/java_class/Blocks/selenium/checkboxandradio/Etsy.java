package test.java.java_class.Maps.java_class.Blocks.selenium.checkboxandradio;

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

        //driver.manage().window().maximize();
        WebDriver driver = new ChromeDriver();
        driver.get("https://etsy.com");
        //driver.get("https://etsy.com");
        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();

        Thread.sleep(2000); // to slow down test for website to catch up
        WebElement shipIn1Day = driver.findElement(By.xpath("//label[@for='max-processing-days-1']"));
        shipIn1Day.click();

        Thread.sleep(2000);
        shipIn1Day = driver.findElement(By.xpath("//label[@for='max-processing-days-1']/preceding-sibling::input"));
        //shipIn1Day.click();

        Assert.assertTrue(shipIn1Day.isSelected());

        WebElement shipIn3Days = driver.findElement(By.xpath("//label[@for='max-processing-days-3']"));
        //driver.findElement(By.xpath("//label[for='max-processing-days-3']"));
        shipIn3Days.click();
        shipIn3Days = driver.findElement(By.xpath("//label[for='max-processing-days-3']/preceding-sibling::input"));
        Assert.assertTrue(shipIn3Days.isSelected());
    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement bmwradio = driver.findElement(By.id("bmwradio"));

        Assert.assertTrue(bmwradio.isSelected());
        bmwradio.click();
        Assert.assertEquals(true,bmwradio.isSelected());
        Assert.assertTrue(bmwradio.isSelected());

        WebElement benzRadio= driver.findElement(By.id("benzradio"));
        Assert.assertEquals(false,benzRadio.isSelected());
        Assert.assertFalse(benzRadio.isSelected());

        WebElement hondaRadio= driver.findElement(By.id("benzradio"));
        Assert.assertEquals(false,hondaRadio.isSelected());
        Assert.assertFalse(hondaRadio.isSelected());
    }
}