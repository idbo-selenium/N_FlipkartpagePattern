package com.Data.Revision;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PDFFile_Read {

	WebDriver driver;
	@Before
	public void Init(){
		driver = new FirefoxDriver();
	}	
	
	@After
	public void Cleanup(){
		driver.close();
	}
	
	@Test
	public void PDFFileRead(){
		driver.get("http://www.princexml.com/samples/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/a[1]/img")).click();
		Assert.assertTrue(VerifyPDFContent(driver.getCurrentUrl(),"Prince Cascading"));
	}
	
	public boolean VerifyPDFContent(String strURL,String reqTextInPDF){
		boolean flag = false;
		
		PDFTextStripper pdfStripper = null;
		PDDocument pdDocument = null;
		COSDocument cosDoc = null;
		String parsedText = null;
		
		try {
			System.out.println("Inside try block");
			URL url = new URL(strURL);
			BufferedInputStream file = new BufferedInputStream(url.openStream());
			PDFParser parser = new PDFParser(file);
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdfStripper.setStartPage(1);
			pdfStripper.setEndPage(1);
			
			pdDocument = new PDDocument(cosDoc);
			parsedText = pdfStripper.getText(pdDocument);
			System.out.println("Out of try block");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("URL string could not be parsed "+e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to open PDF Parser. "+e.getMessage());
			//e.printStackTrace();
			try {
				if (cosDoc != null)
					cosDoc.close();
				if (pdDocument != null)
					pdDocument.close();
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
		System.out.println("--------------------------");
		System.out.println(parsedText);
		System.out.println("--------------------------");
		
		if(parsedText.contains(reqTextInPDF)){
			flag = true;
		}
		return flag;
	}
}