package Steps;

import Actions.ElementActions;
import Pages.CommonElements;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RemoveProduct extends ElementActions {
    ProductPage page = new ProductPage(Hooks.driver);
    CommonElements elements = new CommonElements(Hooks.driver);



    @When("^user select a product$")
    public void userSelectProduct() {
        click(page.sauceLabsBoltTShirt());

    }

    @And("add it into his shopping cart")
    public void addItIntoHisShoppingCart() {
        click(elements.cartBadge());
    }

    @Then("before checking out user should be able to remove the product which he has added.")
    public void beforeCheckingOutUserShouldBeAbleToRemoveTheProductWhichHeHasAdded() {
        click(elements.removeItem());
        Assert.assertEquals(getText(elements.removeText()), "No Items");

    }

    @When("user select his products")
    public void userSelectHisProducts() {
        click(page.sauceLabsBoltTShirt());
        click(elements.addToCartButton());

        Hooks.driver.navigate().back();
        click((page.sauceLabsBackpack()));
        click(elements.addToCartButton());
    }

    @Then("before checking out user should be able to remove multiple product which he has added.")
    public void beforeCheckingOutUserShouldBeAbleToRemoveMultipleProductWhichHeHasAdded() throws InterruptedException {
        for (WebElement webElement: elements.multipleRemove()){
            click(webElement);
        }
    }
}
