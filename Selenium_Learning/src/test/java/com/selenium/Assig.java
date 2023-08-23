package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assig {
	public static void main(String[] args) {
		String url ="https://phptravels.com/demo/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		WebElement num1 = driver.findElement(By.id("numb1"));
		String s1 = num1.getText();
		int n1 = Integer.parseInt(s1);
		
		WebElement num2 = driver.findElement(By.id("numb2"));
		String s2 = num2.getText();
		int n2 = Integer.parseInt(s2);
		int n3 = n1+n2;
		
		String s3 = String.valueOf(n3);
		WebElement res = driver.findElement(By.id("number"));
		res.sendKeys(s3);
	}
}
