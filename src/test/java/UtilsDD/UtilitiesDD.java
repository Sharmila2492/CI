package UtilsDD;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilitiesDD {
	
	public static WebDriver driver1=new ChromeDriver();
	
	public static Properties prop;
	public static String filepath1;
	
	//public void Browser()
	public void Browser(String url)
	{
		//driver1=new ChromeDriver();
		//driver1.get("https://demowebshop.tricentis.com/");
		driver1.get(url);
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void closeBrowser()
	{
		driver1.close();
	}
	
	public static String getCellData(String filepath, String SheetName, int RowNum, int colNum) throws IOException
	{
		XSSFWorkbook book =new XSSFWorkbook(filepath);
		XSSFSheet Sheet=book.getSheet(SheetName);
		XSSFCell cell=Sheet.getRow(RowNum).getCell(colNum);
		String data=cell.toString();
		return data;
		
	}

   public static void readFromPropFile(String filepath1) throws IOException
   {
	   FileReader file=new FileReader(filepath1); //read the data from the file
       prop=new Properties();  //maintain all the properties in the particular file
       prop.load(file); //load all the data into the file
	   
   }
}
