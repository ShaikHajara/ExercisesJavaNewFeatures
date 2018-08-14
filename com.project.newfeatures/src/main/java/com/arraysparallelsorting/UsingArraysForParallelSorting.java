package com.arraysparallelsorting;

import java.util.Arrays;

public class UsingArraysForParallelSorting {

	public void arraysorting(){
		int arr[]={5,10,1,3,45,2};

		for(int i:arr){
			System.out.println(i+ " ");
		}

		//Sorting array elements parallel
		System.out.println("\nArray elements after sorting");
		Arrays.parallelSort(arr);
		//Iterating array elements
		for(int i:arr){
			System.out.println(i+" ");
		}

	}

	public void passingstartandendindex(){

		  // Creating an integer array
        int[] arr = {5,8,1,0,6,9,50,-3};
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
        // Sorting array elements parallel and passing start, end index
        Arrays.parallelSort(arr,0,8);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }

	}

	public static void main(String args[]){
		UsingArraysForParallelSorting sort=new UsingArraysForParallelSorting();
		sort.arraysorting();
		sort.passingstartandendindex();
	}


}
