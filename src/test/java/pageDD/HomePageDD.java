package pageDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseDD.ProjectSpecificationMethodsDD;



public class HomePageDD extends ProjectSpecificationMethodsDD{
	
	public HomePageDD(WebDriver driver1)
	{
		this.driver1=driver1;
	}
    
	
	 public RegisterPageDD clickRegister()
	    {
	    	driver1.findElement(By.className("ico-register")).click();
	    	
	    	return new RegisterPageDD(driver1);
	    }
		
	 public LoginPageDD clickLogin()
		{
			//clicklogin.click();
			driver1.findElement(By.className("ico-login")).click();
			
			return new LoginPageDD(driver1);
		}
		
	 
	 
}
