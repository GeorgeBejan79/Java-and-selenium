package selenium.Pages.HerokuApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

    public DropDownPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
}
