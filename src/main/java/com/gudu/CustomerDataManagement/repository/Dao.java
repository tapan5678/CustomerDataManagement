package com.gudu.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.gudu.CustomerDataManagement.entity.Customer;

public class Dao {
	
		@Autowired
		private repository repo;

		public Customer saveCustomer(Customer customer) {
			return repo.save(customer);
		}

		public List<Customer> getAllCustomerData() {
			return repo.findAll();
		}

		public Customer getCustomerDataById(int id) {
			return repo.findById(id)
					.orElse(new Customer(HttpStatus.NOT_FOUND.value(), 
							HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.name()));
		}
		public Customer deleteCustomeDataById(int id) {
			Customer customer=   getCustomerDataById(id);
			if(customer.getId()!=404) {
				 repo.deleteById(id);
			}
			 return customer;
		}
		public List<Customer> getCustomerByName(String Name) {
			return repo.findByName(Name);
	}
		public List<Customer>validateCustomer(String name,String email){
			return repo.ValidateCustomer(name,email);
		}

}
