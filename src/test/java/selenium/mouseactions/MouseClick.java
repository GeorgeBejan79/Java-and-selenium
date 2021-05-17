package selenium.mouseactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

        @Test
       public void doubleclickTest2()  {
            WebDriverManager.firefoxdriver().setup();
            WebDriver firefox= new FirefoxDriver();
            firefox.get("https://www.demo.guru99.com/test/simple_context_menu.html");
            String currentTitle=firefox.getTitle();
            Assert.assertEquals("Simple Context Menu",currentTitle);
            WebElement doubleClickButton=firefox.findElement(By.xpath
                    ("//button[@ondblclick='myFunction()']"));
            Actions actions=new Actions(firefox);
            actions.doubleClick(doubleClickButton).perform();

        }
    }

