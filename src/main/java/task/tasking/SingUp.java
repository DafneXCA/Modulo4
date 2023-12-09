package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class SingUp {
    public static void as(WebDriver driver,String fullName,String email,String password){
        Click.on(driver, HomePageUI.button);
        Enter.text(driver,HomePageUI.fullNameInput,fullName);
        Enter.text(driver,HomePageUI.EmailInput,email);
        Enter.text(driver,HomePageUI.PasswordInput,password);
        Click.on(driver,HomePageUI.checkBox);
        Click.on(driver,HomePageUI.singUp);
    }
}
