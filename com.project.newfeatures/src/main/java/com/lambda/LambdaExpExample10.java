package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpExample10 {


	public static void main(String[] args) {

		 List<Products> list=new ArrayList<Products>();
		 //Adding Products
	        list.add(new Products(1,"HP Laptop",25000f));
	        list.add(new Products(3,"Keyboard",300f));
	        list.add(new Products(2,"Dell Mouse",150f));
	        System.out.println("Sorting on the basis of name...");

	        //implementing lambda expressions

	        Collections.sort(list,(p1,p2)->{

	        	return p1.name.compareTo(p2.name);
	        });

	        for(Products p:list){
	        	System.out.println(p.id +" "+ p.name +" "+ p.price);
	        }

	        //filter collecting data

	        Stream<Products> filteredData=list.stream().filter(p->p.price>300);
	        filteredData.forEach(
	        		products->System.out.println(products.name+":"+ products.price)
	        		);


	        //fetching data as list

	      List<Float> otherlist= list.stream().map(x->x.price).collect(Collectors.toList());
	      System.out.println(otherlist);

	      //converting data as set

	     Set<Float> set= list.stream().map(x->x.price).collect(Collectors.toSet());
	     System.out.println(set);
	}

}
