package selenium.locators;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

    @Test
    public void test1() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com"); /// access amazon.com
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));//find search box
        driver.manage().window().maximize();

        searchBox.sendKeys("iphone 12" + Keys.ENTER);
        WebElement search = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        search.click();
        WebElement text = driver.findElement(By.xpath("//span[@class='a-size-large qa-title-text']"));
        String fileUploaderText = text.getText();
        System.out.println(fileUploaderText);
    }

    @Test
    public void text2() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com"); /// access amazon.com
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone 12" + Keys.ENTER);
        WebElement iphone = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        iphone.click();
        WebElement iphoneHeader = driver.findElement(By.xpath("//span[@class='a-size-large qa-title-text']"));
        String text = iphoneHeader.getText();
        System.out.println(text);
    }

    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.etsy.com");
        WebElement searchField = driver.findElement(By.id("global-enhancements-search-query"));
        searchField.sendKeys("Java book" + Keys.ENTER);
        String currentURL = driver.getCurrentUrl();
        System.out.println("current URL is " + currentURL);
        String expectedUrl = "https://www.etsy.com/search?q=Java%20book";
        //Assert.assertTrue(expectedUrl, currentURL);
    }

    @Test
    public void test4() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        WebElement firstNameField = driver.findElement(By.name("firstName"));
        firstNameField.sendKeys("George" + Keys.ENTER);
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Fantastic" + Keys.ENTER);
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("773-532-4356");
        WebElement email = driver.findElement(By.name("userName"));
        email.sendKeys("bhf@yahoo.com");
        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("2200 W Irving park", Keys.ENTER);
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Paris", Keys.ENTER);

    }

    @Test
    public void tagNameLocator() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement abTestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.click();
        WebElement abTestHeader = driver.findElement(By.tagName("h3")); //search web element by tag name
        System.out.println(abTestHeader.getText());
        String currentUrl = driver.getCurrentUrl(); // finds current url
        System.out.println(currentUrl);

        WebElement elementalSelenium = driver.findElement(By.xpath("//a[@href='http://elementalselenium.com/']"));
        elementalSelenium.click();

        System.out.println(elementalSelenium.getText());
        String expectedHeader = "Elemental Selenium";
        Assert.assertTrue(expectedHeader.equals(elementalSelenium.getText()));

    }

    @Test
    public void printHeader() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/"); //goes on website

        WebElement horizontalSliderLink = driver.findElement(By.xpath("//a[@href='/horizontal_slider']")); //finds web elem horizontal slidr
        horizontalSliderLink.click(); //clicks on it
        WebElement header = driver.findElement(By.tagName("h3")); //finds elem 3
        WebElement subHeader = driver.findElement(By.tagName("h4"));//then goes on 4 th element

        System.out.println(header.getText());
        String expectedHeaderText = "Horizontal Slider";
        Assert.assertEquals("Horizontal Slider", header.getText());
        System.out.println(subHeader.getText());
    }

    @Test
    public void linkTextTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));
        abTestingLink.click();

    }

    @Test
    public void linkedTest2() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/"); //navigate(). to is the same with get() method
        String Title = driver.getTitle();
        System.out.println("Home page title is: " + Title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password"));
        forgotPassword.click();
        //WebElement header=driver.findElement()
        driver.navigate().back();
        WebElement hovers = driver.findElement(By.linkText("Hovers"));
        hovers.click();


        driver.get("http://the-internet.herokuapp.com/");
        String url2 = driver.getCurrentUrl();
        if (currentUrl.equalsIgnoreCase(url2)) {
            System.out.println("is matching");
        } else {
            System.out.println("it is not matching");
        }
    }

    /*public void partialLinkTextTest(){

        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/");
        WebElement slider=driver.findElement(By.partialLinkText("Slider"));
        slider.click();
    }


*  - id (By.id())
- name (By.name())
- tagName (By.tagName())
- linkText (By.linkText())
- partialLinkText (By.partialLinkText())
all by 5 unique elements.
Total: 25 elements*/
    @Test
    public void classNameTest() {
        //provide chrome driver executable location
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //instantiate chrome browser
        WebDriver driver = new ChromeDriver();
        //navigate to website
        driver.navigate().to("http://the-internet.herokuapp.com/");

        //locate horizontal slider element
        WebElement horizontalSliderLink = driver.findElement(By.partialLinkText("Horiz"));
        //click the link
        horizontalSliderLink.click();

        WebElement subheader = driver.findElement(By.className("subheader"));
        System.out.println(subheader.getText());
    }


}

