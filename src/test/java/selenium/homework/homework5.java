package selenium.homework;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homework5 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
    @Test
    public void demosTelerik() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        Assert.assertTrue(driver.getCurrentUrl().contains("demos"));
        WebElement circle=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement orangeSquare= driver.findElement(By.xpath("//div[@class='test2']"));
        WebElement blueSquare= driver.findElement(By.xpath("//div[@class='test1']"));

        Actions actions=new Actions(driver);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        actions.clickAndHold(circle).moveByOffset( -100,0).perform();
        WebElement orangeBoxText= driver.findElement(By.xpath("//div[@class='test2']"));  //doesn't pass
        String expectedText="(Drop here)";
        Assert.assertEquals(orangeBoxText,expectedText);

        Actions dragAndDrop = actions.clickAndHold(circle).moveToElement(orangeSquare);
        dragAndDrop.perform();

            System.out.println("test1");
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        Assert.assertTrue(driver.getCurrentUrl().contains("demos"));
        WebElement circle=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement orangeSquare= driver.findElement(By.xpath("//div[@class='test2']"));
        WebElement blueSquare= driver.findElement(By.xpath("//div[@data-role='droptargetarea']/child::div[1]"));
        Actions actions=new Actions(driver);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        actions.clickAndHold(circle).dragAndDrop(circle,blueSquare).perform();
        String expectedText="Now you can drop it.";
        Assert.assertEquals(blueSquare,expectedText);
        //actions.release().perform();

        Thread.sleep(3000);
        driver.close();
    }

}
