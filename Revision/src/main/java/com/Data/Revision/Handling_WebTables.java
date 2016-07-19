package com.Data.Revision;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_WebTables {
	
	@Test
	public void Handling_Tables(){
		WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("http://toolsqa.com/automation-practice-table/");
		//getting single row in a table
//		String sRowValue = "Clock Tower Hotel";
//		for(int i=1;i<=5;i++){
//			String sValue = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr["+i+"]/th")).getText();
//			if(sValue .equalsIgnoreCase(sRowValue)){
//				for(int j=1;j<=5;j++){
//					String sColumnValue = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
//					System.out.println("sColumnValue : "+sColumnValue);
//				}
//				break;
//			}
//		}
		//getting all rows and columns in a table
//		WebElement myTable = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody"));
//		List<WebElement> rows_table = myTable.findElements(By.tagName("tr"));
//		int rows_count = rows_table.size();
//		for(int row =0;row<rows_count;row++){
//			List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
//			int columns_count = columns_row.size();
//			System.out.println("Number of cells in row "+row+" are "+columns_count);
//			for(int column=0;column<columns_count-1;column++){
//				String celltext = columns_row.get(column).getText();
//				System.out.println("Cell value of row number "+row+" and column number "+column+" is "+celltext);
//			}
//			System.out.println("---------------------------------------------");
//		}
		//driver.close();		
		
		driver.get("http://toolsqa.com/selenium-webdriver/locators/");
		WebElement myTable = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/article/div[1]/div[2]/div/div/div[1]/div[3]/div[4]/table/tbody"));
		List<WebElement> rows_table = myTable.findElements(By.tagName("tr"));
		int rows_count = rows_table.size();
		for(int row = 0;row<rows_count;row++){
			List<WebElement> column_row = rows_table.get(row).findElements(By.tagName("td"));
			int column_count = column_row.size();
			System.out.println("Number of cells in row "+row+" are "+column_count);
			for(int column=0;column<column_count;column++){
				String celltext = column_row.get(column).getText();
				System.out.println("Cell value of row number "+row+" and column number "+column+" is "+celltext);
			}
			System.out.println("---------------------------------------------");
		}
	}
}