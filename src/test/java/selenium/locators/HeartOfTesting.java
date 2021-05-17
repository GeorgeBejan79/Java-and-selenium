package selenium.locators;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeartOfTesting {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/");
        WebElement horzontalSlider=driver.findElement(By.xpath("//a[text()='Horizontal Slider']"));
        horzontalSlider.click();
                //located header element
        WebElement header=driver.findElement(By.xpath("//h3[contains(text(),'Horizontal Slider')]"));
                //get text from header
        String headerText= header.getText();
        String expectedHeader="Horizontal Slider";
                //validating the header
        Assert.assertEquals(expectedHeader,headerText);

    }
}
