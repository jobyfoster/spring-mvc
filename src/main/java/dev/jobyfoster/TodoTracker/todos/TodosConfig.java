package dev.jobyfoster.TodoTracker.todos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TodosConfig {

    @Bean
    CommandLineRunner commandLineRunner(TodoRepository repository) {
        return args -> {
            Todo firstTodo = new Todo(
                    "Finish module one"
            );

            Todo secondTodo = new Todo(
                    "Finish module two"
            );

            repository.saveAll(List.of(firstTodo, secondTodo));
        };
    }
}
