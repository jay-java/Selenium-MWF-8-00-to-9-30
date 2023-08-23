package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P007_DynamicDateCal {
	public static void main(String[] args) {
		String url= "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = new DriverConnection().getConnection(url);
		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		System.out.println("frame fetched");
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker']"));
		datepick.click();
		String myDate = "1";
		String myMonth = "April";
		String myYear = "2000";
		
		WebElement currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		System.out.println(currentYear.getText());
		
		while(!currentYear.equals(myYear)) {
			WebElement prev = driver.findElement(By.xpath("//a[@data-handler='prev']/span"));
			prev.click();
		}
	}
}
