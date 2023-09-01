package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P010_ScrollEvent {
	public static void main(String[] args) {
		String url= "https://demoqa.com/automation-practice-form";
		WebDriver driver = new DriverConnection().getConnection(url);
		WebElement btn = driver.findElement(By.id("uploadPicture"));
		btn.sendKeys("C:\\Users\\jay-pc\\Downloads\\WhatsApp Image 2023-08-31 at 5.17.01 PM.jpeg");
		
		//1.Scroll By pixels
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,50)");
		
		//2.Scroll By element
//		WebElement ele = driver.findElement(By.xpath("//*[@id='stateCity-wrapper']/div[2]/div/div/div[1]"));

        // Scrolling down the page till the element is found		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("arguments[0].scrollIntoView();", ele);
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
