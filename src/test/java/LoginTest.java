import base.BaseTest;
import org.testng.annotations.Test;

import task.tasking.*;


public class LoginTest extends BaseTest {
    @Test
    public void singUpTest(){
        SingUp.as(webDriver,"dafne","dafne2@gmail.com","password");
    }

    @Test
    public void loginTest(){
        Login.as(webDriver,"dafne2@gmail.com","password");
    }

    @Test
    public void logoutTest(){
        Logout.as(webDriver,"dafne2@gmail.com","password");
    }



}
