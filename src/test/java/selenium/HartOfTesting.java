package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HartOfTesting {
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //instantiate chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement horizontalSliderLink = driver.findElement(By.xpath("//a[text()='Horizontal Slider']"));
        horizontalSliderLink.click();
        WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Horizontal Slider')]"));
        String headerText = header.getText();
        String expectedHeaderText = "Horizontal Slider";
        Assert.assertEquals(expectedHeaderText,headerText);


    }
}
