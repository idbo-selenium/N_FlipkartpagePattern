package com.FlipKart.Pages;

import com.FlipCart.Browser.Browser;

public class HomePage {

	public static String baseURL = "http://www.flipkart.com/";
	
	public static void GoTo(){
		Browser.driver.navigate().to(baseURL);
	}	
}