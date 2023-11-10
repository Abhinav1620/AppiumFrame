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
import java.util.List;

public class CommonElements {
    public CommonElements(WebDriver driver){
        PageFactory.initElements(Hooks.driver, this);
    }

    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));


    By addToCartButton = AppiumBy.accessibilityId("Add To Cart button");
    By cartBadge = AppiumBy.accessibilityId("cart badge");
    By proceedToCheckoutButton = AppiumBy.accessibilityId("Proceed To Checkout button");
    By removeItem = AppiumBy.accessibilityId("remove item");
    By removeText = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");


    By multipleRemove = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"remove item\"]");
    By containsHeaders = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");



    public WebElement addToCartButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
    }

    public WebElement cartBadge(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge));
    }

    public WebElement proceedToCheckoutButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutButton));
    }
    public WebElement removeItem(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(removeItem));
    }
    public String removeText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(removeText)).getText();
    }

    public List<WebElement> multipleRemove(){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(multipleRemove));
    }

    public String containsHeaders(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(containsHeaders)).getText();
    }
}
