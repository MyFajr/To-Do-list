package com.example.springboottodo.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;


@Getter
@Setter
@Entity
@Table(name = "todo_items")
public class TodoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Boolean isComplete;
    private Instant createdAt;
    private Instant updateAt;

    @Override
    public String toString() {
        return String.format("TodoItems { id= '%d'," +
                        " description = '%s', isComplete = '%s'," +
                        " createdAt = '%s', updateAt = '%s' }",
                id, description, isComplete, createdAt, updateAt);

    }
}

