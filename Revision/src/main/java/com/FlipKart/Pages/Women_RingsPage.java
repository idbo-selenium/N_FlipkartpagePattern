package com.FlipKart.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Utility.Utility;

public class Women_RingsPage {

	static Actions quickView = null;
	static int maxSecond = 5000;
	public static void QuickView(String ring) {
		// TODO Auto-generated method stub
		String rings = Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div[1]/a")).getText();
		System.out.println("rings : "+rings);
		if(rings.equals(ring)){
			quickView = new Actions(Browser.Driver());
			//quickview button click
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div/div[1]/a[2]/span[2]"), maxSecond)).click().build().perform();
			//handling IFrame
			Browser.Driver().switchTo().frame(Utility.waitForPageUntilElementIsVisible(By.className("quickViewFrame"), maxSecond));
			
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li/div/div"), maxSecond)).build().perform();
			Browser.Driver().manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);			
		}
	}	
}