package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class Login {
    public static void as(WebDriver driver,String email,String password){
        Click.on(driver, HomePageUI.buttonLogin);
        Enter.text(driver,HomePageUI.EmailInputLogin,email);
        Enter.text(driver,HomePageUI.PasswordInputLogin,password);
        Click.on(driver,HomePageUI.Login);
    }
}
