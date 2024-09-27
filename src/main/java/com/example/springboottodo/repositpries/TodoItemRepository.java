package com.example.springboottodo.repositpries;

import com.example.springboottodo.Models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository
        extends JpaRepository<TodoItem, Long> {

}
