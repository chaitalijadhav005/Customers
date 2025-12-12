package com.example.Customer.Mapper;

import java.util.ArrayList;
import java.util.List;

import com.example.Customer.DTO.CustomerDTO;
import com.example.Customer.Model.Customer;

public class CustomerDTOMapper {
	public static List<CustomerDTO> convertIntoDTO(List<Customer> customer) {

		List<CustomerDTO> dto = new ArrayList<>();
		for (Customer x : customer) {
			dto.add(new CustomerDTO(x.getId(), x.getName(), x.getEmail(), x.getAddress(), x.getMobile()));
		}
		return dto;

	}

	public static CustomerDTO convertIntoDTO(Customer customer) {

		CustomerDTO dto = new CustomerDTO(customer.getId(), customer.getName(), customer.getEmail(),
				customer.getAddress(), customer.getMobile());

		return dto;

	}
}

