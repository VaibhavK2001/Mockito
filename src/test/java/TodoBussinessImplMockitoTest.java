import org.example.TodoBussinessImpl;
import org.example.TodoService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBussinessImplMockitoTest {

    @Test
    public void usingMockito() {
        TodoService todoService = mock(TodoService.class);
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");
        when(todoService.retrieveTodos("User")).thenReturn(allTodos);
        TodoBussinessImpl todoBusinessImpl = new TodoBussinessImpl(todoService);
        List<String> todos = todoBusinessImpl.retrieveTodosReleatedtoSpring("User");
        assertEquals(2, todos.size());
    }
}
