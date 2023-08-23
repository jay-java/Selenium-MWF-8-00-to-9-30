package com.selenium;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P006_Calender {
	public static void main(String[] args) {
		String url= "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = new DriverConnection().getConnection(url);
		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		System.out.println("frame fetched");
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker']"));
		datepick.click();
		
		WebElement cdate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]"));
		System.out.println(cdate.getText());
		
	}
}
