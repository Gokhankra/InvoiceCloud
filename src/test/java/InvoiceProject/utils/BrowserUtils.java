package InvoiceProject.utils;

import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    public static void ImplicitlyWaitpage(int Seconds){
        driver.getDriver().manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
    }

}
