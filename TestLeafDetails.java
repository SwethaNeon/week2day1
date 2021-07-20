package week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestLeafDetails
{

public static void main(String[] args) 
{
				// TODO Auto-generated method stub
		                         WebDriverManager.chromedriver().setup(); 
								//Instantiate the ChromeDriver
								 ChromeDriver driver=new ChromeDriver(); 
								// load the URL
								 driver.get("http://leaftaps.com/opentaps/control/main");
								

								// Gets the path of the driver.exe Download by the webDriver
									String property = System.getProperty("webdriver.chrome.driver", "path");
									System.out.println(property);
			                    //locate the user name
								 
								 driver.manage().window().maximize();
								 WebElement webUserName=  driver.findElement(By.id("username"));
								 
								// Enter the text in the web element
								webUserName.sendKeys("demosalesmanager");
								
						       // WebElement webPassWord= driver.findElement(By.id("password"));
								
								driver.findElement(By.id("password")).sendKeys("crmsfa");
								driver.findElement(By.className("decorativeSubmit")).click();
								//<a> + text
								driver.findElement(By.linkText("CRM/SFA")).click();
								
								
								driver.findElement(By.linkText("Leads")).click();
								driver.findElement(By.linkText("Create Lead")).click();
								driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
								driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
								driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
								driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SwethaRajendran");
								
								WebElement webCountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
								
								//clear
								//sendKeys
								
								webCountryCode.clear();
								webCountryCode.sendKeys("62");
								driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("dindigul");
								driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rswetha14701@gmail.com");
								driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7545286412");
								driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("none");
								driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://leaftaps.com");
								
								driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SwethaRajendran");
								driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rajendran");
								driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Selenium");
							    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("LearningSelenium");
								driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mathematics");
								driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("");
								driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("562410");
								driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
								driver.findElement(By.id("createLeadForm_description")).sendKeys("All workers should work properly");
								driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Don't affect the Unity and integrity");
								// primary address
								
								driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("rajalakshmi");
								driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Sruthi");
								driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("7/8/11- bharathi nagar,Madurai");
								driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("NO:6, Thirunagar,madurai");
							    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("MADURAI");
							    driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TamilNadu");
							    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625478");
							    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("602147");
							    String nameToEnter= "Swetha";
							    
							    driver.findElement(By.className("smallSubmit")).click();
							    String orgTitle="View Lead | opentaps CRM";
							    
							    String title=  driver.getTitle();
							    					   
						
							     if (orgTitle.equals(title))
							    {
							    	System.out.println("View Lead | opentaps CRM");
							    }
							   
							    else {
							    	System.out.println("title is not correct");
							    }}}
							   
							   
							    
							   
							    
							   

								
										
								
		
	


