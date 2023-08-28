package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.userStudent;

public interface studentRepo  extends JpaRepository<userStudent,Long>{

}
