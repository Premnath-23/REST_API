package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;
import com.example.demo.repo.userRepo;

@RestController
@RequestMapping("/")
public class userController 
{
	@Autowired
	userRepo srepo;
	@PostMapping()
		public User saveDetails(@RequestBody User aj)
		{
			return  srepo.save(aj);
		}
	@GetMapping()
	public List<User>getDetails()
	{
		return srepo.findAll();
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id")int id)
	{
		srepo.deleteById((long) id);	
		return "The id "+id+" is deleted";
	}
}