package testNGOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

public class ExcelHandling {

	
	FileInputStream fin ;
	HSSFWorkbook wb;
	HSSFSheet sh;
	
	HSSFRow row;
	
	HSSFCell cell;
	
	HSSFCellStyle style;
	public String Path;
	
	
	public ExcelHandling(String Path)
	{
		this.Path = Path;
	}
	
	
	public int getRowCount(String sheet,int row) throws IOException
	{
		fin = new FileInputStream(Path);
		wb = new HSSFWorkbook(fin);
		sh = wb.getSheetAt(0);
		
		int row1 =sh.getLastRowNum();
		return row1;
	}
	
	public int getColumnCount(String sheet,int row) throws IOException
	{
		fin = new FileInputStream(Path);
		wb = new HSSFWorkbook(fin);
		sh = wb.getSheetAt(0);
		
	int cell1 = 	sh.getRow(row).getLastCellNum();
		return cell1;
	}

	
	public String getCellData(String sheet, int row1 , int column) throws IOException
	{
		fin = new FileInputStream(Path);
		wb = new HSSFWorkbook(fin);
		sh = wb.getSheetAt(0);
		row = sh.getRow(row1);
		String data = row.getCell(column).getStringCellValue();
		return data;
}

	public void SetCellData(int row1 , int column,String data) throws IOException
	{
		fin = new FileInputStream(Path);
		wb = new HSSFWorkbook(fin);
		sh = wb.getSheetAt(0);
		row = sh.getRow(row1);
		row.getCell(column).setCellValue(data);
		}

	public void SetColorGreen(int row1 , int column,String data) throws IOException
	{
		fin = new FileInputStream(Path);
		wb = new HSSFWorkbook(fin);
		style = wb.createCellStyle();
		row = sh.getRow(row1);
		
		cell=row.getCell(column);
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		
		
		}

	public void SetColorRed(int row1 , int column,String data) throws IOException
	{
		fin = new FileInputStream(Path);
		wb = new HSSFWorkbook(fin);
		style = wb.createCellStyle();
		row = sh.getRow(row1);
		
		cell=row.getCell(column);
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		
		
		}


	
	
}