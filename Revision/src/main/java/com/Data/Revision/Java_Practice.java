package com.Data.Revision;

public class Java_Practice {
	
	public static void main(String[] args){
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		boolean value;
//		int val;
//		value = (c == a-b) ;
//		System.out.println("value is : "+value);
//		
//		val = (c==a-b) ? 100:200;
//		System.out.println("val is : "+val);
//		
//		
//		
//		//array example
		//String cars[] = {"BMW","Audi","LandHover","Honda","Suzuki","Toyota"}; 
		//Print_Array(cars);
		
//		int num[] = {1,2,3,4,5,6};
//		Int_Array(num);		
		
		
//		int return_Int[] = IntArray(); 
//		for(int k = 0;k<return_Int.length;k++){
//			System.out.println("number is : "+return_Int[k]);
//		}
		
		
//		System.out.println("Lenth of cars is : "+cars.length);
//		
//		System.out.println("3 car company is : "+cars[2]);
//		
//		System.out.println("last car is : "+cars[cars.length-1]);
//		
//		for(int i=0;i<cars.length;i++){
//			System.out.println("car name is : "+cars[i]);
//		}	
		
//		String[] arrayMethod = ReturnArray();
//		for(int i = 0 ;i<arrayMethod.length;i++){
//			System.out.println("car name is : "+arrayMethod[i]);
//		}
		
		
		String testing = "Selenium Automation Framework";
		String test = "Basic Java Tutorial";
		
		//.equals() method
		System.out.println(".equals() method : "+test.equals(testing));
		
		//.charAt() method
		System.out.println(".charAt() method : "+testing.charAt(15));
		
		//.contains() method
		System.out.println(".contains() method : "+testing.contains("Automation"));
		
		//.indexOf() method
		System.out.println(".indexOf() method : "+testing.indexOf("F"));
		
		//subString() method
		System.out.println(".subString() method : "+testing.substring(15));
		
		//subString() method
		System.out.println(".subString() method : "+testing.substring(10, 20));
		
		//.toLowerCase() method
		System.out.println(".toLowerCase() method : "+test.toLowerCase());
		
		//.split() method
		String[] splitMethod = test.split("Java");
		System.out.println(".split() method1 : "+splitMethod[0]);
		System.out.println(".split() method2 : "+splitMethod[1]);
	}
	
	
	//Passing array to a method
//	public static void Print_Array(String[] car){
//		for(int i=0;i<car.length;i++){
//			System.out.println("car name is : "+car[i]);
//		}
//	}
	//Returning an Array from a Method
	
//	public static String[] ReturnArray(){
//		String cars[] = {"BMW","Audi","LandHover","Honda","Suzuki","Toyota"}; 		
//		return cars;
//	}
//	
//	
//	public static void Int_Array(int [] num){
//		for(int i = 0;i<num.length;i++){
//			System.out.println("i value : "+num[i]);
//		}
//	}
//	
//	public static int[] IntArray(){
//		int numbers[] = {1,2,3,4,5,6,7,8};
//		return numbers;
//	}
}