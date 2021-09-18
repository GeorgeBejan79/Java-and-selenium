package selenium.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotIntro {
    //sniping tool to take screenshots
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void screenshotTest() throws IOException {

        driver.get("https://google.com");
        File firstScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotFolder = "screenshot/";
        FileUtils.copyFile(firstScreenshotFile,
                new File(screenshotFolder + "myScreenshot-" + System.currentTimeMillis() + ".png"));   // allows you to copy one file from one location to another
    }

    @Test
    public void georgeTest2() {
        driver.get("https://etsy.com");
        Assert.fail(); //  fail the test in order to take a screenshot
    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        if (!result.isSuccess()) { // if the test not successful
            takeScreenshot(result.getName());   // take a screenshot
        }
        driver.quit();
    }

    public void takeScreenshot(String screenshotName) {
        //takes screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenShotDirectory = "screenshot/desktop";
        //copy taken screenshot to screenshot directory
        try {
            FileUtils.copyFile(screenshot,
                    new File(screenShotDirectory + screenshotName + "-" + System.currentTimeMillis() + "png"));
        } catch (IOException ex) {
            System.out.println("Screenshot was not taken");
            ex.printStackTrace();
        }
    }
}
// doesn't create screenshots