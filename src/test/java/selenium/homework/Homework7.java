package selenium.homework;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Homework7  {

    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }


   @Test
    public void test(){
       SoftAssert softAssert;
       driver.get("https://www.audiusa.com/us/web/en.html");
       driver.manage().window().maximize();
        //browser= CommonUtils.readProperty("src/test/resources/configurations.properties","browser");
       //driver=DriverUtils.getDriver(browser);
        WebElement SuvButton=driver.findElement(By.xpath("//span[text()='SUVs & Wagons'][1]"));
        SuvButton.click();

        /*List<WebElement> prices=driver.findElements(By.xpath(""));
        for (WebElement price:prices) {
            String
        }*/
        /*WebElement audiQ5= driver.findElement(By.xpath("//span[text()='2021 Q5']"));
        audiQ5.click();
        WebElement audiQFiveYear =driver.findElement(By.xpath("//h1[text()='\t\t\t\t\t\t\t2021 Audi Q5']"));
        String actualText=audiQFiveYear.getText();
        String expectedText= "2021 Audi Q5";
       Assert.assertEquals(expectedText,actualText);*/
    }
}
