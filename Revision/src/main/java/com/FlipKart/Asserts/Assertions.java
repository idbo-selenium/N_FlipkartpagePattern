package com.FlipKart.Asserts;

import com.FlipCart.Browser.Browser;

public class Assertions {

	public static class HomePage{
		public static boolean IsAt() {
			// TODO Auto-generated method stub
			return Browser.Driver().getCurrentUrl().equals("http://www.flipkart.com/");
		}		
	}
	
	public static class ElectronicsPage{
		public static class Electronics_MobilePage{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Mobiles - Buy Mobile Phones Online at Best Price in India - Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}
			
		}
	
		public static class Electronics_Tablets{
			public static boolean IsAt(){
				if(Browser.Driver().getTitle().equals("Tablets - Buy Tablets Products Store Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}
		}

		public static class Electronics_LapTops{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Laptops - Buy Laptops Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class Electronics_Televisions{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Television - Buy TVs Online at Best Price in India - Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	}
	
	public static class MensPage{
		public static class Men_FootWear{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Mens Footwear - Buy Mens Footwear Online at Best Price in India - Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	
		public static class Men_Clothing{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Mens Clothing - Buy Mens Clothing Online at Best Price in India - Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
		
		public static class Men_Watches{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Men's Watches - Buy Men's Watches Products Online at Best Price in India - Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
		
		public static class Men_SunGlasses{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Sunglasses for Men - Buy Sunglasses for Men Online at Best Prices in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	}
	
	public static class WomensPage{
		public static class Women_EthnicWear{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Ethnic Wear Online - Buy Ethnic Wear for Women at Best Prices in India")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class Women_WesternWear{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Western Wear for Women Online - Buy Western Wear Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
		
		public static class Women_JewellerySets{
			public static boolean IsAt() {
				// TODO Auto-generated method stub				
				return Browser.Driver().getTitle().equals("Jewellery Sets Online at India's Best Online Shopping Store & Check latest trends in Jewellery Sets @ Flipkart.com");
			}			
		}
		
		public static class Women_Heels{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				return Browser.Driver().getTitle().equals("Heels - Buy Heels online for women at best prices in India | Flipkart.com");
			}			
		}
		
		public static class Women_Rings{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				return Browser.Driver().getTitle().equals("Rings for Men and Women Online at India's Best Online Shopping Store & Check latest trends in Rings @ Flipkart.com");
			}			
		}
		
		public static class Women_FootWear{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Womens Footwear Store Online - Buy Womens Footwear Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	
		public static class Women_Watches{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Women's Watches Store - Buy Women's Watches Products Online at Best Price in India - Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
		
		public static class Women_FootWear_Ballerinas{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Ballerinas - Buy Ballerinas online for women at best prices in India | Flipkart.com")){
					//Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	}
	
	public static class BabyAndKidsPage{
		public static class BabyAndKids_Clothing{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Kids Clothing - Buy Kids Wear, Dresses, Clothes Online at Best Prices in India")){
					Browser.Navigate_Back();//
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class BabyAndKids_FootWear{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Kids Footwear Store Online - Buy Kids Footwear Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class BabyAndKids_Watches{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Kids Watches Store Online - Buy Kids Watches Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}			
	
		public static class BabyAndKids_Toys{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Toy Store Online - Buy Toy Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	}
	
	public static class HomeAndFurniturePage{
		public static class HomeAndFurniture_HomeFurnishing{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Home Furnishing Store - Buy Home Furnishing Products Online at Best Price in India - Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class HomeAndFurniture_Furniture{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Furniture Store Online - Buy Furniture Online at Best Prices in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class HomeAndFurniture_Decor{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Home Decor Store- Buy Home Decor Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class HomeAndFurniture_HomeAppliances{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Home Appliances Store - Buy Home Appliances Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	}
	
	public static class BooksAndMediaPage{
		public static class BooksAndMedia_Music{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Music CDs & DVDs Store Online - Buy Music CDs & DVDs Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}

		public static class BooksAndMedia_MoviesAndTVShows{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Movies & TV Shows Store Online - Buy Movies & TV Shows Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}						
		}
		
		public static class BooksAndMedia_MusicalInstruments{
			public static boolean IsAt() {
				if(Browser.Driver().getTitle().equals("Musical Instruments Store Online - Buy Musical Instruments Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	
		public static class BooksAndMedia_Stationery{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Pens & Stationery Store Online - Buy Pens & Stationery Products Online at Best Price in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	}
	
	public static class AutoAndSportsPage{
		public static class AutoAndSports_Automobiles{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Automobile - Buy Automobile Online at Best Prices In India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}		
		}
		
		public static class AutoAndSports_Tyres{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Tyres - Buy Tyres Online at Best Prices In India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
		
		public static class AutoAndSports_CarInterior{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Car Interior - Buy Car Interior Online at Best Prices In India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
		
		public static class AutoAndSports_FitnessAccessories{
			public static boolean IsAt() {
				// TODO Auto-generated method stub
				if(Browser.Driver().getTitle().equals("Fitness Accessories - Buy Fitness Accessories Products Online at Best Prices in India | Flipkart.com")){
					Browser.Navigate_Back();
					return true;
				}
				else{
					return false;
				}
			}			
		}
	}
}