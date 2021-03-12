package JavaActivitySession4;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity4_3 {
	
	private static final String FILE_NAME = "C://Users//KIRANCHAVAN//Documents//SDET Workspace//OnlineStor//resources//TestSheet.xlsx";
	
	public static void main(String[] args) {
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("DataTpe Java");
			Object[][] datatypes = {
	                {"Datatype", "Type", "Size(in bytes)"},
	                {"int", "Primitive", 2},
	                {"float", "Primitive", 4},
	                {"double", "Primitive", 8},
	                {"char", "Primitive", 1},
	                {"String", "Non-Primitive", "No fixed size"}
	        };
			
			int rowNum=0;
			System.out.println("Creating Excel");
			for(Object[] datatype:datatypes)
			{
				Row row = sheet.createRow(rowNum++);
				int colNum=0;
				for(Object field : datatype)
				{
					Cell cell = row.createCell(colNum++);
					if(field instanceof String)
					{
						cell.setCellValue((String) field);
						
					}
					else
						if (field instanceof Integer) 
						{
		                    cell.setCellValue((Integer) field);
					
				}
					
				
				
			}
			
			}		
			
			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
			workbook.write(outputStream);
            workbook.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	}


