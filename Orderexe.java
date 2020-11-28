package project.pocs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class Orderexe {
	
	private  OrderRepository r1;
	
	
	@Autowired
	public void f1(OrderRepository y)
	{ 
		System.out.println("autowired successfully");
		r1 =y;
		
	}
	
	
	
	
	//http://localhost:7070/hw
	@GetMapping("/wiring")
	public String f1()
	{
		return "hey web servcie is working";
		
	}
	
	//all below things are not provided in lab exam
	//insert
	@PostMapping("/insertor")
	public Orders ins(@RequestBody Orders x)
	{
		if(r1.existsById(x.getOrderid()))
		{
			x.setOrderid("");
			
		}
		else
				r1.save(x);
		
		//logic being if client sees eraserid as zero let him understand
		//add did not work
		return x;
		
		
	}
	
	
	
	
	@GetMapping("/getbyid")
	public Orders ss(@RequestParam("x") String x )
	{
		Orders or =new Orders("",0,"");
		Optional<Orders> o =r1.findById(x);
		if(o.isPresent())
		{
			or=o.get();
		}
		//
		return or;
				
	}
	
	@GetMapping("/selectall")
	public List<Orders> f3(@RequestParam("x") int y)
	{
		return r1.oncat(y);
		
	}
	
	
	
	
	

}

