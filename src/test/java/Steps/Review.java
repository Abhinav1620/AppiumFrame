package Steps;

import Actions.ElementActions;
import Pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Review extends ElementActions {
    ProductPage page = new ProductPage(Hooks.driver);

    @When("User selects his product")
    public void userSelectsHisProduct() {
        click(page.sauceLabsBikeLight());
    }

    @Then("User should be able to give review star to his product")
    public void userShouldBeAbleToGiveReviewStarToHisProduct() {
        click(page.fiveStar());
        click(page.closeModalButton());
    }
}
