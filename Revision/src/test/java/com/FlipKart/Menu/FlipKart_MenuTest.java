package com.FlipKart.Menu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Asserts.Assertions;
import com.FlipKart.Menu.NavigationBar;
import com.FlipKart.Pages.HomePage;

public class FlipKart_MenuTest {

	@Before
	public void InIt(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		Browser.Close();
	}
	
	@Test
	public void Is_At_HomePage() throws InterruptedException{
		HomePage.GoTo();
		Assert.assertTrue(Assertions.HomePage.IsAt());
		
		NavigationBar.Electronics.Select();
		Thread.sleep(2000);	
		
		NavigationBar.Electronics.Electronics_Mobiles.Select();
		Assert.assertTrue(Assertions.ElectronicsPage.Electronics_MobilePage.IsAt());
		
		NavigationBar.Electronics.Electronics_Tablets.Select();
		Assert.assertTrue(Assertions.ElectronicsPage.Electronics_Tablets.IsAt());
		
		NavigationBar.Electronics.Electronics_LapTops.Select();
		Assert.assertTrue(Assertions.ElectronicsPage.Electronics_LapTops.IsAt());
		
		NavigationBar.Electronics.Electronics_Televisions.Select();
		Assert.assertTrue(Assertions.ElectronicsPage.Electronics_Televisions.IsAt());
		
		
		
		NavigationBar.Men.Select();
		Thread.sleep(2000);
		
		NavigationBar.Men.Men_FootWear.Select();
		Assert.assertTrue(Assertions.MensPage.Men_FootWear.IsAt());
		
		NavigationBar.Men.Men_Clothing.Select();
		Assert.assertTrue(Assertions.MensPage.Men_Clothing.IsAt());
		
		NavigationBar.Men.Men_Watches.Select();
		Assert.assertTrue(Assertions.MensPage.Men_Watches.IsAt());
		
		NavigationBar.Men.Men_SunGlasses.Select();
		Assert.assertTrue(Assertions.MensPage.Men_SunGlasses.IsAt());
		
		
		
		NavigationBar.Women.Select();
		Thread.sleep(2000);
		
		NavigationBar.Women.Women_EthnicWear.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_EthnicWear.IsAt());
		
		NavigationBar.Women.Women_WesternWear.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_WesternWear.IsAt());
		
		NavigationBar.Women.Women_FootWear.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_FootWear.IsAt());
		
		NavigationBar.Women.Women_Watches.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_Watches.IsAt());
		
		
		
		NavigationBar.BabyAndKids.Select();
		Thread.sleep(2000);
		
		NavigationBar.BabyAndKids.BabyAndKids_Clothing.Select();
		Assert.assertTrue(Assertions.BabyAndKidsPage.BabyAndKids_Clothing.IsAt());
		
		NavigationBar.BabyAndKids.BabyAndKids_FootWear.Select();
		Assert.assertTrue(Assertions.BabyAndKidsPage.BabyAndKids_FootWear.IsAt());
		
		NavigationBar.BabyAndKids.BabyAndKids_Toys.Select();
		Assert.assertTrue(Assertions.BabyAndKidsPage.BabyAndKids_Toys.IsAt());
		
		NavigationBar.BabyAndKids.BabyAndKids_Watches.Select();
		Assert.assertTrue(Assertions.BabyAndKidsPage.BabyAndKids_Watches.IsAt());		
		
		
		
		NavigationBar.HomeAndFurniture.Select();
		Thread.sleep(2000);
		
		NavigationBar.HomeAndFurniture.HomeAndFurniture_HomeFurnishing.Select();
		Assert.assertTrue(Assertions.HomeAndFurniturePage.HomeAndFurniture_HomeFurnishing.IsAt());
		
		NavigationBar.HomeAndFurniture.HomeAndFurniture_Furniture.Select();
		Assert.assertTrue(Assertions.HomeAndFurniturePage.HomeAndFurniture_Furniture.IsAt());
		
		NavigationBar.HomeAndFurniture.HomeAndFurniture_Decor.Select();
		Assert.assertTrue(Assertions.HomeAndFurniturePage.HomeAndFurniture_Decor.IsAt());
		
		NavigationBar.HomeAndFurniture.HomeAndFurniture_HomeAppliances.Select();
		Assert.assertTrue(Assertions.HomeAndFurniturePage.HomeAndFurniture_HomeAppliances.IsAt());
		
		
		
		NavigationBar.BooksAndMedia.Select();
		Thread.sleep(2000);
		
		NavigationBar.BooksAndMedia.BooksAndMedia_Music.Select();
		Assert.assertTrue(Assertions.BooksAndMediaPage.BooksAndMedia_Music.IsAt());
		
		NavigationBar.BooksAndMedia.BooksAndMedia_MoviesAndTVShows.Select();
		Assert.assertTrue(Assertions.BooksAndMediaPage.BooksAndMedia_MoviesAndTVShows.IsAt());
		
		NavigationBar.BooksAndMedia.BooksAndMedia_MusicalInstruments.Select();
		Assert.assertTrue(Assertions.BooksAndMediaPage.BooksAndMedia_MusicalInstruments.IsAt());
		
		NavigationBar.BooksAndMedia.BooksAndMedia_Stationery.Select();
		Assert.assertTrue(Assertions.BooksAndMediaPage.BooksAndMedia_Stationery.IsAt());
		
		
		
		NavigationBar.AutoAndSports.Select();
		Thread.sleep(2000);
		
		NavigationBar.AutoAndSports.AutoAndSports_Automobiles.Select();
		Assert.assertTrue(Assertions.AutoAndSportsPage.AutoAndSports_Automobiles.IsAt());
		
		NavigationBar.AutoAndSports.AutoAndSports_Tyres.Select();
		Assert.assertTrue(Assertions.AutoAndSportsPage.AutoAndSports_Tyres.IsAt());
		
		NavigationBar.AutoAndSports.AutoAndSports_CarInterior.Select();
		Assert.assertTrue(Assertions.AutoAndSportsPage.AutoAndSports_CarInterior.IsAt());
		
		NavigationBar.AutoAndSports.AutoAndSports_FitnessAccessories.Select();
		Assert.assertTrue(Assertions.AutoAndSportsPage.AutoAndSports_FitnessAccessories.IsAt());
		
	}	
}