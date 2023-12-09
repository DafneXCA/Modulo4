package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.TodoHome;

public class AddProject {
    public static void as(WebDriver driver, String email, String password,String nameProject){
        Click.on(driver, HomePageUI.buttonLogin);
        Enter.text(driver,HomePageUI.EmailInputLogin,email);
        Enter.text(driver,HomePageUI.PasswordInputLogin,password);
        Click.on(driver,HomePageUI.Login);
        Click.on(driver, TodoHome.projectButton);
        Enter.text(driver,TodoHome.newProjectInput,nameProject);
        Click.on(driver,TodoHome.addProjectButton);
    }
}
