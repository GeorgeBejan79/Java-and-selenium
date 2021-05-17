package selenium.locators;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {
    @Test
    public void absoluteXpath() {

            //provide chrome driver executable location
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            //instantiate chrome browser
        WebDriver driver = new ChromeDriver();
            //navigate to teh web page
        driver.navigate().to("http://the-internet.herokuapp.com/");

        WebElement horizontalSliderLink = driver.findElement((By.linkText("Horizontal Slider")));
        horizontalSliderLink.click();
        //absolute xpath
        WebElement header = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        System.out.println(header.getText());

        Assert.assertEquals("Temirlan", "Temirlan");
        Assert.assertEquals(21, 21);

//        String textFromPage = "gsaafga";
//        Assert.assertTrue(textFromPage.contains("temirlan"));
    }
}
