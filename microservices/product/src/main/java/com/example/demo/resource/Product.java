package com.example.demo.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	Integer ProductId;
	String name;
	String category;
	String brand;
	double price;

}
