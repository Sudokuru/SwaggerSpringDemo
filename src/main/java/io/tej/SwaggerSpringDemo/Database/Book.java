package io.tej.SwaggerSpringDemo.Database;

import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document
public class Book {

    @Id
    @Field
    private UUID id;
    @Field
    private String title;
    @Field
    private String author;
    @Field
    private String newThing;

    public Book(String title, String author, String newThing) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.newThing = newThing;
    }
}
