package java_Inheritance;

public class MainMethod_Class extends Parent_Class{

	public static void main(String [] args){
//		Parent_Class parent = new Parent_Class();
//		Parent_Class child =  new Child_Class();
//		Parent_Class sub = new SubClass();
//		
////		Child_Class child = new Child_Class();
////		Child_Class sub = new SubClass();
//		
//		parent.SampleMethod();		
//		child.SampleMethod();
//		sub.SampleMethod();
//		System.out.println(sub.number);
//		System.out.println(child.number);
		
		//passing array into Parent_Class(Polymorphism )
		Parent_Class[] parent = new Parent_Class[3];
		
		parent[0] = new Parent_Class();
		parent[1] = new Child_Class();
		parent[2] = new SubClass();
		
		for(int i=0;i<parent.length;i++){
			System.out.println("Parent [ "+i+" ] : "+parent[i].SampleMethod());			
		}
	}	
}