package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.TodoHome;

public class AddTodo {
    public static void as(WebDriver driver, String email, String password,String nameTodo){
        Click.on(driver, HomePageUI.buttonLogin);
        Enter.text(driver,HomePageUI.EmailInputLogin,email);
        Enter.text(driver,HomePageUI.PasswordInputLogin,password);
        Click.on(driver,HomePageUI.Login);
        Enter.text(driver,TodoHome.todoInput,nameTodo);
        Click.on(driver,TodoHome.todoAddButton);
    }
}
