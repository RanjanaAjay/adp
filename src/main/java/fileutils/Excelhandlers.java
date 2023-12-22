package fileutils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelhandlers{

	String path="";
public String readExcel(String sheet,int row,int cell) throws IOException {
	return	WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	
public void writeExcel(String sheet,int row,int cell,String data) throws IOException {
		
		WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		new FileOutputStream(path).write(cell);
}
public String readFromExcel(String sheet,String rowval,String colVal) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String data = null;
		int row=0, col=0;
	row=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getPhysicalNumberOfRows();
	col=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(row).getPhysicalNumberOfCells();
	
		for(int i=0;i<row;i++) {
			if(rowval.equalsIgnoreCase(readExcel(sheet, i, 0))) {
				row=i;
				break;
			}
		}
		for(int i=0;i<col;i++) {
			if(rowval.equalsIgnoreCase(readExcel(sheet, 0, i))) {
				col=i;
				break;
			}
		}
		return readExcel(sheet, row, col);
	}
	
public void writeToExcel(String sheet, String rowval,String colVal,String data) throws EncryptedDocumentException, FileNotFoundException, IOException {
	
	int row=0, col=0;
row=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getPhysicalNumberOfRows();
col=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(row).getPhysicalNumberOfCells();

	for(int i=0;i<row;i++) {
		if(rowval.equalsIgnoreCase(readExcel(sheet, i, 0))) {
			row=i;
			break;
		}
	}
	for(int i=0;i<col;i++) {
		if(rowval.equalsIgnoreCase(readExcel(sheet, 0, i))) {
			col=i;
			break;
		}
	}
	writeExcel(sheet, row, col, data);
}
		
	
public String readFromExcel(String sheet, int row, int col) throws IOException {
	return readExcel(sheet, row, col);
}

public void writeToExcel(String sheet, int row, int col, String data) throws IOException {
	writeExcel(sheet, row, col, data);	
}

}
