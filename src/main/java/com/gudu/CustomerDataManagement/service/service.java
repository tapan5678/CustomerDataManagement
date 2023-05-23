package com.gudu.CustomerDataManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gudu.CustomerDataManagement.entity.Customer;
import com.gudu.CustomerDataManagement.repository.Dao;
import com.gudu.CustomerDataManagement.repository.Dao;



	@Service
	public class service {
		@Autowired
		private Dao d;
		public Customer saveCustomer(Customer customer) {
			return d.saveCustomer(customer);
			
		}
		
		public Customer updateCustomer(Customer customer) {
			return d.saveCustomer(customer);
		}
		
		public List<Customer> getAllCustomerDate() {
			return d.getAllCustomerData();
		}
		
		
		public Customer getDataById(int id) {
			return d.getCustomerDataById(id);
		}
		
		
		
		public Customer deleteCustomeDataById(int id) {
			return d.deleteCustomeDataById(id);
		}

		public List<Customer>getCustomerByName(String name){
			return d.getCustomerByName(name);
	}
		
		public static List<Customer>validateCustomer(String name,String email){
			return service.validateCustomer(name, email);
		
	}

}
