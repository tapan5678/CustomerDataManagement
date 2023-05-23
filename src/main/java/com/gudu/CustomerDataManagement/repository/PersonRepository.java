package com.gudu.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gudu.CustomerDataManagement.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
