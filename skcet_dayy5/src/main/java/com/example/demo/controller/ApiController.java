package com.example.demo.controller;
import com.example.demo.model.Book;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api")
public class ApiController {
    private final ApiService bookService;
    @Autowired
    public ApiController(ApiService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
    	return bookService.createBook(book);
	}
	@PutMapping("/books/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}

