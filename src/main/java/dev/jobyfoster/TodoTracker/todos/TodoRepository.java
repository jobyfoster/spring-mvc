package dev.jobyfoster.TodoTracker.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    @Query("SELECT s FROM Todo s WHERE s.id = ?1")
    Optional<Todo> findTodoById(int id);
}
