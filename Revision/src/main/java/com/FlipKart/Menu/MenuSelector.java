package com.FlipKart.Menu;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Menu.MenuBar.SubMenu;
import com.FlipKart.Utility.Utility;

public class MenuSelector {
	
	public static int maxSecond = 5000;

	public static void Select(MenuBar topMenuItem,SubMenu subMenuItem) {
		switch(topMenuItem){
		case Electronics:
			Actions electronicAction = new Actions(Browser.Driver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[1]/a"), maxSecond));
			electronicAction.build().perform();
			switch(subMenuItem){
				case None:
					electronicAction.click().build().perform();
					break;
				case Electronics_Mobiles:
					electronicAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[1]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Electronics_Mobiles title : "+Browser.Driver().getTitle());
					break;
				case Electronics_Tablets:
					electronicAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[2]/ul/li[5]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Electronics_Tablets title : "+Browser.Driver().getTitle());
					break;
				case Electronics_LapTops:
					electronicAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[2]/ul/li[10]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Electronics_LapTops title : "+Browser.Driver().getTitle());
					break;
				case Electronics_Televisions:
					electronicAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[4]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Electronics_Televisions title : "+Browser.Driver().getTitle());
					break;
			}
			break;
		case Men:
			Actions menAction = new Actions(Browser.Driver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[2]/a"), maxSecond));
			menAction.build().perform();
			switch (subMenuItem) {
				case None:
					menAction.click().build().perform();
					break;
				case Men_FootWear:
					menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Men_FootWear title : "+Browser.Driver().getTitle());
					break;
				case Men_Clothing:
					menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Men_Clothing title : "+Browser.Driver().getTitle());
					break;
				case Men_Watches:
					menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[3]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Men_Watches title : "+Browser.Driver().getTitle());
					break;
				case Men_SunGlasses:
					menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[9]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Men_SunGlasses title : "+Browser.Driver().getTitle());
					break;
			}
			break;
		case Women:
			Actions womenAction = new Actions(Browser.Driver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/a"), maxSecond));
			womenAction.build().perform();
			switch(subMenuItem){
				case None:
					womenAction.click().build().perform();
					break;
				case Women_EthnicWear:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]/ul/li[3]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_EthnicWear title : "+Browser.Driver().getTitle());
					break;
				case Women_WesternWear:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]/ul/li[8]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_WesternWear title : "+Browser.Driver().getTitle());
					break;
				case Women_FootWear:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[2]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_FootWear title : "+Browser.Driver().getTitle());
					break;
				case Women_Watches:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[4]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_Watches title : "+Browser.Driver().getTitle());
					break;
				case Women_FootWear_Ballerinas:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[2]/ul/li[5]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_FootWear_Ballerinas title : "+Browser.Driver().getTitle());
					break;
				case Women_Heels:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[2]/ul/li[6]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_Heels title : "+Browser.Driver().getTitle());
					break;
				case Women_JewellerySets:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[3]/ul/li[14]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_JewellerySets title : "+Browser.Driver().getTitle());
					break;
				case Women_Rings:
					womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[3]/ul/li[2]/ul/li[3]/ul/li[16]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("Women_Rings title : "+Browser.Driver().getTitle());
					break;
			}
			break;
		case BabyAndKids:
			Actions babyAndKidsAction = new Actions(Browser.Driver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[4]/a"), maxSecond));
			babyAndKidsAction.build().perform();
			switch(subMenuItem){
				case None: 
					babyAndKidsAction.click().build().perform();
					break;
				case BabyAndKids_Clothing:
					babyAndKidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[4]/ul/li[2]/ul/li[2]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BabyAndKids_Clothing title : "+Browser.Driver().getTitle());
					break;
				case BabyAndKids_FootWear:
					babyAndKidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[4]/ul/li[2]/ul/li[2]/ul/li[11]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BabyAndKids_FootWear title : "+Browser.Driver().getTitle());
					break;
				case BabyAndKids_Watches:
					babyAndKidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[4]/ul/li[2]/ul/li[2]/ul/li[15]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BabyAndKids_Watches title : "+Browser.Driver().getTitle());
					break;
				case BabyAndKids_Toys:
					babyAndKidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[4]/ul/li[2]/ul/li[3]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BabyAndKids_Toys title : "+Browser.Driver().getTitle());
					break;
			}
			break;
		case HomeAndFurniture:
			Actions homeAndFurnitureAction = new Actions(Browser.Driver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[5]/a"), maxSecond));
			homeAndFurnitureAction.build().perform();
			switch(subMenuItem){
				case None:
					homeAndFurnitureAction.click().build().perform();
					break;
				case HomeAndFurniture_HomeFurnishing:
					homeAndFurnitureAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[5]/ul/li[2]/ul/li[2]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("HomeAndFurniture_HomeFurnishing title : "+Browser.Driver().getTitle());
					break;
				case HomeAndFurniture_Furniture:
					homeAndFurnitureAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[5]/ul/li[2]/ul/li[3]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("HomeAndFurniture_Furniture title : "+Browser.Driver().getTitle());
					break;
				case HomeAndFurniture_Decor:
					homeAndFurnitureAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[5]/ul/li[2]/ul/li[4]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("HomeAndFurniture_Decor title : "+Browser.Driver().getTitle());
					break;
				case HomeAndFurniture_HomeAppliances:
					homeAndFurnitureAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[5]/ul/li[2]/ul/li[3]/ul/li[15]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("HomeAndFurniture_HomeAppliances title : "+Browser.Driver().getTitle());
					break;
			}		
			break;
		case BooksAndMedia:
			Actions booksAndMediaAction = new Actions(Browser.Driver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[6]/a"), maxSecond));
			booksAndMediaAction.build().perform();
			switch(subMenuItem){
				case None:
					booksAndMediaAction.click().build().perform();
					break;
				case BooksAndMedia_Music:
					booksAndMediaAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[6]/ul/li[2]/ul/li[2]/ul/li[9]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BooksAndMedia_Music title : "+Browser.Driver().getTitle());
					break;
				case BooksAndMedia_MoviesAndTVShows:
					booksAndMediaAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[6]/ul/li[2]/ul/li[2]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BooksAndMedia_MoviesAndTVShows title : "+Browser.Driver().getTitle());//Browser.Navigate_Back();
					break;
				case BooksAndMedia_MusicalInstruments:
					booksAndMediaAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[6]/ul/li[2]/ul/li[5]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BooksAndMedia_MusicalInstruments title : "+Browser.Driver().getTitle());
					break;
				case BooksAndMedia_Stationery:
					booksAndMediaAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[6]/ul/li[2]/ul/li[4]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("BooksAndMedia_Stationery title : "+Browser.Driver().getTitle());
					break;
			}
			break;
		case AutoAndSports:
			Actions autoAndSportsAction = new Actions(Browser.Driver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[7]/a"), maxSecond));
			autoAndSportsAction.build().perform();
			switch(subMenuItem){
				case None:
					autoAndSportsAction.click().build().perform();
					break;
				case AutoAndSports_Automobiles:
					autoAndSportsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[7]/ul/li[2]/ul/li[1]/ul/li[1]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("AutoAndSports_Automobiles title : "+Browser.Driver().getTitle());
					break;
				case AutoAndSports_CarInterior:
					autoAndSportsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[7]/ul/li[2]/ul/li[2]/ul/li[12]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("AutoAndSports_CarInterior title : "+Browser.Driver().getTitle());
					break;
				case AutoAndSports_FitnessAccessories:
					autoAndSportsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[7]/ul/li[2]/ul/li[5]/ul/li[2]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
					System.out.println("AutoAndSports_FitnessAccessories title : "+Browser.Driver().getTitle());
					break;
				case AutoAndSports_Tyres:
					autoAndSportsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/header/div[1]/div/ul/li[7]/ul/li[2]/ul/li[2]/ul/li[8]/a/span"), maxSecond)).click().build().perform();
					Browser.Driver().manage().timeouts().implicitlyWait(20,TimeUnit.MINUTES);
					System.out.println("AutoAndSports_Tyres title : "+Browser.Driver().getTitle());
					break;
			}
			break;
		}		
	}	
}