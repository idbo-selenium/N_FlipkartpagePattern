package com.FlipKart.Menu;

public class NavigationBar {

	public static class Electronics{
		public static void Select() {
			MenuSelector.Select(MenuBar.Electronics,MenuBar.SubMenu.None);
			System.out.println("Electronics");
		}		
		
		public static class Electronics_Mobiles{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.Electronics,MenuBar.SubMenu.Electronics_Mobiles);
				System.out.println("Electronics_Mobiles");
			}			
		}
		
		public static class Electronics_Tablets{
			public static void Select() {
				MenuSelector.Select(MenuBar.Electronics, MenuBar.SubMenu.Electronics_Tablets);
				System.out.println("Electronics_Tablets");
			}			
		}
		
		public static class Electronics_LapTops{
			public static void Select() {
				MenuSelector.Select(MenuBar.Electronics, MenuBar.SubMenu.Electronics_LapTops);
				System.out.println("Electronics_LapTops");
			}			
		}
		
		public static  class Electronics_Televisions{
			public static void Select() {
				MenuSelector.Select(MenuBar.Electronics, MenuBar.SubMenu.Electronics_Televisions);
				System.out.println("Electronics_Televisions");
			}			
		}
	}
	
	public static class Men{
		public static void Select(){
			MenuSelector.Select(MenuBar.Men,MenuBar.SubMenu.None);
			System.out.println("Men");
		}
		
		public static class Men_FootWear{
			public static void Select() {
				MenuSelector.Select(MenuBar.Men, MenuBar.SubMenu.Men_FootWear);
				System.out.println("Men_FootWear");
			}			
		}
		
		public static class Men_Clothing{
			public static void Select() {
				MenuSelector.Select(MenuBar.Men, MenuBar.SubMenu.Men_Clothing);
				System.out.println("Men_Clothing");
			}			
		}
		
		public static class Men_Watches{
			public static void Select() {
				MenuSelector.Select(MenuBar.Men, MenuBar.SubMenu.Men_Watches);
				System.out.println("Men_Watches");
			}			
		}
		
		public static class Men_SunGlasses{
			public static void Select() {
				MenuSelector.Select(MenuBar.Men, MenuBar.SubMenu.Men_SunGlasses);
				System.out.println("Men_SunGlasses");
			}			
		}
	}

	public static class Women{
		public static void Select(){
			MenuSelector.Select(MenuBar.Women,MenuBar.SubMenu.None);
			System.out.println("Women");
		}
	
		public static class Women_JewellerySets{
			public static void Select() {
				// TODO Auto-generated method stub	
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_JewellerySets);
			}			
		}
		
		public static class Women_Rings{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_Rings);
				System.out.println("Women_Rings");
			}			
		}
		
		public static class Women_EthnicWear{
			public static void Select() {
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_EthnicWear);
				System.out.println("Women_EthnicWear");
			}
		}
		
		public static class Women_WesternWear{
			public static void Select() {
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_WesternWear);
				System.out.println("Women_WesternWear");
			}			
		}
		
		public static class Women_FootWear{
			public static void Select() {
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_FootWear);
				System.out.println("Women_FootWear");
			}				
		}
		
		public static class Women_FootWear_Ballerinas{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_FootWear_Ballerinas);
			}				
		}
		
		public static class Women_Watches{
			public static void Select() {
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_Watches);
				System.out.println("Women_Watches");
			}			
		}
	
		public static class Women_Heels{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.Women, MenuBar.SubMenu.Women_Heels);
				System.out.println("Women_Heels");
			}			
		}
	}

	public static class BabyAndKids{		
		public static void Select(){
			MenuSelector.Select(MenuBar.BabyAndKids,MenuBar.SubMenu.None);
			System.out.println("BabyAndKids");
		}
	
		public static class BabyAndKids_Clothing{
			public static void Select() {
				MenuSelector.Select(MenuBar.BabyAndKids, MenuBar.SubMenu.BabyAndKids_Clothing);
				System.out.println("BabyAndKids_Clothing");
			}			
		}
		
		public static class BabyAndKids_FootWear{
			public static void Select() {
				MenuSelector.Select(MenuBar.BabyAndKids, MenuBar.SubMenu.BabyAndKids_FootWear);
				System.out.println("BabyAndKids_FootWear");
			}			
		}
		
		public static class BabyAndKids_Toys{
			public static void Select() {
				MenuSelector.Select(MenuBar.BabyAndKids, MenuBar.SubMenu.BabyAndKids_Toys);
				System.out.println("BabyAndKids_Toys");
			}			
		}	
		
		public static class BabyAndKids_Watches{
			public static void Select() {
				MenuSelector.Select(MenuBar.BabyAndKids, MenuBar.SubMenu.BabyAndKids_Watches);
				System.out.println("BabyAndKids_Watches");
			}			
		}		
	}

	public static class HomeAndFurniture{
		public static void Select() {
			MenuSelector.Select(MenuBar.HomeAndFurniture,MenuBar.SubMenu.None);
			System.out.println("HomeAndFurniture");
		}
		
		public static class HomeAndFurniture_HomeFurnishing{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.HomeAndFurniture, MenuBar.SubMenu.HomeAndFurniture_HomeFurnishing);
				System.out.println("HomeAndFurniture_HomeFurnishing");
			}			
		}
		
		public static class HomeAndFurniture_Furniture{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.HomeAndFurniture, MenuBar.SubMenu.HomeAndFurniture_Furniture);
				System.out.println("HomeAndFurniture_Furniture");
			}			
		}
		
		public static class HomeAndFurniture_Decor{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.HomeAndFurniture, MenuBar.SubMenu.HomeAndFurniture_Decor);
				System.out.println("HomeAndFurniture_Decor");
			}			
		}
		
		public static class HomeAndFurniture_HomeAppliances{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.HomeAndFurniture, MenuBar.SubMenu.HomeAndFurniture_HomeAppliances);
				System.out.println("HomeAndFurniture_HomeAppliances");
			}			
		}		
	}

	public static class BooksAndMedia{
		public static void Select() {
			MenuSelector.Select(MenuBar.BooksAndMedia,MenuBar.SubMenu.None);
			System.out.println("BooksAndMedia");
		}
		
		public static class BooksAndMedia_Music{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.BooksAndMedia, MenuBar.SubMenu.BooksAndMedia_Music);
				System.out.println("BooksAndMedia_Music");
			}			
		}
		
		public static class BooksAndMedia_MoviesAndTVShows{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.BooksAndMedia, MenuBar.SubMenu.BooksAndMedia_MoviesAndTVShows);
				System.out.println("BooksAndMedia_MoviesAndTVShows");
			}			
		}
		
		public static class BooksAndMedia_MusicalInstruments{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.BooksAndMedia, MenuBar.SubMenu.BooksAndMedia_MusicalInstruments);
				System.out.println("BooksAndMedia_MusicalInstruments");
			}			
		}
		
		public static class BooksAndMedia_Stationery{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.BooksAndMedia, MenuBar.SubMenu.BooksAndMedia_Stationery);
				System.out.println("BooksAndMedia_Stationery");
			}			
		}
	}

	public static class AutoAndSports{
		public static void Select() {
			MenuSelector.Select(MenuBar.AutoAndSports,MenuBar.SubMenu.None);
			System.out.println("AutoAndSports");
		}
		
		public static class AutoAndSports_Automobiles{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.AutoAndSports, MenuBar.SubMenu.AutoAndSports_Automobiles);
				System.out.println("AutoAndSports_Automobiles");
			}
		}
		
		public static class AutoAndSports_Tyres{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.AutoAndSports, MenuBar.SubMenu.AutoAndSports_Tyres);
				System.out.println("AutoAndSports_Tyres");
			}			
		}
		
		public static class AutoAndSports_CarInterior{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.AutoAndSports, MenuBar.SubMenu.AutoAndSports_CarInterior);
				System.out.println("AutoAndSports_CarInterior");
			}
		}
		
		public static class AutoAndSports_FitnessAccessories{
			public static void Select() {
				// TODO Auto-generated method stub
				MenuSelector.Select(MenuBar.AutoAndSports, MenuBar.SubMenu.AutoAndSports_FitnessAccessories);
				System.out.println("AutoAndSports_OutDoors");
			}			
		}
	}
}