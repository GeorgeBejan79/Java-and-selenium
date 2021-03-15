package selenium.alerts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;
public class AlertsIntro {
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        actions=new Actions(driver);
    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement javaScriptAlertLink = driver.findElement(
                By.xpath("//a[text()='JavaScript Alerts']"));
        actions.keyDown(Keys.SHIFT).click(javaScriptAlertLink).perform();
        String firstWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        String secondWindowHandle = "";
        for (String id : allWindowHandles) {
            if (!id.equals(firstWindowHandle)) {
                secondWindowHandle = id;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        simpleAlert.click();
        //handle alert
        //simple alert
        driver.switchTo().alert().accept();
        //confirmation alert
        WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirmAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        //prompt alert
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptAlert.click(); // click alert
        Thread.sleep(2000);
        Alert promptAlertWindow = driver.switchTo().alert();
        promptAlertWindow.sendKeys("Techtorial academy");
        Thread.sleep(2000);
        promptAlertWindow.accept();
        }
    }

