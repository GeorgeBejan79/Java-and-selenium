package selenium.windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsIntro {
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
        driver.get("https://google.com");
        //String currentWindowId=driver.getWindowHandle();
        WebElement searchBox = driver.findElement(By.name("q"));
        actions.sendKeys(searchBox, "java programming" + Keys.ENTER).perform(); // search for java ..

        WebElement _3rdLink = driver.findElement(By.partialLinkText("Learn Java Programming - Programiz"));  //
        //can be done with xpath "//span[text()='Learn Java Programing - Programiz']"
        actions.keyDown(Keys.SHIFT).click(_3rdLink).keyUp(Keys.SHIFT).perform();

        String currentWindowId = driver.getWindowHandle(); // first window
        Set<String> allWindowIds = driver.getWindowHandles();//iterates to all windows id's
        String newWindowId = "";
        for (String id : allWindowIds
        ) {
            if (!id.equals(currentWindowId)) {  // checks if a new window is open
                newWindowId = id;  // if id is different then that means that the id belongs to new open window
            }
        }
        //switch to a second window
        driver.switchTo().window(newWindowId); // all the elements of the new window are available to use

        //operations on new browser
        WebElement header = driver.findElement(By.tagName("h1"));
        Assert.assertEquals(header.getText(), "Learn Java Programming");

        driver.switchTo().window(currentWindowId);//switch to original page
        Thread.sleep(2000);
        WebElement wikilink = driver.findElement(By.xpath("//h3[.='Java (programming language) - Wikipedia']"));

        //open link in new window
        actions.keyDown(Keys.SHIFT).click(wikilink).keyUp(Keys.SHIFT).perform(); //open link in new window

        currentWindowId = driver.getWindowHandle();
        allWindowIds = driver.getWindowHandles(); //reassignment
        String thirdWindowId = "";

        for (String id : allWindowIds) {
            if (!id.equals(currentWindowId) && !id.equals(newWindowId)) {
                thirdWindowId = id;
            }
        }
        driver.switchTo().window(thirdWindowId);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        //Thread.sleep(3000);
        WebElement _4rdLink = driver.findElement(By.xpath("//h3[.='Introduction to Java - W3Schools']"));
        //actions.keyDown(Keys.SHIFT).click(_3rdLink).keyUp(Keys.SHIFT).perform();
        actions.keyDown(Keys.SHIFT).click(_4rdLink).keyUp(Keys.SHIFT).perform();
    }
}