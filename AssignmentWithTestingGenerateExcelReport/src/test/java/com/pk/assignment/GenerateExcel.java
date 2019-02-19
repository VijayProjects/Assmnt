package com.pk.assignment;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;



public class GenerateExcel {

	public static void main(String[] args) throws Exception{
		JUnitCore core = new JUnitCore();
		Result result = core.run(HackerSol1Test.class);
		//System.out.println("Total Test Run: " + result.getRunCount());

		Workbook workbook= new HSSFWorkbook();
		OutputStream os=new FileOutputStream("Report.xlsx");
		
		workbook.createSheet("Test_Reprot");
		workbook.write(os);
		workbook.close();
	}

}
