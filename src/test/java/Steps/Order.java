package Steps;

import Actions.ElementActions;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Order extends ElementActions{
    ProductPage page = new ProductPage(Hooks.driver);
    CommonElements elements = new CommonElements(Hooks.driver);
    DeliveryInformation information = new DeliveryInformation(Hooks.driver);
    CheckOut out = new CheckOut(Hooks.driver);
    Hamburger ham = new Hamburger(Hooks.driver);
    Login login = new Login(Hooks.driver);

    @And("User should be able to order his product after filling his all delivery information")
    public void userShouldBeAbleToOrderHisProductAfterFillingHisAllDeliveryInformation() {
        click(page.sauceLabsBoltTShirt());
        click(elements.addToCartButton());
        click(elements.cartBadge());
        click(elements.proceedToCheckoutButton());



//        Delivery Information page
        sendKeys(information.fullName(), "dmfkdns");
        sendKeys(information.address01(), "nkfdsfnds");
        sendKeys(information.address02(), "kdsmvkdslk");
        sendKeys(information.city(), "ckdsckd");
        sendKeys(information.state(), "cmdskcmkdscnds");
        sendKeys(information.zipCode(), "10203040");
        sendKeys(information.country(), "Canada");
        click(information.toPaymentButton());

//        confirming order

        sendKeys(out.cardNumber(), "3566000020000410");
        sendKeys(out.expirationDate(), "02/26");
        sendKeys(out.securityCode(), "123");
        sendKeys(out.fullNameCard(), "Dummy payment");
        click(out.reviewOrderButton());


        click(out.placeOrderButton());
        click(out.continueShoppingButton());
    }

    @Then("User should be able to logout successfully")
    public void userShouldBeAbleToLogoutSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        click(login.menuBtn());
        click(ham.menuItemLogOut());
        click(ham.alertLogout());
    }
}
