package pdfOperations;

import java.io.File;
import java.io.IOException;
import java.rmi.server.LoaderHandler;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFOperations {

	public static void main(String[] args) throws IOException {
		
		
		//Set Contents from PDF Document
		
		File file = new File(".\\testData\\pipeline.pdf");
		
		PDDocument doc = new PDDocument();
		
		PDPage page = new PDPage(PDRectangle.A4);
		
		doc.addPage(page);
		
		PDPageContentStream stream = new PDPageContentStream(doc,page);
		
		
		stream.setFont(PDType1Font.COURIER, 12);
		stream.beginText();
		
		stream.newLineAtOffset(25, 25);
		
		stream.showText("Launching my own PDF");
		
		stream.endText();
		
		
		doc.save(file);
		
		doc.close();
	
	
	
	//Get Contents from PDF Document
	
	PDDocument doc1 = PDDocument.load(file);
	
	PDFTextStripper str = new PDFTextStripper();
	
	String data = str.getText(doc1);
}
}
