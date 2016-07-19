package java_Inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Arrays {

	static int arra[] = {1,2,3,4,5,6};	
	static ArrayList arr = null;
	static List<String> list = new ArrayList<String>();	
	public static void ArrayList_Method(){
		arr = new ArrayList();
		arr.add("edfrgthyjuki");
		arr.add(1,12);
		arr.add(1,23456);
		arr.add(1,'r');
		System.out.println(arr.size());
		
		Collections.addAll(arr, "tuyh",2,3,"dfyty",20.21,'y');
		System.out.println(arr);
	}
	
	public static void List_Method(){
		//list = new List<String>();		
		list.add("dfghjkl");
		Collections.addAll(list, "rama","sita","dilip","nirmala");
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(0);
		System.out.println(list);
		for(int i = 0;i<list.size();i++){
			System.out.println("List["+i+"] : "+list.get(i));
		}
	}
	
	public static void StackMethod(){
		Stack stac = new Stack();
		stac.push("rama");
		stac.push("sita");
		stac.push("nirmala");
		System.out.println(stac);
		//stac.pop();
		Object s = stac.peek();
		System.out.println(s);
		System.out.println(stac.size());
		System.out.println(stac);
	}
	
	public static void main(String [] args){
//		System.out.println("Length is : "+arra.length);
//		for(int i = 0;i<arra.length;i++){
//			try{
//				System.out.println("Number in Array is : "+arra[i]);
//			}
//			catch(ArrayIndexOutOfBoundsException e){
//				System.out.println("Catch Exception : "+e);
//			}
//			finally{
//				System.out.println("nw im in finally block ");
//			}
//		}
		System.out.println("ArrayList Method execution");
		ArrayList_Method();
		System.out.println("List Method execution");
		List_Method();				
		System.out.println("Stack Method execution");
		StackMethod();
	}	
}