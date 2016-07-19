package com.FlipKart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Utility.Utility;

public class Women_FootWear_Ballerinas {

	static Actions add_to_cart = null; 
	static int maxSecond = 5000;
	public static void AddToCart(String ballerina) {
		// TODO Auto-generated method stub
		String shoe = Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[1]/a")).getText();
		System.out.println("ballerina name : "+shoe);
		if(ballerina.equals(shoe)){
			add_to_cart = new Actions(Browser.Driver());			
			//"Paduki Ethnic Bellies" click in ballerina page			
			add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[1]/a"), maxSecond)).click().build().perform();			
			//select the size of the bellies "36"
			add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div[4]/div/div[7]/div/div[3]/div/div/div[5]/div[3]/div[2]/a[1]/div/div/span"), maxSecond)).click().build().perform();			
			//"add to cart" button click
			add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div[4]/div/div[7]/div/div[3]/div/div/div[6]/div/div[2]/div[1]/div/div[2]/div/div[1]/form/input[8]"), maxSecond)).click().build().perform();
			System.out.println("Bellies successfully added to cart");
		}
	}
	public static boolean Check_Is_Added() {
		// TODO Auto-generated method stub
		String shoe = Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[4]/div/div[7]/div/div[3]/div/div/div[1]/h1")).getText();
		String cardShoe = Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/span/strong")).getText();
		System.out.println(shoe+ " , "+cardShoe);	
		if(shoe.equals(cardShoe)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void Continue_Shopping() {
		// TODO Auto-generated method stub
		//"View cart" link click
		Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/a")).click();
		//continue shopping button click
		Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/button")).click();
	}
}