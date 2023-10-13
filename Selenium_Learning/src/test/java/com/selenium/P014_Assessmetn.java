package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P014_Assessmetn {
	public static void main(String[] args) {
		String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(row.size());
		List<Integer> heights = new ArrayList<Integer>();
		for(int i=2;i<=row.size();i++) {
			List<WebElement> row_data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]"));
			List<WebElement> col_data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]"));
			for(WebElement col_ele : col_data) {
				String col = col_ele.getText();
				heights.add(Integer.parseInt(col));
				System.out.println(col_ele.getText());
				
			}
		}
	}
}
