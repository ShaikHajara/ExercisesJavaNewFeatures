package com.examples1;

public class Product {

	int id;
	String name;
	float price;

	public Product(int id,String name,float price){

		this.id=id;
		this.name=name;
		this.price=price;

	}

	public float getPrice(){
		   return price;
	   }
}
