package io.tej.SwaggerSpringDemo.Database;

import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Book {

    @Id
    private UUID id;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
    }
}
