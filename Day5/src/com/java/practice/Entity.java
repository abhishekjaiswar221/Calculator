package com.java.practice;

public class Entity {
	private int num1;
	private int num2;
	private int result;
	private String name;
	
//	public void setNum1(int n1, int n2)
//	{
//		num1 = n1;	
//		num2 = n2;
//	}
//	public int getNum1(){
//		return num1;
//	}
//	public int getNum2() {
//		return num2;
//	}
	
	Entity(int n1, int n2, String n){
		num1 = n1;
		num2 = n2;
		int result = num1 + num2;
		name = n;
		
		System.out.println(num1+ " "+ num2 + " " + result + " " + name);
				
	}
	
}
