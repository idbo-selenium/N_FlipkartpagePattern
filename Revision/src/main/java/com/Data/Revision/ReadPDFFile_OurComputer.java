package com.Data.Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class ReadPDFFile_OurComputer {
	
	public static void main(String [] args){
		
		PDFTextStripper stripper = null;
		PDDocument document = null;
		COSDocument cosdoc = null;
		String parseText = null;
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\sravan\\Desktop\\important\\Laravel 5 (1).pdf");
			PDFParser parser = new PDFParser(file);
			parser.parse();
			cosdoc = parser.getDocument();
			stripper = new PDFTextStripper();
			stripper.setStartPage(1);
			stripper.setEndPage(10);
			
			document = new PDDocument(cosdoc);
			parseText = stripper.getText(document);
			System.out.println("**********************************************");
			System.out.println(parseText);
			System.out.println("**********************************************");
			cosdoc.close();
			document.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}