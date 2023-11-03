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

public class Hamburger {
    public Hamburger(WebDriver driver){
        PageFactory.initElements(Hooks.driver, this);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));


    By menuItemCatalog = AppiumBy.accessibilityId("menu item catalog");
    By menuItemWebView = AppiumBy.accessibilityId("menu item webview");
    By menuItemQrCodeScanner = AppiumBy.accessibilityId("menu item qr code scanner");
    By menuItemAbout = AppiumBy.accessibilityId("menu item about");
    By menuItemDrawing = AppiumBy.accessibilityId("menu item drawing");
    By menuItemResetApp = AppiumBy.accessibilityId("menu item reset app");
    By menuItemLogOut = AppiumBy.accessibilityId("menu item log out");
    By alertLogout = AppiumBy.id("android:id/button1");


    public WebElement menuItemCatalog(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemCatalog));
    }

    public WebElement menuItemWebView(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemWebView));
    }

    public WebElement menuItemQrCodeScanner(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemQrCodeScanner));
    }

    public WebElement menuItemAbout(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemAbout));
    }

    public WebElement menuItemDrawing(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemDrawing));
    }

    public WebElement menuItemResetApp(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemResetApp));
    }

    public WebElement menuItemLogOut(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemLogOut));
    }
    public WebElement alertLogout(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(alertLogout));
    }
}
