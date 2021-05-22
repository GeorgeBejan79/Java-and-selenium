package selenium.mouseactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
    @Test
    public void test1(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver firefox=new FirefoxDriver();
        firefox.get("http://demo.guru99.com/test/simple_context_menu.html");
        String currentTitle= firefox.getTitle();

        Assert.assertEquals(currentTitle,"Simple Context Menu");
        WebElement doubleClick=firefox.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions= new Actions(firefox);
        actions.doubleClick(doubleClick).perform();
    }

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
        @Test
    public void draggableElementsTest(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=3604e");
            WebElement draggableElement1=driver.findElement(By.id("pnl_header"));
            Actions actions=new Actions(driver);
            actions.dragAndDropBy(draggableElement1,200,-230).perform();


        }
        @Test
    public void draggableElementsTest2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=3604e");
        WebElement draggableElement=driver.findElement(By.id("pnl_header"));
        WebElement destinationElement=driver.findElement(By.id("handlepnl_content"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(draggableElement,destinationElement).perform();

        }
    }

