package InvoiceProject.stepDefinitions;

import InvoiceProject.utils.driver;
import io.cucumber.java.en.Given;

public class skas {

    @Given("user wants to go to google")
    public void user_wants_to_go_to_google() {
        driver.getDriver().get("https://www.google.com");
    }
}
