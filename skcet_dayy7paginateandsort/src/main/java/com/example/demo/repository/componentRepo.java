package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.SoftWare;
@Repository
public interface componentRepo extends JpaRepository<SoftWare, Long>{

}
