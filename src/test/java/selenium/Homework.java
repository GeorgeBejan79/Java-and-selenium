package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Homework {

    //1. Navigate to herokuapp
//2. Naviagate to Hovers page
//3. Go back
//4. Navigate to Notification Message page
//5. Go to home page
//6. Navigate to Context Menu page
//7. Print out the Header of Context Menu page
//8. Navigate to Home page
//9. Navigate to File Uploader page
//10. Print out all text from File Uploader page
    public class HomeWorkOne {
        @Test
        public void Test2() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            WebDriver driver = new ChromeDriver(); // opens google chrome
            driver.get("http://the-internet.herokuapp.com/");
            WebElement HoverPageLink = driver.findElement(By.xpath("//a[@href='/hovers']"));
            HoverPageLink.click();
            driver.navigate().back();
            WebElement NotificationLink = driver.findElement(By.xpath("//a[@href='/notification_message']"));
            NotificationLink.click();
            driver.navigate().back();
            WebElement ContextLink = driver.findElement(By.xpath("//a[@href='/context_menu']"));
            ContextLink.click();
            String ContextTestTitle = driver.findElement(By.xpath("//h3['Context Menu']")).getText();
            System.out.println(ContextTestTitle);
            driver.navigate().back();
            WebElement FileUploadLink = driver.findElement(By.xpath("//a[@href='/upload']"));
            FileUploadLink.click();
        }
    }
}

