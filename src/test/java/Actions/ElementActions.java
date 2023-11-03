package Actions;
import org.openqa.selenium.WebElement;


public class ElementActions {
    public static void sendKeys(WebElement element, String s){
        element.sendKeys(s);
    }


    public static void click(WebElement element){
        element.click();
    }


    public static String getText(WebElement element){
        return element.getText();
    }
}
