package test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuTest {
    @Test
    public void abTest() {

        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/");
        WebElement abTestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.click();
        String title = driver.getTitle();
        System.out.println("AB test page's title is " + title);

    }

    @Test
    public void dropDownTest() {
        //provide chrome driver location
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        //locate element
        WebElement dropDownLink = driver.findElement(By.xpath("//a[@href='/dropdown']"));

        String dropDownText = dropDownLink.getText();
        System.out.println(dropDownText);


    }

    @Test
    public void test4() {

    System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize(); // opens a window and then maximize it
        driver.quit(); //opens a window and then it close it
        driver.close(); //opens a window and close the current tab

    }
    public void navigate(){
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement abTestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.click();
        //get title of abTest page
        String abTestTitle=driver.getTitle();
            //navigate back
        driver.navigate().back();
            //navigate to checkboxes page
        WebElement checkboxesLink=driver.findElement(By.xpath("//a[href='/checkboxes']"));
        checkboxesLink.click();
            //get title of checkboxes page
        String checkboxesTitle=driver.getTitle();
        System.out.println(abTestTitle);
        System.out.println(checkboxesTitle);
        driver.manage().window();
    }

    //a[@href='dynamic_controls']

}