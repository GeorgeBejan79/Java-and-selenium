package test.java.java_class.Maps.java_class.Blocks.selenium.project1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task2 {
    @Test
    public void Task2() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //connect to desired webpage
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userNameLink = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNameLink.sendKeys("Tester");
        WebElement passwordLink= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordLink.sendKeys("test");
        WebElement loginLink= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginLink.click();
        WebElement viewAllProducts= driver.findElement(By.xpath("//a[@href='Products.aspx']"));
        viewAllProducts.click();
        String expectedAllProducts= driver.getCurrentUrl();
        String actualAllProducts= "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx";
        Assert.assertEquals(expectedAllProducts,actualAllProducts);

        WebElement headerLink= driver.findElement(By.tagName("h2"));
        String actualHeader=headerLink.getText();
        String expectedHeader= "List of Products";
        Assert.assertEquals(actualHeader,expectedHeader);

        String actualUrl= driver.getCurrentUrl();

        String expectedUrl= "Products";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        driver.close();

    }
}