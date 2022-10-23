package io.tej.SwaggerSpringDemo.Controller;

import io.tej.SwaggerCodgen.api.BookApi;
import io.tej.SwaggerCodgen.model.Book;
import io.tej.SwaggerSpringDemo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements BookApi {

    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public ResponseEntity<String> addBook(Book book) {
        if (book.getAuthor() == null || book.getTitle() == null){
            return ResponseEntity.badRequest().body("Invalid Request");
        }
        bookRepository.save(book);
        return ResponseEntity.ok(book.getTitle()+" is added");
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> bookList = bookRepository.findAll();
        return ResponseEntity.ok(bookList);
    }
}
