package Pages;

import Steps.Hooks;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    public Login(AndroidDriver driver){
        PageFactory.initElements(Hooks.driver, this);
    }


    public static WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));


    By menuButton = AppiumBy.accessibilityId("open menu");
    By loginPage = AppiumBy.accessibilityId("menu item log in");
    By UserName = AppiumBy.accessibilityId("Username input field");
    By passWord = AppiumBy.accessibilityId("Password input field");
    By loginButton = AppiumBy.accessibilityId("Login button");
    By errorMessage = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"generic-error-message\"]/android.widget.TextView");


    public WebElement menuBtn(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuButton));
    }

    public WebElement username(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(UserName));
    }


    public WebElement pass(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(passWord));
    }

    public WebElement loginBTN(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
    }


    public WebElement loginPg(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage));
    }


    public WebElement errorMSG(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
    }



}
