package com.math.operations;

public class Mathop {
	  public void add(int a,int b){
	        System.out.println("Sum of these numbers = "+(a+b));
	    }
	    public void sub(int a,int b){
	        System.out.println("subtractiion of these number = "+(a-b));
	    }
	    public static void main(String[] args){

	        Mathop m = new Mathop();
	        m.add(10,5);
	        m.sub(10,5);
	    }
}
