package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Customer;
import service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/{id}")
	public Customer list(@PathVariable Integer id) {
		return customerService.list(id);
	}
	
	@PostMapping
	public Customer create(@RequestBody Customer customer) {
		return customerService.add(customer);
	}
}
