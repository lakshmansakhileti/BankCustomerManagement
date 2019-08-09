package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import model.Customer;

@Service
public class CustomerService {
	Map<Integer, Customer> cache = new HashMap<Integer, Customer>();
	
	public Customer list(Integer id) {
		 return cache.get(id);
	}
	
	public Customer add(Customer customer) {
		cache.put(cache.size()+1, customer);
		return customer;
	}
}
