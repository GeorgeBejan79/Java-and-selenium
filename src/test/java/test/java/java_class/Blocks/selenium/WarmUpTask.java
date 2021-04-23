package test.java.java_class.Blocks.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe"); // for windows users has to have exe at the end
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        String expectedURL="https://www.google.com/";
        String expectedTitle="Google";

        Assert.assertEquals(expectedURL,driver.getCurrentUrl());
        Assert.assertEquals(expectedTitle,driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

        Assert.assertEquals(2,2);
        Assert.assertTrue(3 > 2);
        Assert.assertFalse(driver.getCurrentUrl().contains("facebook"));


    }
}