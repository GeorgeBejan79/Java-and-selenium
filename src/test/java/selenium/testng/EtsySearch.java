package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.utils.Base;

import java.util.List;

public class EtsySearch {
    public class EtsyPage extends Base {
        private WebDriver driver;
        private SoftAssert softAssert;

        @BeforeMethod
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            softAssert = new SoftAssert();
        }

        @Parameters({"searchCriteria"})
        @Test
        public void etsySearch(String mySearch) {   //this one is the search criteria and can have diff names
            //softAssert=new SoftAssert();
            driver.navigate().to("https://www.etsy.com/"); // or you can do driver.get()....

            WebElement searchField = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
            Assert.assertTrue(driver.getCurrentUrl().contains("etsy"));
            searchField.sendKeys(mySearch + Keys.ENTER);
            driver.findElement(By.xpath("//buton[@value='Search']")).click();

            List<WebElement> itemLinks = driver.findElements
                    (By.xpath("//h3[@class='text-gray text-truncate mb-xs-0 text-body ']"));
            //java programming mug
            String[] strArr = mySearch.split("");  //splits string in 3 elements
            String java = strArr[0];
            String programming = strArr[1];
            String mug = strArr[2];

            for (WebElement itemLink : itemLinks) {
                String temp = itemLink.getText();
                //java programing mug
                System.out.println(temp);
                //softAssert.assertTrue(temp.contains("java"));
                softAssert.assertTrue(temp.contains(java) || temp.contains(programming) || temp.contains(mug));
            }
            //if(results.contains(("java")||("mug")||("programing")){
            softAssert.assertAll();

        }
    }
}
