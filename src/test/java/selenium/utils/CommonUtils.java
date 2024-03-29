package selenium.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class CommonUtils {

    public static void handleDDByText(WebElement dd, String text){
        Select select =new Select(dd);
        select.selectByVisibleText(text);
    }
    public static void handleDDByIndex(WebElement dd, int index){
        Select select=new Select(dd);
        select.selectByIndex(index);
    }

    public static void handleDDByValue(WebElement dd, String value){

        Select select =new Select(dd);
        select.selectByValue(value);
    }

    public static void hoverOver(WebDriver driver, WebElement element){

        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();

    }
    public static void moveElement(WebDriver driver,WebElement elementSource, WebElement elementTarget){
        Actions actions=new Actions(driver);
        actions.clickAndHold(elementSource).moveToElement(elementTarget).release().perform();
    }
    public  static void SwitchWindow(WebDriver driver){    //method for two windows
        String currentWindow= driver.getWindowHandle();
       Set<String> allWindowHandles= driver.getWindowHandles();

        for (String handle:allWindowHandles) {
            if(currentWindow.equals(handle)){
                driver.switchTo().window(handle);
            }
        }
    }
    public static WebElement locateElement(WebDriver driver, WebElement element){
        WebDriverWait wait =new WebDriverWait(driver,10);
        WebElement myElement=wait.until(ExpectedConditions.visibilityOf(element));
        return myElement;
    }
    public  static void ScrollToElement(WebDriver driver, WebElement element){

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView,", element);
    }
    public static void ScrollToBottom(WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

    }
    public static void takeScreenShot(WebDriver driver, String screenshotName){
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destinationDir="screenshot/";
                try{
        FileUtils.copyFile(file, new File(destinationDir + screenshotName + System.currentTimeMillis()));
    }catch (IOException ex){
                    System.out.println("Failed to take a screenshot: " + ex.getStackTrace());
                }
    }
    public  static String readProperty(String fileName, String key){
        File propFile=new File(fileName); // you read from property file using property file-->interview question
        Properties properties=new Properties();
        try{
        properties.load(new FileInputStream(propFile));
    }catch(IOException exception){
            new RuntimeException("Could not read from properties file: "+fileName);
        }
        return properties.getProperty(key);
}}
