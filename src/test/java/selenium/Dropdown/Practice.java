package selenium.Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class Practice {
    @Test
    public void test1()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String expectedURL = "https://www.ebay.com/";
        System.out.println("test");
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        System.out.println("test1");
        Assert.assertEquals(expectedURL, driver.getCurrentUrl()); //checks the url
        Assert.assertEquals(expectedTitle, driver.getTitle());//checks the title

        WebElement allCategories = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));

        Select dropDownHandler = new Select(allCategories);
//        dropDownHandler.selectByVisibleText("Music");
//        WebElement searchButton= driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']"));
//        searchButton.click();
        allCategories.click();

        List<WebElement> allOptions = dropDownHandler.getOptions();

        System.out.println(allOptions.size());// get the size of the list

        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }



//    @Test
//    public void test3() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver1 = new ChromeDriver();
//        driver1.get("https://learn.letskodeit.com/p/practice");
//        WebElement dropDown = driver1.findElement(By.id("carselect"));
//        Select dropDownHandler = new Select(dropDown);
//        dropDownHandler.selectByVisibleText("Honda");
//        WebElement selectedOption = dropDownHandler.getFirstSelectedOption();
//        Assert assertEquals("Honda", selectedOption.getText());
//    }
//        @Test
//    public void test4(){
//                WebDriverManager.chromedriver().setup();
//                WebDriver chrome =new ChromeDriver();
//                chrome.get("https://learn.letskodeit.com/p/practice");
//                WebElement dropDown=chrome.findElement(By.id("carselect"));
//                Select dropDownHandler=new Select(dropDown);
//                dropDownHandler.selectByValue("benz");
//
//                WebElement firstSelectedOption=dropDownHandler.getFirstSelectedOption();
//                Assert.assertEquals("Benz",firstSelectedOption.getText());
//        }
//        @Test
//    public void test5(){
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver =new ChromeDriver();
//            driver.get("https://www.amazon.com/");
//
//            WebElement dropDown =driver.findElement(By.id("searchDropdownBox"));
//
//            Select dropDownHandler=new Select(dropDown);
//
//            dropDownHandler.selectByValue("search-alias=instant-video");
//
//            WebElement firstSelectedOption=dropDownHandler.getFirstSelectedOption();
//            assertEquals("Prime Video",firstSelectedOption.getText());
//        }

}

    @Test
    public void cardCashTest() throws IOException
    {

        //verify if credit card is selected cash is not
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:63342/PizzaOrderForm-develop/com.sample/files/index.html?_ijt=vm98i8ji9u418bs90o645k4t77");


//        //verify if pizza1 text
//        WebElement pizza1Text=driver.findElement(By.xpath("//div[@id='pizza1']/child::label"));
//        String pizza1ActualText=pizza1Text.getText();
//        org.testng.Assert.assertEquals(pizza1ActualText,"Pizza 1");
//
//        //verify toppings1 text
//        WebElement toppings1Text=driver.findElement(By.linkText("Toppings 1"));
//        String toppings1actual1Text=toppings1Text.getText();
//        org.testng.Assert.assertEquals(toppings1actual1Text,"Toppings 1");
//        //verify toppings1 text
//        WebElement toppings2Text=driver.findElement(By.linkText("Toppings 2"));
//        String toppings2actual1Text=toppings2Text.getText();
//        org.testng.Assert.assertEquals(toppings2actual1Text,"Toppings 2");
//        //verify toppings1 quantity
//        WebElement quantityText=driver.findElement(By.linkText("Quantity"));
//        String quantityActualText=quantityText.getText();
//        org.testng.Assert.assertEquals(quantityActualText,"Quantity");
//
//        //verify cost field
//        WebElement costText=driver.findElement(By.linkText("Quantity"));
//        String costActualText=costText.getText();
//        org.testng.Assert.assertEquals(costActualText,"Quantity");
//
//        //verify pickup info field
//        WebElement pickupInfoText=driver.findElement(By.xpath("//div[@id='pickupInfo']/h3"));
//        String pickupInfoActualText=pickupInfoText.getText();
//        org.testng.Assert.assertEquals(pickupInfoActualText,"PICKUP INFORMATION ");
//
//        //verify name field
//        WebElement nameText=driver.findElement(By.xpath("//div[@id='pickupInfo']/label"));
//        String nameActualText=nameText.getText();
//        org.testng.Assert.assertEquals(nameActualText,"Name* ");
//
//        //verify email field
//        WebElement emailText=driver.findElement(By.xpath("//div[@id='pickupInfo']/label"));
//        String emailActualText=emailText.getText();
//        org.testng.Assert.assertEquals(emailActualText,"Email");
//
//        //verify phone field
//        WebElement phoneText=driver.findElement(By.linkText("Phone*"));
//        String phoneActualText=phoneText.getText();
//        org.testng.Assert.assertEquals(phoneActualText,"Phone*");
//
//        //verify pickUp info field
//        WebElement pickUpInfoText=driver.findElement(By.xpath("//div[@id='pickupInfo']/h3"));
//        String pickUpInfoActualText=pickUpInfoText.getText();
//        org.testng.Assert.assertEquals(pickUpInfoActualText,"PICKUP INFORMATION ");
//
//        //verify creditcard radiobtn is there
//        WebElement creditCardBtn=driver.findElement(By.xpath("//input[@id='ccpayment']"));
//        org.testng.Assert.assertFalse(creditCardBtn.isSelected());//verify is initially radiobtn is not selected
//        creditCardBtn.click();
//        org.testng.Assert.assertEquals(true,creditCardBtn.isSelected());//after click should be selected
//
//        //verify cash radiobtn is there
//        WebElement cashCardBtn=driver.findElement(By.xpath("//input[@id='cashpayment']"));
//        org.testng.Assert.assertFalse(cashCardBtn.isSelected());//verify is initially radiobtn is not selected
//        cashCardBtn.click();
//        org.testng.Assert.assertEquals(true,cashCardBtn.isSelected());//after click should be selected
//
//        //verify the displayed text on placeOrderBtn
//        WebElement placeOrderBtn=driver.findElement(By.id("placeOrder"));
//        String placeOrderBtnActualText=placeOrderBtn.getText();
//        org.testng.Assert.assertEquals(placeOrderBtnActualText,"Place Order");
//
//        //verify the displayed text on resetBtn
//        WebElement resetBtn=driver.findElement(By.id("placeOrder"));
//        String resetBtnActualText=resetBtn.getText();
//        org.testng.Assert.assertEquals(resetBtnActualText,"Reset");

    }
    @Test
    public void test6()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung Galaxy", Keys.ENTER);
    }
    @Test
    public void linkedInTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("gbejan31@gmail.com");
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("Lasvegas31.");

        WebElement signInButton = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
        signInButton.click();

        WebElement searchField = driver.findElement(By.xpath("//input[@class='search-global-typeahead__input always-show-placeholder']"));
        searchField.sendKeys("SDET", Keys.ENTER);
        Thread.sleep(2000);
        WebElement jobsButton = driver.findElement(By.xpath("//button[text()='Jobs']"));
        jobsButton.click();
        System.out.println("cliked on jobs");
        Thread.sleep(2000);
            WebElement dateButton= driver.findElement(By.xpath("//button[text()='Date Posted']"));
        dateButton.click();
        System.out.println("cliked on date button");
        Thread.sleep(2000);
        WebElement datePostedDD = driver.findElement(By.xpath("//*[@id=\'artdeco-hoverable-artdeco-gen-52\']/div[1]/div/form/fieldset"));
        Select select = new Select(datePostedDD); //div[@class='artdeco-hoverable-content artdeco-hoverable-content--visible reusable-search-filters-trigger-dropdown__content artdeco-hoverable-content--inverse-theme artdeco-hoverable-content--default-spacing artdeco-hoverable-content--bottom-placement']//fieldset[@class='reusable-search-filters-trigger-dropdown__container']
        select.selectByVisibleText("Past 24 hours");
//        Thread.sleep(2000);
//       WebElement twentyFourHoursRadio = driver.findElement(By.xpath("(//*[@class='reusable-search-filters-trigger-dropdown__container']//legend//following-sibling::div[1]/ul)[1]//input[@id='timePostedRange-r86400']"));//input[@name='date-posted-filter-value'and @id='timePostedRange-r86400']
//       twentyFourHoursRadio.click();
//        WebElement jobTypeDD = driver.findElement(By.id("ember927"));
//        select = new Select(jobTypeDD);
//        select.selectByVisibleText("Past 24 hours");
//        WebElement jobs= driver.findElement(By.id("ember23"));
//        jobs.click();

    }
}


