package com.example.Customer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Model.Customer;
import com.example.Customer.Service.CustomerService;

@RestController
public class CustomerController {
	//Alternative of @Autowired
	private final CustomerService cs;
	public CustomerController (CustomerService cs) {
		this.cs =cs;
	}
 @GetMapping("/")
 public String home() {
	 return "hello world";
 }
 
 @PostMapping("/add")
 public void add(@RequestBody Customer customer) {
	 System.out.println(customer);
	 cs.add();
 }
}

