import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.AddProject;

public class ProjectTest extends BaseTest {
    @Test
    public void addProject(){
        AddProject.as(webDriver,"dafne2@gmail.com","password","Diplomado V5");
    }

}
