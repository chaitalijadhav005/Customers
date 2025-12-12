package com.example.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Customer.Model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository <Customer,Integer>  {

}

