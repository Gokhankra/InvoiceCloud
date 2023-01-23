package InvoiceProject.Pages;

import InvoiceProject.utils.BrowserUtils;
import InvoiceProject.utils.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class HerokuapPage extends BrowserUtils {
    public  HerokuapPage(){
        PageFactory.initElements(driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Add Element']")
    public WebElement addElementbutton;

    @FindBy(xpath = "//*[text()='Delete']")
    public List<WebElement> deletebuttons;

    public void ClickAddElement(){
        addElementbutton.click();
    }
    public void ClickDeletebuttons(){
        for (int i = 0; i <deletebuttons.size() ; i++) {
            deletebuttons.get(i).click();
        }
    }


}
