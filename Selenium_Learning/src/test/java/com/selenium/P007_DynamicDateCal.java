package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P007_DynamicDateCal {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = new DriverConnection().getConnection(url);

		driver.findElement(By.id("DropDown DatePicker")).click();
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[2]/p/iframe"));

		System.out.println("frame fetched");
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
//		Thread.sleep(2000);
//		

		/*
		 * WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker']"));
		 * datepick.click(); Thread.sleep(2000); String myDate = "10"; String myMonth =
		 * "April"; String myYear = "2000"; String currentYear =
		 * driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText()
		 * ; int y1 = Integer.parseInt(myYear); int y2 = Integer.parseInt(currentYear);
		 * while(!myYear.equals(driver.findElement(By.xpath(
		 * "//span[@class='ui-datepicker-year']")).getText())) { // WebElement prev =
		 * driver.findElement(By.xpath("//a[@data-handler='prev']/span")); if(y1>y2) {
		 * driver.findElement(By.xpath("//a[@data-handler='next']/span")).click(); }
		 * else {
		 * driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click(); } }
		 * while(!myMonth.equals(driver.findElement(By.xpath(
		 * "//span[@class='ui-datepicker-month']")).getText())) { if(y1>y2) {
		 * driver.findElement(By.xpath("//a[@data-handler='next']/span")).click(); }
		 * else {
		 * driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click(); } }
		 * 
		 * List<WebElement> dates = driver.findElements(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")); for(WebElement
		 * date:dates) { String d = date.getText();
		 * System.out.println(d+" / "+myMonth+" / "+myYear); if(d.equals(myDate)) {
		 * date.click(); } }
		 */
	}
}
