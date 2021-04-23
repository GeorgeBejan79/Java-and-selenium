package test.java.java_class.Blocks.selenium.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.cars.com/");
        WebElement NewAndUsedCars = driver.findElement(By.xpath("//select[@name='stockType']"));
        NewAndUsedCars.click();

        Select dropDownHandler = new Select(NewAndUsedCars);
        List<WebElement> allOptions =dropDownHandler.getOptions();
        System.out.println(allOptions.size());



        WebElement stokeType=driver.findElement(By.xpath("//select[@name='stockType']"));
        Select select1=new Select(stokeType);
        select1.selectByVisibleText("New Cars");// or I can use select by index

        WebElement maxPrice=driver.findElement(By.xpath("//select[@aria-label='Select a maximum price']"));
        Select maxPrice1=new Select(maxPrice);
        maxPrice1.selectByVisibleText("$175,000");
        //select[@aria-label='Select a maximum price']

        WebElement make=driver.findElement(By.xpath("//select[@aria-label='Make']"));
        Select make1=new Select(make);
        make1.selectByVisibleText("Lamborghini");
        //select[@aria-label='Make']

        WebElement radius=driver.findElement(By.xpath("//select[@aria-label='Select a maximum distance']"));
        Select radius1=new Select(radius);
        radius1.selectByVisibleText("All Miles from");

        WebElement zip=driver.findElement(By.xpath("//input[@name='zip']"));
        zip.sendKeys("60659");

        WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
        search.click();
    }
}
