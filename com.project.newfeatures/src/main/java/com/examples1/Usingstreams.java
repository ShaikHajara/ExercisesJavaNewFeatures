package com.examples1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Usingstreams extends Product
{

   public Usingstreams(int id,String name,float price){

	   super(id,name,price);
   }




   public static void main(String args[]){

	   List<Product> productList=new ArrayList<Product>();
       productList.add(new Product(1,"Samsung",20000f));
       productList.add(new Product(2,"Intex",10000f));
       productList.add(new Product(3,"LG",234000f));

      //find max price
       Product product1=productList.stream().max((p1,p2)->p1.price >p2.price?1:-1).get();
       System.out.println(product1.price);

       //find min price
       Product product2=productList.stream().max((p1,p2)->p1.price<p2.price?1:-1).get();
       System.out.println(product2.price);

      //sum the price
       double totalprice=productList.stream().collect(Collectors.summingDouble(product -> product.price));
       System.out.println(totalprice);

       //finding count

       long count=productList.stream().filter(product->product.price>10000).count();
       System.out.println(count);

       //convert list to set .it removes duplicates using set which has product value greater than  10000

       Set<Float> productListInSet=productList.stream().filter(product->product.price>10000).map(product->product.price).collect(Collectors.toSet());
       System.out.println(productListInSet);

       //convert product list in to map

       Map<Integer,String> productListInMap=productList.stream().collect(Collectors.toMap(productA->productA.id, productA->productA.name));
       System.out.println(productListInMap);

       //collecting data as list using method reference in stream

        List<Float> productpricelist=productList.stream().filter(p->p.price>10000).map(Product::getPrice).collect(Collectors.toList());
        System.out.println(productpricelist);

        //filter and iterating collection

        productList.stream().filter(p->p.price==234000).forEach(p->System.out.println(p.name));


        //iterate,filter,pass limit to fix iteration -Repeat loop infinite times

        Stream.iterate(2, i->i+2).filter(i->i%2==0).limit(5).forEach(System.out::println);


   }

}
