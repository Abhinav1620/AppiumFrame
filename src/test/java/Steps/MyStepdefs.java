package Steps;

import Actions.ElementActions;
import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    Login login = new Login(Hooks.driver);

    @Given("^When user launch the mobile application$")
    public void whenUserLaunchTheMobileApplication() {
        ElementActions.click(login.menuBtn());
        ElementActions.click(login.loginPg());
    }

    @And("User tries to enter his correct {string} and correct {string}")
    public void userEnterHisCorrectAndCorrect(String arg0, String arg1) {
        ElementActions.sendKeys(login.username(), arg0);
        ElementActions.sendKeys(login.pass(), arg1);
        ElementActions.click(login.loginBTN());
    }

    @Then("User should be able to login into the application.")
    public void userShouldBeAbleToLoginIntoTheApplication() {
        System.out.println("Pass");
    }

    @Then("User should be able to get error.")
    public void userShouldBeAbleToGetError() {
        Assert.assertEquals(ElementActions.getText(login.errorMSG()), "Provided credentials do not match any user in this service.");
    }
}
