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
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver webDriver = new ChromeDriver(chromeOptions);
		
		System.out.println("Hi, Welcome to the Edureka test Cases");
		webDriver.get("http://ip-172-31-29-215.us-east-2.compute.internal:8888/addressbook");
		
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.className("v-button")).click();
		webDriver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham Singh");
		webDriver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
		webDriver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		webDriver.findElement(By.id("gwt-uid-11")).sendKeys("xyz@gmail.com");
		webDriver.findElement(By.id("gwt-uid-13")).sendKeys("10/10/1999");
		webDriver.findElement(By.className("v-button-primary")).click();
		Thread.sleep(5000);
		webDriver.close();
		System.out.println("Test Executedß");
	}

}
