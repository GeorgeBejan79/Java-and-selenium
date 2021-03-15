package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssLocatorIntro {
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        actions=new Actions(driver);
    }
    @Test
    public void test(){
        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement searchBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
                searchBox.sendKeys("java programming");
                // highlight the searchBox element with Yellow
                js.executeScript("arguments[0].setAttribute('style',"+"' background: yellow; border: 2px solid red;')", searchBox);
    }
}

