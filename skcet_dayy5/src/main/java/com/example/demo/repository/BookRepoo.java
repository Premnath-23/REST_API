package com.example.demo.repository;
import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepoo extends JpaRepository<Book, Integer> {
	}

