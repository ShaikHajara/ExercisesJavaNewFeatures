package com.foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	// For each method is default method defined in Iterable
	// interface.Collection classes which extends
	// iterable interface can use foreach loop to iterate elements.This method
	// takes a single parameter which is a functional interface. So, you can
	// pass lambda expression as an argument

	public static void main(String args[]) {

		final List<String> gameslist = new ArrayList<String>();
		gameslist.add("Football");
		gameslist.add("Tennis");
		gameslist.add("Cricket");
		gameslist.add("Chess");
		gameslist.add("Hocky");

		gameslist.forEach(g -> System.out.println(g.length()));
		gameslist.forEach(games -> System.out.println(games));
		System.out.println("--------------------");
		// Foreachordered method used to iterate elements in the order specified
		// by the stream.
		gameslist.stream().forEachOrdered(games -> System.out.println(games));
		System.out.println("--------------------");
		gameslist.stream().forEachOrdered(System.out::println);

	}
}
