package com.gudu.CustomerDataManagement.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gudu.CustomerDataManagement.entity.Customer;
import com.gudu.CustomerDataManagement.service.service;

@RestController
public class CustomerControler {
@Autowired
		private service ser;

		// save data in postman
		@PostMapping("/customer")
		public @ResponseBody Customer saveCustomer(@RequestBody Customer customer) {
			return ser.saveCustomer(customer);
		}
		
		// update data
		@PutMapping("/customer")
		public @ResponseBody Customer updateCustomer(@RequestBody Customer customer) {
			return ser.updateCustomer(customer);
		}

		// get all data from post man
		@GetMapping("/customer")
		public @ResponseBody List<Customer> getAllCustomerData(@RequestBody Customer customer) {
			return ser.getAllCustomerDate();
		}

		// get all id in our database in using postman
		@GetMapping("/customer/[id]")
		public @ResponseBody Customer getCustomerDataById(@PathVariable("id") int id) {
			return ser.getDataById(id);
		}

		// delete the idfrom database using postman
		@DeleteMapping("/customer")
		public @ResponseBody Customer deleteCustomeDataById(@RequestParam("id") int id) {
			return ser.deleteCustomeDataById(id);
		}
		@GetMapping("/customer/{name}")
		public List<Customer>getCustomerByName(@PathVariable("name")String Name){
			return ser.getCustomerByName(Name);

	}
		@PostMapping("/customer/{email}")
		public List<Customer>validateCustomer(String name,String email){
			return null ;
			
		}

	}


