package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicTest {
	public static void main(String[] args) {
		String url ="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(url);
		String expectedResult="facebook.com";
		String actual = driver.getTitle();
		System.out.println(actual);
		if(expectedResult.equals(actual)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("selenium@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("pass");
		
//		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jay-pc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
	}
}
