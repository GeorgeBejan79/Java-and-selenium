package selenium.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.Pages.HerokuApp.DropDownPage;
import selenium.Pages.HerokuApp.HerokuAppHomePage;

public class DropDownTest
{

    WebDriver driver;
    HerokuAppHomePage herokuAppHomePage;
    DropDownPage dropdownPage;

    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        herokuAppHomePage = new HerokuAppHomePage(driver);
        dropdownPage = new DropDownPage(driver);
    }

    @Test
    public void test1()
    {
//        driver.get("http://the-internet.herokuapp.com/");
//        herokuAppHomePage.dropdownLink.click();
//
//        String header = dropdownPage.dropdownPageHeader.getText();
//        Assert.assertTrue(driver.findElement(By.xpath("//h3")).getText().contains("Dropdown"));
    }
}
