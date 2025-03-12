package testDD;

import java.io.IOException;

import org.testng.annotations.Test;

import baseDD.ProjectSpecificationMethodsDD;

import pageDD.HomePageDD;

public class TC_002LoginTestDD extends ProjectSpecificationMethodsDD {

	@Test
	public  void LoginTest() throws IOException {// change the main method for TestNg
	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        filepath1="D:\\JavaWorkspace\\DataDriven.DemoWorkshop\\src\\test\\resources\\data\\LoginData.properties";
		readFromPropFile(filepath1);
		
       HomePageDD obj1=new HomePageDD(driver1);
		
		obj1.LaunchingAndLoading(prop.getProperty("url"));
		
		obj1.clickLogin()   
		     .enterEmail(prop.getProperty("Email"))
		     .enterPass(prop.getProperty("Pass"))
		    .clickLoginButton1()
		     .closebrowser();
	
	}

}
