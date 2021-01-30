package com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium {

	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello maven");
		//local
		//System.setProperty("webdriver.chrome.driver","/Users/shubham/Documents/Softwares/chrome-driver/chromedriver");
		//ubuntu
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--start-maximized");
		//;#open Browser in maximized mode
		//chromeOptions.addArguments("--no-sandbox"); 
		//#bypass OS security model
		//chromeOptions.addArguments("--disable-dev-shm-usage") ;
		chromeOptions.addArguments("--headless");
		//chromeOptions.addArguments("chrome.switches","--disable-extensions");
		/*
		 * chromeOptions.addArguments("start-maximized"); // open Browser in maximized
		 * mode chromeOptions.addArguments("disable-infobars"); // disabling infobars
		 * chromeOptions.addArguments("--disable-extensions"); // disabling extensions
		 * chromeOptions.addArguments("--disable-gpu"); // applicable to windows os only
		 * chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited
		 * resource problems chromeOptions.addArguments("--no-sandbox"); // Bypass OS
		 * security model
		 */		WebDriver webDriver = new ChromeDriver(chromeOptions);
		
		System.out.println("Hi, Welcome to the Edureka test Cases");
		webDriver.get("http://ec2-18-217-205-218.us-east-2.compute.amazonaws.com:8888/addressbook");
		
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.className("v-button")).click();
		webDriver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham Singh");
		webDriver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
		webDriver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		webDriver.findElement(By.id("gwt-uid-11")).sendKeys("xyz@gmail.com");
		webDriver.findElement(By.id("gwt-uid-13")).sendKeys("10/10/1958,");
		webDriver.findElement(By.className("v-button-primary")).click();
		Thread.sleep(5000);
		webDriver.close();
		System.out.println("Test Executed");
	}
	
	

}
