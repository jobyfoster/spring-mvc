package dev.jobyfoster.TodoTracker.todos;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodo(int todoID) {
        boolean exists = todoRepository.existsById(todoID);

        if(!exists) {
            throw new IllegalStateException("todo with id " + todoID + " does not exist.");
        }
        return todoRepository.findTodoById(todoID);
    }

    public void createNewTodo(Todo todo) {
        todoRepository.save(todo);
    }


    public void deleteTodo(int todoID) throws IllegalAccessException {
        boolean exists = todoRepository.existsById(todoID);
        if(!exists) {
            throw new IllegalAccessException("todo with id " + todoID + " does not exist.");
        }
        todoRepository.deleteById(todoID);
    }


    @Transactional
    public void updateTodo(int todoID, String todo) {
        Todo todoToUpdate = todoRepository.findById(todoID)
                .orElseThrow(() -> new IllegalStateException(
                        "todo with id " + todoID + " does not exit"
                ));
        if (todo != null && !todo.isEmpty()){
            todoToUpdate.setTodo(todo);
        }

    }
}
