package java_Inheritance;

public class Abstract_SubClass extends Abstract_Class{

	public int Abstraction_Int(int d,int e,int f)
	{
		return d+e+f;		
	}
	
	public String Abstraction_String(String p,String q,String r)
	{
		String v = p.concat(q);
		return v.concat(r);
	}
	
	public double Abstraction_Double(double x,double y,double z){
		return x+y+z;
	}
	
	public static void main(String[] args)
	{
		Abstract_SubClass obj = new Abstract_SubClass();		
		System.out.println(obj.Abstraction_Int(1,2,3));
		System.out.println(obj.Abstraction_String("swetha ", " nirmala ", " lalitha "));
		System.out.println(obj.Abstraction_Double(21.21,31.31,51.51));
		obj.RegularMethod();
	}
}