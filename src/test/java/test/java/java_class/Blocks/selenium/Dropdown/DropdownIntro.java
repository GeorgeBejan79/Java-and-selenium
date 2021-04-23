package test.java.java_class.Blocks.selenium.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
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
        driver.get("http://the-internet.herokuapp.com/");
        //select[@aria-describedby='searchDropdownDescription']"dropdown"));

        //Select select = new Select(dropdown);
        //select.selectByVisibleText("Option 1");
    }
    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com/");
        WebElement allDropDown=driver.findElement(By.id("searchDropdownBox"));
        Select dropDownHandler=new Select(allDropDown);

        dropDownHandler.selectByVisibleText("Baby");// works
}
    @Test
    public void test3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        WebElement dropdown=driver.findElement(By.id("Dropdown"));
        Select dropDownHandler= new Select(dropdown);
        dropDownHandler.selectByIndex(1);
}
    @Test
    public void test4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement option = driver.findElement(By.id("searchDropdownBox"));
        Select dropDownHandler = new Select(option);
        List<WebElement> listOptions = dropDownHandler.getOptions();
        //dropDownHandler.selectByIndex(4); //works
        //for (WebElement option : listOptions) {
            System.out.println(option.getText());
        }

        @Test
        public void test5() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com");
            WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));// finds element dropdown
           Select dropDownHandler = new Select(allDropDown);
           List<WebElement> allOptions = dropDownHandler.getOptions();
            System.out.println(allOptions.size());
            for(WebElement option: allOptions){
                System.out.println(option.getText());
            }


    }
}