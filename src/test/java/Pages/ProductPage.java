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

public class ProductPage {

    public ProductPage(WebDriver driver){
        PageFactory.initElements(Hooks.driver, this);
    }


    public static WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));


    By sauceLabsBackpack = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"store item text\"])[1]");
    By sauceLabsBikeLight = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"store item text\"])[2]");
    By sauceLabsBoltTShirt = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"store item text\"])[3]");
    By fiveStar = AppiumBy.accessibilityId("review star 5");
    By closeModalButton = AppiumBy.accessibilityId("Close Modal button");
    By thanksText = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");


    public WebElement sauceLabsBackpack(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sauceLabsBackpack));
    }

    public WebElement sauceLabsBikeLight(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sauceLabsBikeLight));
    }

    public WebElement sauceLabsBoltTShirt(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sauceLabsBoltTShirt));
    }
    public WebElement fiveStar(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(fiveStar));
    }
    public WebElement closeModalButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(closeModalButton));
    }
    public String text(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(thanksText)).getText();
    }
}
