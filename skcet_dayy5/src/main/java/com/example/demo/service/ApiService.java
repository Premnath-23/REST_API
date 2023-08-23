package com.example.demo.service;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ApiService {
	private final BookRepoo bookRepoo;
    @Autowired
    public ApiService(BookRepoo bookRepoo) {
        this.bookRepoo = bookRepoo;
    }
    public List<Book> getAllBooks() {
        return bookRepoo.findAll();
    }
    public Book getBookById(int id) {
        Optional<Book> optionalBook = bookRepoo.findById(id);
        return optionalBook.orElse(null);
    }
    public Book createBook(Book book) {
        return bookRepoo.save(book);
    }
   public Book updateBook(int id, Book updateBook) {
       Optional<Book> optionalBook = bookRepoo.findById(id);
       if (optionalBook.isPresent()) {
    	   Book book = optionalBook.get();
    	   book.setBookName(updateBook.getBookName());
    	   book.setPrice(updateBook.getPrice());
           book.setQuantity(updateBook.getQuantity());
           book.setAuthorName(updateBook.getAuthorName());
           return bookRepoo.save(book);
        }
        return null;
    }
    public void deleteBook(int id) {
        bookRepoo.deleteById(id);
    }
}
