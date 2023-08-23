package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.petrolBunkk;
import com.example.demo.service.fuelservice;
@RestController
public class fuelController{
		@Autowired
		fuelservice<petrolBunkk> fueser;
		@PostMapping("/fuelSave")
		public petrolBunkk saveFuelStationDe(@RequestBody petrolBunkk pb)
		{
			return fueser.saveDetails(pb);
		}
		@GetMapping("/getFuel")
		public List<petrolBunkk>getFuelStationDe()
		{
			return fueser.getDetails();
		}
}
