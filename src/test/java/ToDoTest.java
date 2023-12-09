import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.AddTodo;

public class ToDoTest extends BaseTest {
    @Test
    public void addTodo(){
        AddTodo.as(webDriver,"dafne2@gmail.com","password","Tarea completada");
    }
}
