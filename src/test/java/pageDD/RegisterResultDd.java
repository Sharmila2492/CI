package pageDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseDD.ProjectSpecificationMethodsDD;


public class RegisterResultDd extends ProjectSpecificationMethodsDD{
	

	public RegisterResultDd(WebDriver driver1)
	{
		this.driver1=driver1;
		
	}
	
	 public RegisterResultDd validateRegisterResult1()
	   {
		   String actualtext=driver1.findElement(By.className("result")).getText();
	       String expectedText="Your registration completed";
	       
	       if(actualtext.contains(expectedText))
	       {
	    	   System.out.println("Registration successfull");
	       }else
	       {
	    	   System.out.println("Register unsuccessfull");
	       }
	       return this;
	   }
	   
	   public HomePageDD clickContinue()
	   {
		   driver1.findElement(By.xpath("//input[contains(@class,'button-1 register-continue-button')]")).click();
		   return new HomePageDD(driver1);
	   }
	   
	}



