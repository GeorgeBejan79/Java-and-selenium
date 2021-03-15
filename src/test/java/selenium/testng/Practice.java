package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Practice {
    @BeforeClass
    public void bfClass(){
        System.out.println("BF class");
    }

    WebDriver driver;
    @BeforeMethod
    public void BfMethod(){
        System.out.println("Bf method......");
        System.out.println("before method hook is executed");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("after method ....");
    }
    @Test
    public void navigateAmazon(){
        System.out.println("Executing Amazon test");

        driver.get("https://www.amazon.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
    }
    @Test
    public void navigateEbay(){
        System.out.println("Executing ebay test");

        driver.get("https://www.ebay.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class method");
        driver.quit();
    }


}
