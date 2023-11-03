package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Main {

    public static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp("C:\\Users\\akumar3\\Downloads\\new\\SeleniumFrameworkDesign\\AppiumFrameWork\\Android-MyDemoAppRN.1.3.0.build-244.apk");
        options.setDeviceName("Pixel 3 API 28");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(MobilePlatform.ANDROID);


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.TextView[@content-desc=\"store item text\"])[3]"))).click();
    }
}