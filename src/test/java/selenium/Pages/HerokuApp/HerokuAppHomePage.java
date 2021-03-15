package selenium.Pages.HerokuApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppHomePage {

public HerokuAppHomePage (WebDriver driver){
    PageFactory.initElements(driver,this);
}
    @FindBy(linkText = "A/B TEsting")
    public WebElement abTesting;
        //driver.findelement(By.linktext(")) does the same like line abouve

    @FindBy(xpath="//a[@href='challenging_dom']")
    public WebElement challlengingDomLink;

    @FindBy(xpath="//a[@text()='Dropdown']")
    public  WebElement dropdownLink;

}
