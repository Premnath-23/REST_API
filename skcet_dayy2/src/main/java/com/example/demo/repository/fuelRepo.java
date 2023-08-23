package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.petrolBunkk;
public interface fuelRepo extends JpaRepository<petrolBunkk,Integer>
{
}
