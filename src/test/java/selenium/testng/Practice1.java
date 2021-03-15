package selenium.testng;

/*public class Practice1 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        softAssert=new SoftAssert();
        actions=new Actions(driver);
    }
    @Test
    public static void testOCA() throws InterruptedException{

        driver.get("https://google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        softAssert.assertEquals(actualTitle, expectedTitle);
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("java oca certification" + Keys.ENTER);
        Thread.sleep(2000);
        softAssert.assertTrue(driver.getCurrentUrl().contains("google"));
        WebElement results = driver.findElement(By.id("result-stats"));
        String resultsText = results.getText();
        System.out.println(resultsText);
        softAssert.assertAll();
        // About 680,000 results (0.42 seconds)
        String[] array = resultsText.split(" ");
        // 680000
        String resultNum = array[1].replace(",", "");
        int endResult = Integer.parseInt(resultNum);
        softAssert.assertTrue(endResult > 100000);
        softAssert.assertAll("Good job Tester");

    }
    @AfterMethod
    public void cleanup(){
        driver.quit();
    }
}*/
