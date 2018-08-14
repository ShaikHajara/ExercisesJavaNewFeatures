package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class UsingLambda {

	static List<String> list=new ArrayList<String>();
	//static String str2;


	public static void main(String args[]){

		//iterate strings in list

		list.add("hi");
		list.add("hello");
	    list.add("h r u");

	    list.forEach((n)->System.out.println(n));


	    //using lambda
	Sayable s1=(name)-> {
		return "Hello" +" " +name;
	};

    System.out.println(s1.say("Motu"));

  //Or we can omit parantheses

	Sayable s2=name ->{
		return "Hi" +" " +name;

	};
	System.out.println(s2.say("Shannu"));


	//Multiple parameters
     Addable ad1=(a,b)->(a+b);
     System.out.println(ad1.add(10,20));


   Sayable s3=name->{
	   return "H r u"+" " +name;
	  };

	  System.out.println(s3.say("shannu"));

	//pass multiple statements

	Sayable s4=(message)->{

		String str1="I would like to ask,";
		String str2=str1+message;
		return str2;

	};

	System.out.println(s4.say("How are you?"));


	//example of creating thread without using lambda

	Runnable r1=new Runnable() {

		@Override
		public void run(){
			System.out.println("Running thread 1");

		}
		};
		Thread t1=new Thread(r1);
		t1.start();


		//example of creating thread using lambda

		Runnable r2=()->{

			System.out.println("Running thread2");
	      };
	      Thread t2=new Thread(r2);
	      t2.start();


	      //Java lambda expression can be used in the collection framework. It provides efficient and concise way to iterate, filter and fetch data





	}





}
