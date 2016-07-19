package java_Inheritance;

public class Child_Class extends Parent_Class {

	int number = 3;
	public Child_Class(){
		super();
		System.out.println("Child_Class constructor");		
	}
	
	public int SampleMethod(){
		System.out.println("Child_Class SampleMethod");	
		return 3;
	}
}