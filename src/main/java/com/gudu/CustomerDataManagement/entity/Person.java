package com.gudu.CustomerDataManagement.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Person implements Serializable  {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String emai;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="person")
	private List<BankAccount>accounts;
}
