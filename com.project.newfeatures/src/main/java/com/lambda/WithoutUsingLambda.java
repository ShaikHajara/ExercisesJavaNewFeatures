package com.lambda;

public  class WithoutUsingLambda{

	static int width=20;

	public static void main(String args[]){


	WithoutUsingLambdaExp d=new WithoutUsingLambdaExp() {

	@Override
	public void draw() {
		System.out.println("Drawable" +" "+ width); 	}
	};

	d.draw();
	}


}
