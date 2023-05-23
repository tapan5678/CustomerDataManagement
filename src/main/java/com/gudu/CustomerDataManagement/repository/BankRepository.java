package com.gudu.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gudu.CustomerDataManagement.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, Integer> {

}
