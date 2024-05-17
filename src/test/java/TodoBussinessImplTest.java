import org.example.TodoBussinessImpl;
import org.example.TodoService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoBussinessImplTest {

    //TodoBussinessimpl Test Using Stub
    @Test
    public void retrieveTodosReleatedtoSpringTest(){
        TodoService todoServicestub = new TodoServiceStub();
        TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(todoServicestub);
        List<String> filterTodos = todoBussinessImpl.retrieveTodosReleatedtoSpring("dummy");
        assertEquals(3,filterTodos.size());
    }

}
