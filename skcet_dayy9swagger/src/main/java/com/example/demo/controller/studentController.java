package com.example.demo.controller ;
import java.util.List ;
import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.web.bind.annotation.DeleteMapping ;
import org.springframework.web.bind.annotation.GetMapping ;
import org.springframework.web.bind.annotation.PathVariable ;
import org.springframework.web.bind.annotation.PostMapping ;
import org.springframework.web.bind.annotation.RequestBody ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;
import com.example.demo.model.userStudent ;
import com.example.demo.repo.studentRepo ;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/")
public class studentController {
	@Autowired
	studentRepo srepo;
	@PostMapping()
	@Tag(name="Add user", description="Add user in database")
		public userStudent saveDetails(@RequestBody userStudent aj)
		{
			return  srepo.save(aj);
		}
	@GetMapping()
	@Tag(name="Add user", description="Add user in database")
	public List<userStudent>getDetails()
	{
		return srepo.findAll();
	}
	@DeleteMapping("/{id}")
	@Tag(name="Add user", description="Add user in database")
	public String deleteStudent(@PathVariable("id")int id)
	{
		srepo.deleteById((long) id);	
		return "The id "+id+" is deleted";
	}
}