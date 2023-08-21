package com.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P004_AlertHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = new DriverConnection().getConnection(url);
		// 1.Alert
//		WebElement alertButton = driver.findElement(By.id("alertButton"));
//		alertButton.click();
//		System.out.println("alert clicked");
//		
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();

		// 2.Alert
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		
//		WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
//		alertButton.click();
//		Thread.sleep(7000);
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		// 3.Alert
//		WebElement alertButton = driver.findElement(By.id("confirmButton"));
//		alertButton.click();
//		
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();

		// 4.Alert
		WebElement alertButton = driver.findElement(By.id("promtButton"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("enter text here");
		alert.accept();
	}
}
