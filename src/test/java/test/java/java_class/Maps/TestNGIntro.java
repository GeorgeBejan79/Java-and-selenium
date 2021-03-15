package test.java.java_class.Maps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNGIntro {

    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("google"));

    }



    /*
       1. Navigate to amazon.com
       2. Search for Lenovo laptop
       3. Get the Product names and product prices from 3 result pages
       4. Store the names and prices in a Map
            */
    @Test
    public void lenovo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.sendKeys(searchbar, "Lenovo laptop" + Keys.ENTER).perform();
        List<WebElement> productNamesList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
               /*List<String> ProductNames =new LinkedList<>();
               for(WebElement names: productNamesList){
                   String temp=names.getText();
                    
                   if(temp.isEmpty()){
                continue;
            }
                ProductNames.add(temp);
            }
                List<Integer> Prices1 =new LinkedList<>();
               for(WebElement price: prices){
                   String temp1=price.getText();

                   if(temp1.isEmpty()){
                       continue;
               }
                   //prices.add(temp1);
       }
        System.out.println(" ");
            System.out.println("product Names: "+ ProductNames+"\n");
            //System.out.println("Size of Names"+newProductNames.size()+"\n");
            System.out.println("prices "+prices+"\n");
            Map<String, WebElement> all=new LinkedHashMap<>();
            int counter =1;


            for(int i=0; i<ProductNames.size();i++){

                 all.put(ProductNames.get(i), prices.get(i));
            counter++;
            }*/

        int index = 0;
        for (int i = 0; i < productNamesList.size(); i++) {
            System.out.println(index + "." + productNamesList.get(i).getText());
            String price = prices.get(i).getText();
            if (price.equals(" ") || price.equals("")) {
                continue;
            }
            System.out.println(prices.get(i).getText());
        }

        WebElement next = driver.findElement(By.partialLinkText("Next"));
        next.click();
        System.out.println("PAGE 2");

        List<WebElement> productNamesList1 = driver.findElements(By.partialLinkText("a-size-medium"));
        List<WebElement> prices1 = driver.findElements(By.partialLinkText("a-price-whole"));

        int index1 = 0;
        for (int i = 0; i < productNamesList1.size(); i++) {
            System.out.println(index1 + "." + productNamesList1.get(i).getText());
            String price1 = prices1.get(i).getText();
            if (price1.equals(" ") || price1.equals("")) {
                continue;
            }
            System.out.println(prices1.get(i).getText());

            System.out.println("PAGE 2 END");
            WebElement next2 = driver.findElement(By.partialLinkText("Next"));
            next2.click();
        }
    }
}














































