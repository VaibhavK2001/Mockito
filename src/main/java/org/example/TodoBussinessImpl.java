package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoBussinessImpl {

    private  TodoService todoService;

    public TodoBussinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosReleatedtoSpring(String user){
        List<String> filterTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);
        for (String todo : todos) {
            if (todo.contains("Spring")) {
                filterTodos.add(todo);
            }
        }
        return filterTodos;
    }
}
