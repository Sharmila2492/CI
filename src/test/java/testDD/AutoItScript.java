package testDD;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItScript {

	public static void main(String[] args) throws IOException, InterruptedException {

      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.ilovepdf.com/pdf_to_word");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
      driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
		
		Thread.sleep(5000);
		
		//Runtime.getRuntime().exec("D:\\AutoItScripts\\DocumentUploads1.exe");
		String path="D:\\\\AutoItScripts\\\\DocumentUploads1.exe";
		ProcessBuilder builder=new ProcessBuilder(path);// used to get  and read the window element
		builder.start();
		
		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		
		driver.findElement(By.id("pickfiles")).click();
		
	}


}
