package selenium.keyboardactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
    @Test
    public void allUppercase() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).// press shift in order to write with caps
                sendKeys(searchField, "t"). //types t
                keyUp(Keys.SHIFT).// shift again for lower case
                sendKeys(searchField, "echtorial academy" + Keys.ENTER).perform();
    }
    @Test
    public void copyPaste() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar, "java").keyDown(Keys.CONTROL).
                sendKeys("a").
                //copy
                sendKeys("c").
                //paste
                sendKeys("v").
                //paste
                sendKeys("v").
                //relise Control button on keyboard
                keyUp(Keys.CONTROL).perform();
    }
    @Test
    public void copyPaste1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar,"iphone 12").keyDown(Keys.CONTROL)
                .sendKeys("a").
                sendKeys("x").
                sendKeys("v").
                sendKeys("v").
                sendKeys("v").
                keyUp(Keys.CONTROL)
                .sendKeys(Keys.ENTER)
                .perform();
    }
}