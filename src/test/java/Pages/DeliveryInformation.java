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

public class DeliveryInformation {
    public DeliveryInformation(WebDriver driver){
        PageFactory.initElements(Hooks.driver, this);
    }

    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));

    By fullName = AppiumBy.accessibilityId("Full Name* input field");
    By address01 = AppiumBy.accessibilityId("Address Line 1* input field");
    By address02 = AppiumBy.accessibilityId("Address Line 2 input field");
    By city = AppiumBy.accessibilityId("City* input field");
    By state = AppiumBy.accessibilityId("State/Region input field");
    By zipCode = AppiumBy.accessibilityId("Zip Code* input field");
    By country = AppiumBy.accessibilityId("Country* input field");
    By toPaymentButton = AppiumBy.accessibilityId("To Payment button");



    public WebElement fullName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(fullName));
    }

    public WebElement address01(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(address01));
    }

    public WebElement address02(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(address02));
    }

    public WebElement city(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(city));
    }

    public WebElement state(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(state));
    }

    public WebElement zipCode(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(zipCode));
    }

    public WebElement country(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(country));
    }

    public WebElement toPaymentButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(toPaymentButton));
    }

}
