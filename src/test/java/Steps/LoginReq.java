package Steps;

import Actions.ElementActions;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginReq extends ElementActions {
    ProductPage page = new ProductPage(Hooks.driver);
    CommonElements elements = new CommonElements(Hooks.driver);
    DeliveryInformation information = new DeliveryInformation(Hooks.driver);
    Login login = new Login(Hooks.driver);
    CheckOut out = new CheckOut(Hooks.driver);
    Hamburger hamburger = new Hamburger(Hooks.driver);







    @When("^User adds his product into the cart$")
    public void userAddsHisProductIntoTheCart() {
        click(page.sauceLabsBoltTShirt());
        click(elements.addToCartButton());
        click(elements.cartBadge());
    }

    @Then("User should be asked for login to proceed ahead with the checkout")
    public void userShouldBeAskedForLoginToProceedAheadWithTheCheckout() {

        click(elements.proceedToCheckoutButton());
    }

    @And("after entering his correct {string} and correct {string}")
    public void afterEnteringHisCorrectAndCorrect(String arg0, String arg1) throws InterruptedException {
        sendKeys(login.username(), arg0);
        sendKeys(login.pass(), arg1);
        click(login.loginBTN());


//      Procced for checkout
        sendKeys(information.fullName(), "Test");
        sendKeys(information.address01(), "dncjdsnc");
        sendKeys(information.address02(), "cdnsc");
        sendKeys(information.zipCode(), "10203040");
        sendKeys(information.country(), "UK");
        sendKeys(information.city(), "London");
        sendKeys(information.state(), "London");
        click(information.toPaymentButton());


//        enter payments details
        sendKeys(out.cardNumber(), "3566000020000410");
        sendKeys(out.expirationDate(), "0226");
        sendKeys(out.securityCode(), "123");
        sendKeys(out.fullNameCard(), "Test");
        click(out.reviewOrderButton());
        click(out.placeOrderButton());
        click(out.continueShoppingButton());
    }

    @Then("User should be able to logout after his checkout.")
    public void userShouldBeAbleToLogoutAfterHisCheckout() throws InterruptedException {
        Thread.sleep(3000);
        click(login.menuBtn());
        click(hamburger.menuItemLogOut());
        click(hamburger.alertLogout());
    }
}
