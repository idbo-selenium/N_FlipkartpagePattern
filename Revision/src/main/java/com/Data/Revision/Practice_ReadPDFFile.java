package com.Data.Revision;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_ReadPDFFile {

	WebDriver driver;
	@Before
	public void Init(){
		driver = new FirefoxDriver();
	}
	
	@After
	public void CleanUp(){
		driver.close();
	}
	@Test
	public void Read_PDFFile(){
		driver.navigate().to("http://www.princexml.com/samples/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/a[1]/img")).click();
		PDFPage(driver.getCurrentUrl());
	}
	
	public void PDFPage(String baseURL){		
		
		PDFTextStripper stripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		String parsedText = null;
		
		try {
			URL url = new URL(baseURL);
			BufferedInputStream buffer = new BufferedInputStream(url.openStream());
			PDFParser parser = new PDFParser(buffer);
			parser.parse();
			cosDoc = parser.getDocument();
			stripper = new PDFTextStripper();
			
			stripper.setStartPage(1);
			stripper.setEndPage(4);
			
			pdDoc = new PDDocument(cosDoc);
			parsedText = stripper.getText(pdDoc);
			System.out.println("---------------------------------");
			System.out.println(parsedText);
			System.out.println("---------------------------------");
			cosDoc.close();
			pdDoc.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}		
	}
}