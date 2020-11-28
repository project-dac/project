package project.pocs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class RCC {
	
	private ProductRepo r;
	
	
	@Autowired
	public void f1(ProductRepo y)
	{ 
		System.out.println("autowired successfully");
		r =y;
		
	}
	
	
	
	
	//http://localhost:7070/hw
	@GetMapping("/hw")
	public String f1()
	{
		return "hey web servcie is working";
		
	}
	
	//all below things are not provided in lab exam
	//insert
	@PostMapping("/insertpr")
	public Product ins(@RequestBody Product x)
	{
		if(r.existsById(x.getProdid()))
		{
			x.setProdid("");
			
		}
		else
				r.save(x);
		
		//logic being if client sees eraserid as zero let him understand
		//add did not work
		return x;
		
		
	}
	
	//update
	@PostMapping("/updatepr")
	public Product up(@RequestBody Product x)
	{
		if(r.existsById(x.getProdid()))
		{
			r.save(x);
			
		}
		else
				x.setProdid("");
		
		//logic being if client sees eraserid as zero let him understand
		//update did not work
		return x;
		
		
	}
	
	
	/*@GetMapping("/qop")
	public Eraser ss(@RequestParam("x") int x )
	{
		Eraser e =new Eraser(0,0);
		Optional<Eraser> o=r.findById(x);
		if(o.isPresent())
		{
			e=o.get();
		}
		//
		return e;
				
	}*/
	
	@GetMapping("/ms")
	public List<Product> f3()
	{
		return r.findAll();
		
	}
	
	
	
	
	

}
