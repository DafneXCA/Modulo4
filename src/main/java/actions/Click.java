package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click {

    public static void on(WebDriver webDriver, By location){
        webDriver.findElement(location).click();
    }
}
