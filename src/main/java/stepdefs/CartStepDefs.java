package stepdefs;

import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartStepDefs {
    CartPage cartPage = new CartPage();

    @Then("bag should be in the cart")
    public void isBagPresent(){
        cartPage.isBagPresent();
    }
}