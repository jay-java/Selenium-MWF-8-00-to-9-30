package junit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class P05_AnnotationPractical {
	static WebDriver driver;
	@BeforeClass
	public static void beforeCLass() {
		driver = new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public static void afterClass() {
		driver.close();
	}
	@Test
	public void titleTest() {
		assertEquals("Facebook Login", driver.getTitle());
	}
	
}
