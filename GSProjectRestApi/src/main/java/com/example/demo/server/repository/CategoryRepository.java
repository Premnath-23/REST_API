package com.example.demo.server.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
