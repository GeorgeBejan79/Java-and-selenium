package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class locateMultipleElements {
    @Test
    public void multipleElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions=new Actions(driver);
        actions.sendKeys(searchBar, "iphone 12"+ Keys.ENTER).perform();
        List<WebElement> prices=driver.findElements
                (By.xpath("//span[@class='a-price']"));
        /*
        * 1.prices with $
        * 2 prices with','
        * empty prices
        * 4prices with $ sign
        * */
        double totalPrice=0;
        for (WebElement elementPrice:prices) {
            //System.out.println(elementPrice.getText());
            String temp=elementPrice.getText();
            if (temp.startsWith("$")){
                //remove dollar sign from the beginning
                temp=temp.substring(1);
            }
            if(temp.contains(",")){
                //if it has coma just remove it
                temp=temp.replace(",","");
            }
            if(temp.isEmpty()){
                continue; //check if the value is empty should continue or skip
            }
            if(temp.contains("\n")){
                temp=temp.replace("\n",".");
            }
            //converts string temp to pure Doubles
            totalPrice+=Double.parseDouble(temp);
        }
        System.out.println(totalPrice);
    }
    @Test
    public  void getNamesTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("samsung"+Keys.ENTER);
        List<WebElement>productNameList=driver.findElements
                (By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        List<String> productNames=new ArrayList<>(); //we will store all the elements in array of list

        for (WebElement product: productNameList) {
            String temp=product.getText();

            productNames.add(temp); //store all the names ito a list
        }
       System.out.println(productNames);
    }
}
