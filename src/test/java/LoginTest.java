import base.BaseTest;
import org.testng.annotations.Test;

import task.tasking.*;


public class LoginTest extends BaseTest {
    @Test
    public void singUpTest(){
        SingUp.as(webDriver,"dafne","dafne@gmail.com","password");
    }

    @Test
    public void loginTest(){
        Login.as(webDriver,"dafne@gmail.com","password");
    }

    @Test
    public void logoutTest(){
        Logout.as(webDriver,"dafne@gmail.com","password");
    }



}
