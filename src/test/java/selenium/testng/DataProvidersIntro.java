package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class DataProvidersIntro {
    protected WebDriver driver;
    protected Select select;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Parameters({"MRSusername", "MRSpassword"})
    @Test
    public void testData(String userName, String passWord) {
        driver.get("https://demo.openmrs.org/openmrs");
        WebElement usernameBox = driver.findElement(By.id("username"));
        usernameBox.sendKeys(userName);
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys(passWord);
        WebElement inpatientWard = driver.findElement(By.id("Inpatient Ward"));
        inpatientWard.click();
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
//        WebElement logOut= driver.findElement(By.xpath("openmrs/appui/header/logout.action?successUrl=openmrs"));
//        logOut.click();
    }

    @Test(dataProvider = "MRSTestData")
    public void testData2(String username, String password) {
        driver.get("https://demo.openmrs.org/openmrs");
        WebElement usernameBox = driver.findElement(By.id("username"));
        usernameBox.sendKeys(username);
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys(password);
        WebElement inpatientWard = driver.findElement(By.id("Inpatient Ward"));
        inpatientWard.click();
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();


    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @DataProvider(name = "MRSTestData")
    public Object[][] getTestData() {
        return new Object[][]{
                {"admin123", "invalidPassword"},
                {"invalidUsername", "Admin123"},
                {" ", " "},
                {"admin123", " "},
                {" ", "Admin123"},
                {"invalidUseranme", "invalidPassword"},
                {"techtorial", "techtorial123"},
                {"Admin123", "admin"}};
    }
}
