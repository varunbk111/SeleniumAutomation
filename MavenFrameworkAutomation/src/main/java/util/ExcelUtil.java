package util;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtil {
		private static XSSFSheet sh;
		private static XSSFWorkbook wb;
		private static XSSFCell Cell;
		private static XSSFRow Row;
		
		
		

		
	/*	public static void main(String[] args) throws IOException{
			
			FileInputStream fis= new FileInputStream("D:\\Selenium Final\\Learning\\AutomationTesting\\src\\test\\resources\\TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1= wb.getSheetAt(0);
			System.out.println(sh1.getRow(1).getCell(0).getRawValue());
			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(1).getCell(2).getStringCellValue());
			
			
			
		}*/
		
		
public static void setExcelData(String FilePath,String SheetName)throws Exception{
			
			String[][]excelData =null;
				FileInputStream ExcelFile = new FileInputStream(FilePath);
				wb= new XSSFWorkbook(ExcelFile);
				sh = wb.getSheet(SheetName);
			}
		
		public static Object[][] getExcelData()throws Exception{
			
			String[][]excelData =null;
			try{
	/*			FileInputStream ExcelFile = new FileInputStream(FilePath);
				wb= new XSSFWorkbook(ExcelFile);
				sh = wb.getSheet(SheetName);  */
				int startrow = 1;
				int startcol=1;
				int ci,cj;
				int totalRows = sh.getLastRowNum();
				int totalCols=2;
				excelData =new String[totalRows][totalCols];
				ci=0;
				for (int i=startrow;i<=totalRows;i++){
					cj=0;
					for(int j=startcol;j<=totalCols;j++,cj++ ){
						excelData [ci][cj]= getCellData(i,j);
						System.out.println(excelData[ci][cj]);
					}
					
				}
				
				
			}
			catch (FileNotFoundException e){
				System.out.println("Could not read the excel sheet");
				e.printStackTrace();
			}
			catch(IOException e){
				System.out.println("Could not read the excel sheet");
				e.printStackTrace();
			}
			return (excelData);
					
		}
		
		public static String getCellData(int RowNum,int ColNum)throws Exception{
			try{
				Cell = sh.getRow(RowNum).getCell(ColNum);
				String CellData = Cell.getStringCellValue();
				return CellData;
			}
			catch(Exception e){
				return"";
			}
		}

	}
