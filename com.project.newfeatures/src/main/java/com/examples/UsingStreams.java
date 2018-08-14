package com.examples;

import java.util.ArrayList;
import java.util.List;

public class UsingStreams extends Product{

	public UsingStreams(int id, String name, float price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){

		   List<Product> productsList = new ArrayList<Product>();
	        //Adding Products
	        productsList.add(new Product(1,"HP Laptop",25000f));
	        productsList.add(new Product(2,"Dell Laptop",30000f));
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));
	        productsList.add(new Product(4,"Sony Laptop",28000f));
	        productsList.add(new Product(5,"Apple Laptop",90000f));


	        //finding max price using stream
	        Product productA=productsList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
	        System.out.println(productA.price);

	        //finding min price using stream
	        Product productB=productsList.stream().max((p1,p2)->p1.price<p2.price?1:-1).get();
	        System.out.println(productB.price);

	}

}
