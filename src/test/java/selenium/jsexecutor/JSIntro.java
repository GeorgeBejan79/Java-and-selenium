package selenium.jsexecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSIntro {
    WebDriver driver;
    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void test1(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.amazon.com'");
        WebElement searchBar=(WebElement)js.executeScript("return document.getElementById('twotabsearchtextbox')");
        // searchBar.sendKeys("iphone 12");
        js.executeScript("return document.getElementById('twotabsearchtextbox').value='Searching for java programming book'");
    }
    @Test
    public void scrollTest(){

        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;

        //scroll down the web page
        js.executeScript("window.scrollBy(0,600)");
    }
    @Test
    public void scrollTest2(){

        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;

        //it is highlight the field  you are searching
        js.executeScript("window.scrollBy(0,document.body.scrollHeight/2)");

        }
    @Test
    public void scrollTest3(){

        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement mustSeeDeals=driver.findElement(By.xpath("//h2[.='Must-see fashion deals']"));
        js.executeScript("arguments[0].scrollIntoView();",mustSeeDeals); //scroll until you find must see Webelement

        }
    }

