package test.java.java_class.Maps.java_class.Blocks.selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    @Test
    public void lenovoSearchTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar, "lenovo laptop" + Keys.ENTER).perform();

        List<WebElement> productNameList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        List<String> productNames=new ArrayList<>(); // empty list of strings
        for (WebElement product:productNameList) { //assign product to the empty list
            String temp=product.getText();
            //System.out.println(temp);
            productNames.add(temp);
        }
        int index=0;
        while(index < productNames.size()){
            System.out.println(index+". "+productNames.get(index));
            Assert.assertTrue(productNames.get(index).toLowerCase().contains("lenovo"));
            index++;
        }
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));


        for (WebElement elementPrice : prices) {
            //System.out.println(elementPrice.getText());
            String temp = elementPrice.getText();
            if (temp.startsWith("$")) { //removes $ sign
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


        }


    }
}

