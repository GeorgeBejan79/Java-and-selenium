package selenium.syncronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitIntro {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test() {

        driver.get("https://google.com");
        // by fluent wait you can catch elements that appears and disappear
        Wait<WebDriver> fluentWait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(30)).   // wait for 30 seconds
                pollingEvery(Duration.ofSeconds(2)).   //checks every 2 sec
                ignoring(NoSuchElementException.class);  //ignoring noSuchElementException
        WebElement temirlanElement = fluentWait.until(driver1 -> driver1.findElement(By.id("temirlan")));
    }
}
