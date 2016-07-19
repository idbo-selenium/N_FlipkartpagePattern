package java_Inheritance;

public class Encapsulation {

	private String name="yghu";
	private int mobilenum=1234567890;
	
	public String getName(){
		return name;
	}
	
	public int getMobileNum(){
		return mobilenum;
	}
	
	public void setName(String s_Name){
		name = s_Name;
	}
	
	public void setMobileNum(int i_MobileNum){
		mobilenum = i_MobileNum;
	}
}