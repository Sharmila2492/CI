package pageDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseDD.ProjectSpecificationMethodsDD;


public class RegisterPageDD extends ProjectSpecificationMethodsDD{
	
	public RegisterPageDD(WebDriver driver1)
	{
		this.driver1=driver1;
	}
	
	
	public RegisterPageDD clickGender()
	{
		driver1.findElement(By.id("gender-female")).click();
		return this;
	}
	
	public RegisterPageDD enterFirstName(String Fname)
	{
		driver1.findElement(By.id("FirstName")).sendKeys(Fname);
		return this;
	}
	
	public RegisterPageDD enterLastName(String Lname)
	{
		driver1.findElement(By.id("LastName")).sendKeys(Lname);
		return this;
	}
	
	public RegisterPageDD enterEmail(String email)
	{
		driver1.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	public RegisterPageDD enterPass(String pass)
	{
		driver1.findElement(By.id("Password")).sendKeys(pass);
		return this;
	}
	
	public RegisterPageDD enterConPass(String conPass)
	{
		driver1.findElement(By.id("ConfirmPassword")).sendKeys(conPass);
	    return this;
	}
	
	public RegisterResultDd clickRegisterButton()
	{
		driver1.findElement(By.id("register-button")).click();
		return new RegisterResultDd(driver1);
		
	}
	

}



