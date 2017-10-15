package com.mvntng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMvnTng2 {
	

 WebDriver driver;

@Test
public void demoAuto() throws Exception{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
			driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
	/*		driver.get("http://newtours.demoaut.com/");
			Thread.sleep(5000);
		driver.findElement(By.name("userName")).sendKeys("batman1");
		driver.findElement(By.name("password")).sendKeys("batman1");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.name("findFlights")).click();
	WebElement table = driver.findElement(By.xpath(".//form[@name='results']/table[1]/tbody"));

	           List<WebElement> trows = table.findElements(By.tagName("tr"));
	           for(int r = 0;r<trows.size();r++){
	           List<WebElement> tcols =trows.get(r).findElements(By.tagName("td"));
	           for(int c=0;c<tcols.size();c++){
	        	 String expected = "Pangaea Airlines 362";
	        	 String actual = tcols.get(c).getText().trim();
	        	 if(actual.equals(expected)){
	        		 tcols.get(c-1).click();
	        	 }
	           }
	           System.out.println();
	           }*/
	}}
