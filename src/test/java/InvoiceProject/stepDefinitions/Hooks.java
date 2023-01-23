package InvoiceProject.stepDefinitions;

import InvoiceProject.utils.BrowserUtils;
import InvoiceProject.utils.driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends BrowserUtils {


    @Before
    public void setup(){
        driver.getDriver();
        driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            byte data []=((TakesScreenshot)driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png", scenario.getName());
        }
        driver.CloseDriver();
    }
}
