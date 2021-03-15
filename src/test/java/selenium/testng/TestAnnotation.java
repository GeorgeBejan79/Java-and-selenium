package selenium.testng;

import org.testng.annotations.Test;

public class TestAnnotation {
/*@BeforeClass
        public void classSetup(){

    System.out.println("Before class hook is executed");
}
@AfterClass
        public void classCleanup(){
    System.out.println("After class hook is executed");
    }
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.out.println("before method hook is executed");
        WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
    }

    @Test(priority=10)
    public void googleTest(){
        System.out.println("Executing Google test");

        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method hook is executed");
        driver.quit();
    }

    @Test(invocationCount=1)
    public void techtorialTest(){
        System.out.println("executing techtorial test");

        driver.get("http://www.techtorialacademy.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("techtorial"));

    }*/
    /*@Test(invocationTimeOut = 5000)
    public void test5() throws InterruptedException {
        System.out.println("test 5");
        Thread.sleep(6000);
    }

        @Test(expectedExceptions = RuntimeException.class) //suposed to throw an exeption and if not
        {

            System.out.println("test6");
        }*/
        @Test(dependsOnMethods = "test6")
    public void test7(){

        }
    }



