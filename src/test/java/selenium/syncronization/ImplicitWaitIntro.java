package selenium.syncronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitIntro {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // will wait up to 10 seconds until elements with find method will be available
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // implicit wait

    }

    @Test
    public void test() {
        driver.get("https://google.com");
        driver.findElement(By.id("foo"));
    }

    @Test
    public void test2() {
        driver.get("https://facebook.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Facebook - Log in or Sign Up"));

    }

    @Test
    public void test3() {

        driver.get("http://techtorialacademy.com");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement applyButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//temirlan")));
        WebElement applyButtonAlt = locateMyElement(By.xpath("//temirlan"), 3);

    }

    public void clickOn(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public WebElement locateMyElement(By locator) { //pass a locator
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement locatedElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return locatedElement;

    }

    public WebElement locateMyElement(By locator, int timeout) { //pass a locator
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement locatedElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return locatedElement;

    }

}
