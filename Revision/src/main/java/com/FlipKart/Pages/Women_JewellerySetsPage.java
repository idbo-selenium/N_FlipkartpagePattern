package com.FlipKart.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Utility.Utility;

public class Women_JewellerySetsPage {

	static Actions quickViewAction = null;
	static int maxSecond = 5000;
	public static void QuickView(String jewellarySet) throws InterruptedException {
		// TODO Auto-generated method stub
		String jewellary = Browser.Driver().findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/a")).getText();
		System.out.println("jewellary : "+jewellary);
		if(jewellary.equals(jewellarySet)){
			quickViewAction = new Actions(Browser.Driver());
			//"quick view button click"
			quickViewAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div[1]/a[2]/span[2]"), maxSecond)).click().build().perform();
			//handling IFrame
			Browser.Driver().switchTo().frame(Utility.waitForPageUntilElementIsVisible(By.className("quickViewFrame"), maxSecond));
			
			quickViewAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]/div/div"), maxSecond)).build().perform();
			//Browser.Driver().manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
			Thread.sleep(2000);
			
			quickViewAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[2]/div/div"), maxSecond)).build().perform();
			//Browser.Driver().manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
			Thread.sleep(2000);
			
			quickViewAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[3]/div/div"), maxSecond)).build().perform();
			//Browser.Driver().manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
			Thread.sleep(2000);
			
			quickViewAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[2]/ul/li[4]/div/div"), maxSecond)).build().perform();
			//Browser.Driver().manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
			Thread.sleep(2000);
		}
	}	
}