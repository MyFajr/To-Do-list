package com.example.springboottodo.services;

import com.example.springboottodo.Models.TodoItem;
import com.example.springboottodo.repositpries.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service

public class TodoItemService {
    @Autowired
    private TodoItemRepository todoItemRepository;

    public Iterable<TodoItem> getAll() {
        return todoItemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }

    public TodoItem save(TodoItem todoItems) {
        if (todoItems.getId() == null) {
            todoItems.setCreatedAt(Instant.now());
        }
        todoItems.setUpdateAt(Instant.now());
        return todoItemRepository.save(todoItems);
    }

    public void delete(TodoItem todoItems) {
        todoItemRepository.delete(todoItems);
    }

}
