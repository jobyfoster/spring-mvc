package dev.jobyfoster.TodoTracker.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/todos")
public class TodoController {

    private final TodoService todoService;
    @Autowired

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(path="get-todos/")
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping
    public void createNewTodo(@RequestBody Todo todo) {
        todoService.createNewTodo(todo);
    }

    @GetMapping(path = "get-todo/{todoID}/")
    public Optional<Todo> getTodo(@PathVariable("todoID") int todoID) {
        return todoService.getTodo(todoID);
    }

    @DeleteMapping(path="delete/{todoID}/")
    public void deleteTodo(@PathVariable("todoID") int todoID) throws IllegalAccessException {
        todoService.deleteTodo(todoID);
    }

    @PutMapping(path="update/{todoID}/")
    public void updateTodo(
            @PathVariable("todoID") int todoID,
            @RequestParam(required = false) String todo
    ){
        todoService.updateTodo(todoID, todo);
    }
}
