package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
            System.out.println("Navigating to google.com");
        driver.get("https://www.google.com");
        String expectedURL="https://www.google.com/";
        String expectedTitle="Google";

        System.out.println("Asserting the url");
        Assert.assertEquals(expectedURL, driver.getCurrentUrl());
        System.out.println("Asserting the title");
        Assert.assertEquals(expectedTitle, driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));

        Assert.assertEquals(2,2);
        Assert.assertTrue(3>2);
        Assert.assertFalse(driver.getCurrentUrl().contains("facebook"));
    }
}
