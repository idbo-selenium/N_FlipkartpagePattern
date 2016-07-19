package com.FlipKart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Utility.Utility;

public class Women_HeelsPage {

	static Actions quickView = null;
	static int maxSecond = 5000;
	public static void QuickView(String heels) throws InterruptedException {
		// TODO Auto-generated method stub		
		
		String heel = Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[1]/a")).getText();
		System.out.println("heel name : "+heel);
		if(heel.equals(heels)){
			quickView = new Actions(Browser.Driver());
			//women heels hover
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div/div[1]/a[1]/img"), maxSecond)).build().perform();
			//quick view button click
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div/div[1]/a[2]/span[2]"), maxSecond)).click().build().perform();
			//handling IFrame
			Browser.Driver().switchTo().frame(Utility.waitForPageUntilElementIsVisible(By.className("quickViewFrame"), maxSecond));
			
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]/div/div"), maxSecond)).build().perform();
			Thread.sleep(3000);
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[2]/div/div"), maxSecond)).build().perform();
			Thread.sleep(3000);
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[3]/div/div"), maxSecond)).build().perform();
			Thread.sleep(3000);
			quickView.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[4]/div/div"), maxSecond)).build().perform();
			Thread.sleep(3000);			
		}
	}
}