package ui;

import org.openqa.selenium.By;

public class HomePageUI {

    public static By button = By.xpath("//img[@src='/Images/design/pagesignup.png']");
    public static By fullNameInput=By.id("ctl00_MainContent_SignupControl1_TextBoxFullName");
    public static By EmailInput=By.id("ctl00_MainContent_SignupControl1_TextBoxEmail");
    public static By PasswordInput=By.id("ctl00_MainContent_SignupControl1_TextBoxPassword");

    public static By checkBox=By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms");

    public static By singUp=By.id("ctl00_MainContent_SignupControl1_ButtonSignup");



//Login-----------------------------------
    public static By buttonLogin=By.xpath("//*[@id='ctl00_MainContent_PanelNotAuth']/div[2]/div[1]/div[2]/a/img");

    public static By EmailInputLogin=By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
    public static By PasswordInputLogin=By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");
    public static By Login=By.id("ctl00_MainContent_LoginControl1_ButtonLogin");
}
