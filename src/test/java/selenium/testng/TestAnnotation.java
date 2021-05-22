package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotation {
    WebDriver driver;

    @BeforeClass
    public void classSetup() {
        System.out.println("Before class hook is executed");
    }

    @AfterClass
    public void classCleanup() {
        System.out.println("After class hook is executed");
    }

    @BeforeMethod //hook
    public void setup() {
        System.out.println("Before method hook is executed");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method hook is executed");
        driver.quit();
    }

    @Test(priority = 10, enabled = false) //enable false --> to cancel run of the test
    public void googleTest() {
        System.out.println("Executing google test");

        driver.get("https://google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test(priority = 1, invocationCount = 3) //invocation count will run test for the amount specified
    public void techtorialTest() {

        System.out.println("Executing techtorial test");
        driver.get("http://techtorialacademy.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("techtorial"));
    }
}




