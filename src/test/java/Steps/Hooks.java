package Steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    public static AndroidDriver driver;

    @Before
    public void startUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp("C:\\Users\\akumar3\\Documents\\DoNotDelete\\AppiumFrame\\Android-MyDemoAppRN.1.3.0.build-244.apk");
        options.setDeviceName("Pixel 3 API 28");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(MobilePlatform.ANDROID);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
    }

    @After
    public void tearDown(){
        driver.quit();
        System.out.println("Pass");
    }


}
