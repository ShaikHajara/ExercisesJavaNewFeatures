package com.lambda;

public class Lambda {


	static //It provides implementation to interface which has functional interface which saves a lot of code
	//Functional interface in nothing but an interface which has only one abstract class


	int width=30;

	public static void main(String args[]){

   WithoutUsingLambdaExp d2=()->{
	   System.out.println("Draw" + width);
   };

   d2.draw();


	}
}
