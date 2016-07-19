package java_Inheritance;

public class Parent_Class {

	int number=2;
	public int SampleMethod(){
		System.out.println("Parent_class SampleMethod");	
		return 2;
	}
	
	public void SampleMethod(int i){
		SampleMethod();
		System.out.println("Parent_Class SampleMethod with parameters");
	}
	
	int SampleMethod(String s){
		return 20;
	}
}