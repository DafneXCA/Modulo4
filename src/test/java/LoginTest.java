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
        Login.as(webDriver,"dafne","dafne@gmail.com");
    }

    @Test
    public void logoutTest(){
        Logout.as(webDriver,"dafne","dafne@gmail.com");
    }



}
