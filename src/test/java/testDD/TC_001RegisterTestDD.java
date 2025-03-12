package testDD;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import baseDD.ProjectSpecificationMethodsDD;
import pageDD.HomePageDD;

public class TC_001RegisterTestDD extends ProjectSpecificationMethodsDD {
    
	@Test//Mandatory
	
	public  void RegisterTest() throws IOException {
	//public static void main(String[] args) throws IOException {
	
		String filepath="D:\\JavaWorkspace\\DataDriven.DemoWorkshop\\src\\test\\resources\\data\\DDExcelfile1.xlsx";
		String FirstName=getCellData(filepath, "RegisterData", 1, 0);  //second row first column starts from inde value
		String LastName=getCellData(filepath, "RegisterData", 1, 1);
		String email=getCellData(filepath, "RegisterData", 1, 2);
		String pass=getCellData(filepath, "RegisterData", 1, 3);
		String conPass=getCellData(filepath, "RegisterData", 1, 4);
		
		 filepath1="D:\\JavaWorkspace\\DataDriven.DemoWorkshop\\src\\test\\resources\\data\\LoginData.properties";
			readFromPropFile(filepath1);
		
		HomePageDD Reg=new HomePageDD(driver1);
			
         Reg.LaunchingAndLoading(prop.getProperty("url"));
		
		 Reg.clickRegister()
		    .clickGender()
		    .enterFirstName(FirstName)
		    .enterLastName(LastName)
		    .enterEmail(email)
		    .enterPass(pass)
		    .enterConPass(conPass)
		    .clickRegisterButton()
		    .validateRegisterResult1()
		    .clickContinue();
	}
	
	
}
