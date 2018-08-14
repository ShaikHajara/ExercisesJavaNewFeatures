package com.stringjoiners;

import java.util.StringJoiner;

public class ExampleStringJoiners {



	//string joiner is final class in java.util package

	public  void joinStringsUsingComma(){

		StringJoiner str=new StringJoiner(",");
		str.add("Apple");
		str.add("Lemon");
		str.add("Guava");
		str.add("Watermelon");
		str.add("Muskmelon");

		System.out.println(str);

	}

	public void joinStringsUsingHyphen(){

		StringJoiner str=new StringJoiner("-");
		str.add("Apple");
		str.add("Lemon");
		str.add("Guava");
		str.add("Watermelon");
		str.add("Muskmelon");

		System.out.println(str);
	}


	public void joinPrefixSuffixToStrings(){

		StringJoiner str=new StringJoiner(",","[","]");
		str.add("Apple");
		str.add("Lemon");
		str.add("Guava");
		str.add("Watermelon");
		str.add("Muskmelon");

		System.out.println(str);

	}

	public void mergeTwoStringJoiner(){

		StringJoiner str1=new StringJoiner(",","[","]");
		str1.add("Apple");
		str1.add("Lemon");
		str1.add("Guava");
		str1.add("Watermelon");
		str1.add("Muskmelon");
        str1.setEmptyValue("empty");
		System.out.println(str1);


		StringJoiner str2=new StringJoiner(":","[","]");
		str2.add("Jasmine");
		str2.add("Sunflower");
		str2.add("Rose");
		str2.add("Lotus");

		StringJoiner strmerge=str1.merge(str2);

		System.out.println(strmerge);

	}

	public void emptystring(){

		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Prints nothing because it is empty
        System.out.println(joinNames);

        // We can set default empty value.
        joinNames.setEmptyValue("It is empty");
        System.out.println(joinNames);


	}

	public static void main(String args[]){
		ExampleStringJoiners join=new ExampleStringJoiners();
		join.joinStringsUsingComma();
		join.joinStringsUsingHyphen();
		join.joinPrefixSuffixToStrings();
		join.mergeTwoStringJoiner();
		join.emptystring();
	}

}
