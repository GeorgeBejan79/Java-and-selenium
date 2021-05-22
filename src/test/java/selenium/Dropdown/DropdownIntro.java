package selenium.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownIntro {
    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown); // is a constructor witch pass dropDown
        select.selectByVisibleText("Option 2");
    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select dropDownHandler = new Select(allDropDown); //constructor
        dropDownHandler.selectByVisibleText("Books"); //select options from dropdown
    }

    @Test
    public void test3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select dropDownHandler = new Select(dropdown);
        dropDownHandler.selectByIndex(2);// select by index from dropdown
    }

    @Test
    public void test4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select dropDownHandler = new Select(dropdown);
        List<WebElement> listOfOptions = dropDownHandler.getOptions(); //create a list with options
        for (WebElement option : listOfOptions) {
            System.out.println(option.getText()); // print options in dropdown
        }
    }

    @Test
    public void test5() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select dropDownHandler = new Select(allDropDown); //pass element to select class
        List<WebElement> allOptions = dropDownHandler.getOptions();// get all options from the dropdown
        System.out.println(allOptions.size());
        int count = 0;
        for (WebElement option : allOptions) {
            System.out.println(count + ". " + option.getText()); //print all the options
            count++;
        }
    }

    @Test
    public void test6() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement dropdown = driver.findElement(By.id("carselect"));
        Select dropdownHandler = new Select(dropdown);
        dropdownHandler.selectByVisibleText("Honda");
        WebElement selectedOption = dropdownHandler.getFirstSelectedOption();
        Assert.assertEquals("Honda", selectedOption.getText());
    }

    @Test
    public void test7() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement dropdown = driver.findElement(By.id("carselect"));
        Select dropDownHandler = new Select(dropdown);
        dropDownHandler.selectByValue("benz");
        WebElement firstSelectedOption = dropDownHandler.getFirstSelectedOption();
        Assert.assertEquals("Honda", firstSelectedOption.getText());
    }
    @Test
    public void test8() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.amazon.com");
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select dropDownHandler = new Select(dropdown);
        dropDownHandler.selectByValue("search-alias=instant-video"); // selects prime video from drop down
        WebElement firstSelectedOption = dropDownHandler.getFirstSelectedOption(); // is getting option for prime video
        Assert.assertEquals("Prime Video", firstSelectedOption.getText()); //checks if those values are equal


    }
}
