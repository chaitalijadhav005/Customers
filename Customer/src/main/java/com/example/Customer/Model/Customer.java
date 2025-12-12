package com.example.Customer.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="online_customer")
public class Customer {
	
	private Integer id;
	private String name;
	private String email;
	private String mobile;
	private String address;
	private String password;
	

}
