package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P013_PracticeFrom {
	public static void main(String[] args) {
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = new DriverConnection().getConnection(url);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
//		*[@id='hobbies-checkbox-1']/following-sibling::label
	}
}
