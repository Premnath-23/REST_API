package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.SoftWare;
import com.example.demo.service.componentService;

@RestController
@RequestMapping("inssoftware")
public class componentController {
	@Autowired
	private componentService componentservice;
	@GetMapping
	public List<SoftWare> getAllSoftWare(){
		return componentservice.getAllSoftWare();
	}
	@GetMapping("/{id}")
	public SoftWare getSoftWareById(@PathVariable Long id ) {
		return componentservice.getSoftWareById(id);
	}
	@PostMapping
	public SoftWare addSoftWare(@RequestBody SoftWare software) {
		return componentservice.saveSoftWare(software);
	}
	
	
	
	@GetMapping("/sortAsc/{sftnme}")
	public List<SoftWare> sortasc(@PathVariable("sftname")String sftname)
	{
		return componentservice.sortByAsc(sftname);
	}
	

	@GetMapping("/pagination/{num}/{size}")
	public List<SoftWare>paginationEx(@PathVariable("num")int num, @PathVariable("size")int size)
	{
		return componentservice.pagination(num, size);
	}
    //Sort by Ascending
//    @GetMapping("/sortAsc/{name}")
//    public List<Product> sortasc(@PathVariable("name")String name)
//    {
//    	return productService.sortByAsc(name);
//    }
//    
//    //Pagination
//    @GetMapping("/pagination/{num}/{size}")
//    public List<Product> paaginationEx(@PathVariable("num")int num, @PathVariable("size")int size)
//    {
//    	return productService.pagination(num, size);
//    }
//    
//    //paging and sorting
//    @GetMapping("/paginationAndSort/{num}/{size}/{name}")
//    public List<Product> paginationAndSort(@PathVariable("name") int num, @PathVariable("size") int size, @PathVariable("name") String name)
//    {
//    	return productService.paginationAndSorting(num, size, name);
//    }
}
