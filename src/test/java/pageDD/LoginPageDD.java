package pageDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseDD.ProjectSpecificationMethodsDD;


public class LoginPageDD extends ProjectSpecificationMethodsDD {
	
	public LoginPageDD(WebDriver driver1)
	{
		this.driver1=driver1;
	
	}
	
	public LoginPageDD enterEmail(String email)
	{
		driver1.findElement(By.id("Email")).sendKeys(email);
	    return this;
	}
    
	public LoginPageDD enterPass(String pass)
	{
		driver1.findElement(By.className("password")).sendKeys(pass);
	    return this;
	}
	
	public HomePageDD clickLoginButton1()
	{
		driver1.findElement(By.xpath("//input[contains(@class,'button-1 login-button')]")).click();
		return new HomePageDD(driver1);
	}
}



