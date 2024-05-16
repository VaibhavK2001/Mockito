import org.example.TodoService;

import java.util.List;

public class TodoServiceStub implements TodoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return List.of("Learn spring MVC", "Learn spring Core", "Learn Dance", "Learn spring");
    }
}
