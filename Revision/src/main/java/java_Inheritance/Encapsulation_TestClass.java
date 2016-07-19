package java_Inheritance;

public class Encapsulation_TestClass extends Abstract_Class{

	public int Abstraction_Int(int a,int b,int c){
		return a+b+c;
	}
	
	public String Abstraction_String(String x,String y,String z){
		return z.toUpperCase();
	}
	
	public double Abstraction_Double(double a,double b,double c){
		return a*b*c;
	}
	
	public static void main(String[] args){
		Encapsulation encap = new Encapsulation();
		//encap.setName("mona");
		//encap.setMobileNum(1234567890);
		
		System.out.println("Name is : "+encap.getName()+" Mobile number is : "+encap.getMobileNum());
		
		encap.setName("rona");
		encap.setMobileNum(2147483647);//maximum 'int' value is "2147483647"
		
		System.out.println("Name is : "+encap.getName()+" Mobile number is : "+encap.getMobileNum());
		
		//Abstraction
		Encapsulation_TestClass encapsulation = new Encapsulation_TestClass();
		System.out.println(encapsulation.Abstraction_Int(23, 34, 35));
		System.out.println(encapsulation.Abstraction_String("rama", "sita", "lakshmana"));
		System.out.println(encapsulation.Abstraction_Double(18.13, 19.12, 11.19));
		encapsulation.RegularMethod();
	}	
}