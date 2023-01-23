package InvoiceProject.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class driver {
private driver(){}
    private static ThreadLocal<WebDriver> driverpool=new ThreadLocal<WebDriver>();


        public static WebDriver getDriver(){
            if (driverpool.get()==null){
                synchronized (driver.class){
                switch (ConfigurationReading.getProperty("browser")){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverpool.set(new ChromeDriver());
                        break;
                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        driverpool.set(new SafariDriver());
                        break;
                    case "chrome-headless":
                        WebDriverManager.chromedriver().setup();
                        driverpool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                        break;
                    default:
                        System.out.println("Driver IS NOT FOUNDDDDD");
                }
                }
            }
            return driverpool.get();
        }

        public static void CloseDriver(){
            if (driverpool.get()!=null){
                driverpool.get().quit();
                driverpool.remove();
            }
        }




}
