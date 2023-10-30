package com.example.listofbooks.controller;

import com.example.listofbooks.modal.BookList;
import com.example.listofbooks.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books/api")
public class BookController {
    private final BookService bs;
    @Autowired
    public BookController(BookService bs){
        this.bs=bs;
    }
    @GetMapping
    public List<BookList> getAllBooks() {
        return bs.getAllBooks();
    }

    @PostMapping
    public void createBook(@RequestBody BookList booklist) {

    }

    @GetMapping("/{id}")
    public BookList getBookById(@PathVariable Long id) {
        return bs.getBookById(id);
    }

    @PutMapping("/{id}")
    public BookList updateBook(@PathVariable Long id, @RequestBody BookList updatedBook) {
        return bs.updateBook(id, updatedBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bs.deleteBook(id);
    }

}
