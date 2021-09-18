package selenium.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HerokuappPractice {
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setup1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);

    }

    @Test
    public void herokuappTest() {
        driver.get("http://the-internet.herokuapp.com/");
        WebElement abTest = driver.findElement(By.xpath("//a[@href='/abtest']"));
        actions.click(abTest).perform();
        //takeScreenshot("abTestPage");
        //WebElement expectedTitle=driver.findElement(By.xpath("//div[@class='example']/child::h3"));
        String expectedTitle = "A/B Test Control";
        //String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }
}