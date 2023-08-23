package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.petrolBunkk;
import com.example.demo.repository.fuelRepo;
@Service
public class fuelservice <petrolbunkk> {
		@Autowired
		fuelRepo frepo;
		public petrolBunkk saveDetails(petrolBunkk p)
		{
			return frepo.save(p);
		}
		public List<petrolBunkk> getDetails()
		{
			return frepo.findAll();
		}
}
