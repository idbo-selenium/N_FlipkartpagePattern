package com.FlipKart.QuickView;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Asserts.Assertions;
import com.FlipKart.Menu.NavigationBar;
import com.FlipKart.Pages.HomePage;
import com.FlipKart.Pages.Women_RingsPage;

public class QuickViewTest_Women_Rings {

	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		Browser.Close();		
	}
	
	@Test
	public void QuickView_Test(){
		HomePage.GoTo();
		Assert.assertTrue(Assertions.HomePage.IsAt());
		NavigationBar.Women.Women_Rings.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_Rings.IsAt());
		Women_RingsPage.QuickView("VK Jewels Alloy Rhodium Ring");
	}	
}