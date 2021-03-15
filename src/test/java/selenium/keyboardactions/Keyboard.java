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
        actions.keyDown(Keys.SHIFT).sendKeys(searchField, "t").
                keyUp(Keys.SHIFT).
                sendKeys(searchField, "echtorial academy" + Keys.ENTER).perform();

    }

    @Test
    public void copyPaste() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar, "Java").keyDown(Keys.COMMAND).
                sendKeys("a").
                sendKeys("c").
                sendKeys("v").
                sendKeys("v").
                sendKeys("a").
                sendKeys("x").
                keyUp(Keys.COMMAND).perform();
    }

    @Test
    public void copyPaste1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar,"iphone 12").keyDown(Keys.COMMAND)
                .sendKeys("a").sendKeys("x").sendKeys("v")
                .sendKeys("v").sendKeys("v")
                .keyUp(Keys.COMMAND).perform();

    }
}