package InvoiceProject.stepDefinitions;

import InvoiceProject.Pages.HerokuapPage;
import InvoiceProject.utils.BrowserUtils;
import InvoiceProject.utils.driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class herokuapp extends BrowserUtils {
    HerokuapPage hp=new HerokuapPage();
    static int number;

    @Given("User wants to navigate to herokuapp website")
    public void user_wants_to_navigate_to_herokuapp_website() {
        driver.getDriver().get("https://the-internet.herokuapp.com/add_remove_elements/");
        BrowserUtils.ImplicitlyWaitpage(4);
    }
    @When("user wants to click on add element button {string}")
    public void user_wants_to_click_on_add_element_button (String Numbers){
        number=Integer.parseInt(Numbers);
        for (int i = 0; i <number ; i++) {
            hp.ClickAddElement();}
    }
    @Then("User wants to see all added element on the same page")
    public void user_wants_to_see_all_added_element_on_the_same_page () throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(number,hp.deletebuttons.size());
    }



}
