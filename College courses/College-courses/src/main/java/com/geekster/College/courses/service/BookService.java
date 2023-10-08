package com.geekster.College.courses.service;

import com.geekster.College.courses.model.Book;
import com.geekster.College.courses.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo iBookRepo;
    public String addBook(Book newBook) {
        iBookRepo.save(newBook);
        return "added";
    }

    public List<Book> getBooks() {
        return iBookRepo.findAll();
    }


    public String updateBook(Book book, Long id) {
        Book book1=iBookRepo.findById(id).orElseThrow();
        book1.setPrice(book.getPrice());
        return "update";
    }

    public String deleteBook(Long id) {
        iBookRepo.deleteById(id);
        return "delete";
    }

}
