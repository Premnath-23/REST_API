package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.model.SoftWare;
import com.example.demo.repository.componentRepo;

@Service
public class componentService {
	@Autowired
	private componentRepo componentrepo;
	public List<SoftWare> getAllSoftWare(){
		return componentrepo.findAll();
	}
	public SoftWare getSoftWareById(Long id) {
		return componentrepo.findById(id).orElse(null);
	}
	public SoftWare saveSoftWare(SoftWare software) {
		return componentrepo.save(software);
	}
	
	
	
	public List<SoftWare> sortByAsc(String sftname){
		return componentrepo.findAll(Sort.by(sftname).ascending());
	}
	
	public List<SoftWare> pagination(int pageNum, int pageSize)
	{
		Page<SoftWare>cont=componentrepo.findAll(PageRequest.of(pageNum, pageSize));
		return cont.getContent();
	}
	

    //Sorting
//    public List<Product> sortByAsc(String name)
//    {
//    	return productRepository.findAll(Sort.by(name).descending());
//    }
//    
//    //Pagination
//    public List<Product> pagination(int pageNum, int pageSize)
//    {
//    	Page<Product> cont=productRepository.findAll(PageRequest.of( pageNum,pageSize));
//    	return cont.getContent();
//    }
//    
//    //pagination and sorting
//    public List<Product>paginationAndSorting(int pageNum, int pageSize, String name)
//    {
//    	Page<Product> cont=productRepository.findAll(PageRequest.of( pageNum,pageSize, Sort.by(name)));
//    	return cont.getContent();
//    	
//    }
}
