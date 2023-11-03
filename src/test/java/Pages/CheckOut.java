package Pages;

import Steps.Hooks;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOut {
    public CheckOut(WebDriver driver){
        PageFactory.initElements(Hooks.driver, this);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));


    By fullNameCard = AppiumBy.accessibilityId("Full Name* input field");
    By cardNumber = AppiumBy.accessibilityId("Card Number* input field");
    By expirationDate = AppiumBy.accessibilityId("Expiration Date* input field");
    By securityCode = AppiumBy.accessibilityId("Security Code* input field");
    By reviewOrderButton = AppiumBy.accessibilityId("Review Order button");

    By placeOrderButton = AppiumBy.accessibilityId("Place Order button");
    By continueShoppingButton = AppiumBy.accessibilityId("Continue Shopping button");


    public WebElement fullNameCard(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(fullNameCard));
    }
    public WebElement cardNumber(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumber));
    }

    public WebElement expirationDate(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(expirationDate));
    }

    public WebElement securityCode(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(securityCode));
    }

    public WebElement reviewOrderButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(reviewOrderButton));
    }
    public WebElement placeOrderButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderButton));
    }

    public WebElement continueShoppingButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingButton));
    }
}
