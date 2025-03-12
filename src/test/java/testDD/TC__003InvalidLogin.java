package testDD;

import java.io.IOException;

import baseDD.ProjectSpecificationMethodsDD;
import pageDD.HomePageDD;

public class TC__003InvalidLogin extends ProjectSpecificationMethodsDD {

	public static void main(String[] args) throws IOException {
		
		 filepath1="D:\\JavaWorkspace\\DataDriven.DemoWorkshop\\src\\test\\resources\\data\\LoginData.properties";
		readFromPropFile(filepath1);
        HomePageDD obj2=new HomePageDD(driver1);
		
		obj2.LaunchingAndLoading(prop.getProperty("url"));
		
		obj2.clickLogin()
		     .enterEmail(prop.getProperty("InEmail"))
		     .enterPass(prop.getProperty("InPass"))
		    .clickLoginButton1()
		     .closebrowser();
	
	}

}
