package com.FlipKart.QuickView;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Asserts.Assertions;
import com.FlipKart.Menu.NavigationBar;
import com.FlipKart.Pages.HomePage;
import com.FlipKart.Pages.Women_JewellerySetsPage;

public class QuickViewTest {

	@Before
	public void InIt(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		Browser.Close();		
	}
	
	@Test
	public void Can_Go_To_QuickView() throws InterruptedException{
		HomePage.GoTo();
		Assert.assertTrue(Assertions.HomePage.IsAt());
		NavigationBar.Women.Women_JewellerySets.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_JewellerySets.IsAt());
		Women_JewellerySetsPage.QuickView("Sukkhi Alloy Jewel Set (Gold)");
	}	
}