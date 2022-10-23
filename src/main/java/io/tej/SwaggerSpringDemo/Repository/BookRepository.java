package io.tej.SwaggerSpringDemo.Repository;

import io.tej.SwaggerCodgen.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    Book findBookById(UUID id);
    Book findBookByTitle(String author);
    Book findAllById(UUID id);
    Book findALlByTitle(String title);
}
