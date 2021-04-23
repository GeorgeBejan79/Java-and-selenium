package test.java.java_class.Blocks.selenium.mouseactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseClick {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));

        Actions actions =new Actions(driver);
        //abTestLink.click(); the same like the next one
        actions.click(abTestLink).perform();// interview question about perform  method

    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement contextMenuLink =driver.findElement(By.partialLinkText("Context Menu"));
        Actions actions=new Actions(driver);
        actions.click(contextMenuLink).perform();
        WebElement rectangle = driver.findElement(By.id("hot-spot"));
        //actions.click(rectangle).perform(); left click
        actions.contextClick(rectangle).perform();//right click



    }
    @Test
    public void slideTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement horizontalSliderLink= driver.findElement(By.linkText("Horizontal slider"));
        Actions actions=new Actions(driver);
        actions.click(horizontalSliderLink).perform();
        WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
        actions.clickAndHold(slider).moveByOffset(50,0).release().perform();


    }
    @Test
    public void hoversTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement hoversLink=driver.findElement(By.linkText("Hovers"));

        Actions actions=new Actions(driver);
        actions.click(hoversLink).perform();

        WebElement avatar3= driver.findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));
        actions.moveToElement(avatar3).perform();

        WebElement user3Name=driver.findElement(By.xpath("//h5[text()='name: user3']"));
        //hover over user 3 avatar
        user3Name.isDisplayed(); // shows if elem is displayed
        boolean isUser3Displayed=user3Name.isDisplayed();
        //verify user3 user is visible
        Assert.assertTrue(isUser3Displayed);

    }
    @Test
    public void draggableElementsTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=3604e");
        WebElement draggableElement1=driver.findElement(By.id("pnl_header"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(draggableElement1,200,-230).perform();
    }
    @Test
    public void draggbleElementsTest2(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=3604e");
        WebElement draggableElement1=driver.findElement(By.id("pnl_header"));
        WebElement destinationElement= driver.findElement(By.id("pnl_content"));
        Actions actions=new Actions(driver);

        System.out.println("test1");
        actions.dragAndDrop(draggableElement1,destinationElement).perform();

    }


    @Test
    public void hoversTestAllElem() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement hoversLink=driver.findElement(By.linkText("Hovers"));

        Actions actions=new Actions(driver);
        actions.click(hoversLink).perform();
            //for user 1
        WebElement avatar1= driver.findElement(By.xpath("//h5[.='name: user1']/../preceding-sibling::img"));
        actions.moveToElement(avatar1).perform();
        WebElement user1Name=driver.findElement(By.xpath("//h5[text()='name: user1']"));
        user1Name.isDisplayed();
        boolean isUser1Displayed=user1Name.isDisplayed();
        Assert.assertTrue(isUser1Displayed);
        WebElement avatar2= driver.findElement(By.xpath("//h5[.='name: user2']/../preceding-sibling::img"));
        WebElement user2Name= driver.findElement(By.xpath("//h5[text()='name: user2']"));

        user2Name.isDisplayed();
        boolean isUser2Displayed=user2Name.isDisplayed();
        Assert.assertFalse(isUser2Displayed);

        WebElement user3Name=driver.findElement(By.xpath("//h5[text()='name: user3']"));
        user3Name.isDisplayed();
        boolean isUser3Displayed=user3Name.isDisplayed();
        Assert.assertFalse(isUser3Displayed);
        System.out.println("test1");


        //for user 2
        Thread.sleep(1000);
        actions.moveToElement(avatar2).perform();
        System.out.println("test2");
        user2Name.isDisplayed();
        isUser2Displayed=user2Name.isDisplayed();
        Assert.assertTrue(isUser2Displayed);
        System.out.println("test3");
        //Assert.assertFalse(isUser1Displayed);
        Assert.assertFalse(isUser3Displayed);
        System.out.println("test4");

            //for user 3
        Thread.sleep(1000);
        WebElement avatar3= driver.findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));
        actions.moveToElement(avatar3).perform();
        System.out.println("test5");
        user3Name.isDisplayed();

        isUser3Displayed=user3Name.isDisplayed();
        Assert.assertTrue(isUser3Displayed);
        System.out.println("test6");
        Thread.sleep(2000);
        //Assert.assertFalse(isUser1Displayed);
        System.out.println("test7");
        //Assert.assertFalse(isUser2Displayed);
        System.out.println("test8");

    }
    @Test
    public void sliderTest3(){
        /*WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement horizontalSliderLink=driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        Actions actions=new Actions(driver);
        System.out.println("test1");
        actions.click(horizontalSliderLink).perform();
        System.out.println("test2");
        WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
        actions.clickAndHold(slider).moveByOffset(5,0).release().perform();
        System.out.println("test3");*/ //this one on firefox failed
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        System.out.println("test1");
        WebElement horizontalSliderLink= driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        System.out.println("test");
        Actions actions=new Actions(driver);
        actions.click(horizontalSliderLink).perform();
        System.out.println("test2");
        WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
        actions.clickAndHold(slider).moveByOffset(5,0).release().perform();
    }
    @Test
    public void dragAndDropTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=3604e");
        WebElement handleElem=driver.findElement(By.id("handlepnl_header"));
        Actions actions= new Actions(driver);
        actions.dragAndDropBy(handleElem,200,-200).perform();
        actions.dragAndDropBy(handleElem, -200,200).perform();

        WebElement revertElement=driver.findElement(By.id("rpnl_header"));
        Actions actions1= new Actions(driver);
        actions1.dragAndDropBy(revertElement,200,-200).perform();

        WebElement horizontalElement=driver.findElement(By.id("hpnl"));
        Actions actions2=new Actions(driver);
        actions2.dragAndDropBy(horizontalElement,200,0).perform();
        actions2.dragAndDropBy(horizontalElement,-200,0).perform();


        WebElement verticalElement=driver.findElement(By.id("vpnl"));
        Actions actions3=new Actions(driver);
        actions3.dragAndDropBy(verticalElement,0,-100).perform();
        actions3.dragAndDropBy(verticalElement,0,100).perform();

        /*WebElement opacityElement=driver.findElement(By.id("opnl"));
        System.out.println("test1");
        Actions actions4 =new Actions(driver);
        actions4.dragAndDropBy(opacityElement, 100, 0).perform();
        System.out.println("test2");
        //actions4.dragAndDropBy(opacityElement, -200, 100).perform();
        System.out.println("test3");*/
    }
    @Test
    public void doubleClickTEst(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver firefox=new FirefoxDriver();
        String currentTitle=firefox.getTitle();
        firefox.get("http://demo.guru99.com/test/simple_context_menu.html");
        Assert.assertEquals("Simple Context Menu",currentTitle);
        WebElement doubleClickBtn=firefox.findElement(By.xpath("//button[onddblclick='myFunction']"));
        Actions actions=new Actions(firefox);
        actions.doubleClick(doubleClickBtn).perform();


    }
}
