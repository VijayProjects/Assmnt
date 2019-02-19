package com.pk.assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {

	public static void main(String[] args) {
		JUnitCore core = new JUnitCore();
		Result result = core.run(HackerSol1Test.class);
		//System.out.println("Total Test Run: " + result.getRunCount());

		try {

			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("TestReport.pdf"));
			document.open();
			document.setPageSize(PageSize.A4);
			Font font = FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK);
			Paragraph paragraph = new Paragraph("This is Automated Test Report Generation for the test cases.", font);
			paragraph.setAlignment(Element.ALIGN_CENTER);
			paragraph.setSpacingAfter(5);
			document.add(paragraph);
			//create table
			PdfPTable table=new PdfPTable(2);
			table.spacingBefore();
			table.spacingAfter();
			
			PdfPCell cell=new PdfPCell(new Paragraph("Total Test Case Run",font));
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);
			
			cell=new PdfPCell(new Paragraph(String.valueOf(result.getRunCount()),font));
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);
			
			cell=new PdfPCell(new Paragraph("Success Test case",font));
			cell.setBackgroundColor(BaseColor.GREEN);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);
			
			cell=new PdfPCell(new Paragraph(String.valueOf(result.getRunCount()-result.getFailureCount()), font));
			cell.setBackgroundColor(BaseColor.GREEN);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);
			
			cell=new PdfPCell(new Paragraph("Failure Test case",font));
			cell.setBackgroundColor(BaseColor.RED);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);
			
			cell=new PdfPCell(new Paragraph(String.valueOf(result.getFailureCount()), font));
			cell.setBackgroundColor(BaseColor.RED);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);
			
			if(result.getFailureCount()>0) {
				cell=new PdfPCell(new Paragraph("Failure Reson",font));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
				
				cell=new PdfPCell(new Paragraph(String.valueOf(result.getFailures()), font));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);
			}
			
			document.add(table);
			document.close();
			System.out.println("PDF report generated....");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
