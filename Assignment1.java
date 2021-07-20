package week2day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriverManager.chromedriver().setup(); 
			//Instantiate the ChromeDriver
			 ChromeDriver driver=new ChromeDriver(); 
			 
			// load the URL
			 driver.get( "https://acme-test.uipath.com/login");
			 // locate the element
			 WebElement webEmail= driver.findElement(By.id("email"));
			 
			 webEmail.sendKeys("kumar.testleaf@gmail.com") ;
			// WebElement webPassword= driver.findElement(By.id("password"));
			 
			 driver.findElement (By.id("password")).sendKeys("leaf@12");
			 
			 driver.findElement (By.className("btn")).click();
			 //Get the title 
			 
			 String orgTitle= ("ACME System 1 - Dashboard");
			 String title = driver.getTitle();
			 if (orgTitle.equals(title))
			 {
			 
	          System.out.println("ACME System 1 - Dashboard");
			 }
			 else
	          {
				 System.out.println("title is not correct");
	          }
			 driver.findElement (By.linkText("Log Out")).click();
			 System.out.println("logged out successfully");
			 
				// driver.close();
				 			 }
			 
	}
			 
			 
			
			 
			 
			 
			 
			 
			 
					 
			 
			 
			 
			 
			 

	


