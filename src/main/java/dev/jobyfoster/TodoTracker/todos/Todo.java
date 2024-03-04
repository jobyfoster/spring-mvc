package dev.jobyfoster.TodoTracker.todos;

import jakarta.persistence.*;

@Entity
@Table
public class Todo {
    @Id
    @SequenceGenerator(
            name="todo_sequence",
            sequenceName = "todo_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "todo_sequence"
    )
    private int id;
    private String todo;

    public Todo() {
    }

    public Todo(int id, String todo) {
        this.id = id;
        this.todo = todo;
    }

    public Todo(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }


}
