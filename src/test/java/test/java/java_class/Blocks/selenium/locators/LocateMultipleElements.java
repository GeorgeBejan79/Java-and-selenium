package test.java.java_class.Blocks.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class LocateMultipleElements {
    @Test
    public void multipleElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions= new Actions(driver);
        actions.sendKeys(searchBar,"iphone 12"+ Keys.ENTER).perform();

        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));
/*handle
* 1prices with $
* 2-prices with ','
* 3 empty spaces
* 4. prices without $ sign
* */
        double totalPrice=0;
        for(WebElement elementPrice:prices){
            //System.out.println(elementPrice.getText());
            String temp=elementPrice.getText();
            if(temp.startsWith("$")){ //removes $ sign
                temp = temp.substring(1); // resign val for string temp
            }
            if(temp.contains(",")){
                temp=temp.replace(",", ""); //replace , with empty space
            }
            if(temp.isEmpty()){  // if is empty space remove it
                continue;
            }
            if(temp.contains("\n")){
                temp=temp.replace("\n",".");
            }
            totalPrice+=Double.parseDouble(temp);

        }
        System.out.println(totalPrice);
    }
    @Test
    public void findsamsungphoneTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions= new Actions(driver);
        actions.sendKeys(searchBar,"samsung"+ Keys.ENTER).perform();
        List<WebElement> prodactNameList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        List<String>productNames=new ArrayList<>(); // empty list of strings
        for (WebElement product:prodactNameList) { //assign product to the empty list
            String temp=product.getText();
            //System.out.println(temp);
            productNames.add(temp);
        }
        int index=0;
        while(index < productNames.size()){
            System.out.println(index+". "+productNames.get(index));
            Assert.assertTrue(productNames.get(index).toLowerCase().contains("samsung"));
            index++;
        }
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));

        double totalPrice=0;
        for(WebElement elementPrice:prices){
            //System.out.println(elementPrice.getText());
            String temp=elementPrice.getText();
            if(temp.startsWith("$")){ //removes $ sign
                temp = temp.substring(1); // resign val for string temp
            }
            if(temp.contains(",")){
                temp=temp.replace(",", ""); //replace , with empty space
            }
            if(temp.isEmpty()){  // if is empty space remove it
                continue;
            }
            if(temp.contains("\n")){
                temp=temp.replace("\n",".");
            }
            totalPrice+=Double.parseDouble(temp);

        }
        System.out.println(totalPrice);
    }

    public static class keyboard {
        @Test
        public void alluppercaseTest(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            WebElement searchField=driver.findElement(By.name("q"));
            Actions actions=new Actions(driver);
            actions.keyDown(Keys.SHIFT).sendKeys(searchField,"t").keyUp(Keys.SHIFT).
                    sendKeys(searchField,"etorial academy"+Keys.ENTER).perform();
        }
        @Test
        public void copyPasteTest(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://amazon.com");
            WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
            Actions actions=new Actions(driver);
            actions.sendKeys(searchBar,"java")
                    .keyDown(Keys.CONTROL)
                    //select all
                    .sendKeys("a")
                    //copy
                    .sendKeys("c")
                    //paste
                    .sendKeys("v")
                    .sendKeys("v").
                    // release Command button on keyboard
                    keyUp(Keys.CONTROL).perform();
        }
        @Test
        public void cutPasteTest(){

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://amazon.com");
            WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
            Actions actions= new Actions(driver);
            actions.sendKeys(searchBar, "iphone 12")
            .keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .sendKeys("x")
                    .sendKeys("v")
                    .sendKeys("v")
                    .sendKeys("v")
                    .keyUp(Keys.CONTROL)
                    .sendKeys(Keys.ENTER)// press enter
                    .perform();

        }
    }
}
