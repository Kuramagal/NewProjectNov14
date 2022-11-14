package org.test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RevisionTest {

	
	public static void main (String[]args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
		WebElement btn=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		btn.click();
		
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("perfume for women");
		search.submit();
			
		List<WebElement> m=driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		
		
		for(int i = 0; i< m.size(); i++) {
	        
	         String s = m.get(i).getText();
	         System.out.println("Title is: " + s);
		}
	    //Print Rate
	         
	     		 		 			
	 		List<WebElement> r=driver.findElements(By.xpath("//div[@class='_30jeq3']"));
	 		
	 		
	 		for(int j = 0; j< r.size(); j++) {
	 	        
	 	         String rate = r.get(j).getText();
	 	         System.out.println("Price is: " + rate);
	         
	       //Map  
	 	         
	 	   
	 	     
	 	         
	 	         
	 	         
	 	         
	 	         
	      }
		
		
					
	      driver.quit();
		
	}
	
	}

