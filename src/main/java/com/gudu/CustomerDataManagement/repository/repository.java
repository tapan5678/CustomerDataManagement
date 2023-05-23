package com.gudu.CustomerDataManagement.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gudu.CustomerDataManagement.entity.Customer;

public interface repository extends JpaRepository<Customer,Integer> {
	
 List<Customer>findByName(String name);
	@Query("SELECT c FROM Customer c WHERE c.name AND c.email=:email")
	List<Customer>ValidateCustomer(@Param("name")String name,@Param("email")String email);
}

