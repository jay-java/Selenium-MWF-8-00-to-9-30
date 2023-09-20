package listener;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBTestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("myDriver");
		System.out.println("driver ------>"+driver);
		System.out.println("driver get");
		String imgName = result.getName();
		String path = "D:\\ScreenShot\\ss\\" + imgName + ".png";
		System.out.println("path ready");
		TakesScreenshot ss = (TakesScreenshot) driver;
		System.out.println("screeen shot ----->"+ss);
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
