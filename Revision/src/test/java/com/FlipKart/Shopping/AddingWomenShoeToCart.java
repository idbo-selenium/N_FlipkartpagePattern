package com.FlipKart.Shopping;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.FlipCart.Browser.Browser;
import com.FlipKart.Asserts.Assertions;
import com.FlipKart.Menu.NavigationBar;
import com.FlipKart.Pages.HomePage;
import com.FlipKart.Pages.Women_FootWear_Ballerinas;

public class AddingWomenShoeToCart {

	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		Browser.Close();
	}
	
	@Test
	public void Can_Buy_WomenShoes_Test(){
		HomePage.GoTo();
		Assert.assertTrue(Assertions.HomePage.IsAt());
		NavigationBar.Women.Women_FootWear_Ballerinas.Select();
		Assert.assertTrue(Assertions.WomensPage.Women_FootWear_Ballerinas.IsAt());
		Women_FootWear_Ballerinas.AddToCart("Paduki Ethnic Bellies");
		Assert.assertTrue(Women_FootWear_Ballerinas.Check_Is_Added());
		Women_FootWear_Ballerinas.Continue_Shopping();
		Assert.assertTrue(Assertions.HomePage.IsAt());
	}	
}