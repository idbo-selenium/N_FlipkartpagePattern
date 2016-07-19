package com.FlipKart.QuickView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Asserts.Assertions;
import com.FlipKart.Menu.NavigationBar;
import com.FlipKart.Pages.HomePage;
import junit.framework.Assert;
import com.FlipKart.Pages.Women_HeelsPage;

public class QuickView_Women_Heels {

	@Before
	public void Init(){
		Browser.Open();
	}
	@After
	public void Cleanup(){
		Browser.Close();
	}
	
	@Test
	public void QuickView() throws InterruptedException{
		HomePage.GoTo();
		Assert.assertTrue(Assertions.HomePage.IsAt());
		NavigationBar.Women.Women_Heels.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_Heels.IsAt());
		Women_HeelsPage.QuickView("Sam Stefy Women Heels");		//My Foot Women Heels
	}
}