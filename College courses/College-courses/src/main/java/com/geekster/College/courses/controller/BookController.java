package com.geekster.College.courses.controller;

import com.geekster.College.courses.model.Book;
import com.geekster.College.courses.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book newBook){
        return  bookService.addBook(newBook);
    }

    @GetMapping("books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @PutMapping("book/id/{id}")
    public String updateBook(@RequestBody Book book, @PathVariable Long id){
        return  bookService.updateBook(book, id);
    }

    @DeleteMapping("book/id/{id}")
    public String deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id);
    }
}
