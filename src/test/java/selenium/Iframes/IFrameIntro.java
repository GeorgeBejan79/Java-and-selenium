package selenium.Iframes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameIntro {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");// navigates to website
        WebElement frames = driver.findElement(By.xpath("//a[@href='/frames']"));
        frames.click();             //clicks on the webelement frames
        WebElement nestedFrames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nestedFrames.click();       //clicks on the webelement nested frames
        driver.switchTo().frame("frame-top");
        WebElement leftFrame = driver.findElement(By.xpath("//frame[@src='/frame_middle']"));
        driver.switchTo().frame(leftFrame);         //switches to left frame
        WebElement middleText = driver.findElement(By.id("content"));
        System.out.println(middleText.getText()); // PRINTS THE NAME OF MIDDLE RAME
        driver.switchTo().defaultContent();
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);
        /*WebElement middleFrame = driver.findElement(By.id("content"));
        System.out.println(middleFrame.getText());
        driver.switchTo().parentFrame().switchTo().frame(2);
        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println(body.getText());*/


        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-bottom");
        WebElement bottom = driver.findElement(By.tagName("body"));
        System.out.println(bottom.getText());

    }
    @Test
    public void test2()
    {
        driver.get("https://the-internet.herokuapp.com/");

        WebElement frames = driver.findElement(By.xpath("//a[@href='/frames']"));
        frames.click();

        WebElement nestedFrames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nestedFrames.click();
        driver.switchTo().frame("frame-top");
        WebElement leftFrame = driver.findElement(By.xpath("//frame[@src='/frame_middle']"));
        driver.switchTo().frame(leftFrame);
        WebElement middleText = driver.findElement(By.id("content"));
        System.out.println(middleText.getText()); // PRINTS THE NAME OF MIDDLE FRAME
        driver.switchTo().defaultContent();
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);
    }
}


