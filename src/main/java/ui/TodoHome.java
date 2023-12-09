package ui;

import org.openqa.selenium.By;

public class TodoHome {
    public static By logoutButton = By.id("ctl00_HeaderTopControl1_LinkButtonLogout");
    public  static By projectButton=By.xpath("//td[.='Add New Project']");
    public static By newProjectInput=By.id("NewProjNameInput");
    public static By addProjectButton=By.id("NewProjNameButton");

    public static By listProjectButton=By.id("TitleProjects");

    public static By todoInput=By.id("NewItemContentInput");
    public static By todoAddButton=By.id("NewItemAddButton");
}
