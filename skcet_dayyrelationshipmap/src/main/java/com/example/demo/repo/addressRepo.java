package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Address;

public interface addressRepo extends JpaRepository <Address,Long>{

}
