package selenium.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Practice {
    /*@Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String expectedURL="https://www.ebay.com/";
        System.out.println("test");
        String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
        System.out.println("test1");
        Assert.assertEquals(expectedURL,driver.getCurrentUrl()); //checks the url
        Assert.assertEquals(expectedTitle,driver.getTitle());//checks the title

        WebElement allCategories = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));

        Select dropDownHandler = new Select(allCategories);
        allCategories.click();

        List<WebElement> allOptions =dropDownHandler.getOptions();

        System.out.println(allOptions.size());

        for(WebElement option: allOptions){
            System.out.println(option.getText());
        }*/
            @Test
        public void test3(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver1 =new ChromeDriver();
             driver1.get("https://learn.letskodeit.com/p/practice");
            WebElement dropDown=driver1.findElement(By.id("carselect"));
            Select  dropDownHandler=new Select(dropDown);
            dropDownHandler.selectByVisibleText("Honda");
            WebElement selectedOption=dropDownHandler.getFirstSelectedOption();
            assertEquals("Honda", selectedOption.getText());
        }
        @Test
    public void test4(){
                WebDriverManager.chromedriver().setup();
                WebDriver chrome =new ChromeDriver();
                chrome.get("https://learn.letskodeit.com/p/practice");
                WebElement dropDown=chrome.findElement(By.id("carselect"));
                Select dropDownHandler=new Select(dropDown);
                dropDownHandler.selectByValue("benz");

                WebElement firstSelectedOption=dropDownHandler.getFirstSelectedOption();
                assertEquals("Benz",firstSelectedOption.getText());
        }
        @Test
    public void test5(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver =new ChromeDriver();
            driver.get("https://www.amazon.com/");

            WebElement dropDown =driver.findElement(By.id("searchDropdownBox"));

            Select dropDownHandler=new Select(dropDown);

            dropDownHandler.selectByValue("search-alias=instant-video");

            WebElement firstSelectedOption=dropDownHandler.getFirstSelectedOption();
            assertEquals("Prime Video",firstSelectedOption.getText());
        }

    }

