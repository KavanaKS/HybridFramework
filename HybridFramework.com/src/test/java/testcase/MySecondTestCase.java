package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import base.BaseTest;

public class MySecondTestCase extends BaseTest{
	
		@Test
		public static void LoginTest() throws InterruptedException, IOException
		{
			
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#head-alert > div > div > a > strong")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='search']")).click();
		System.out.println("Clicked Successfully");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\HybridFramework.com\\Screenshots\\Screenshots.png"));
		System.out.println("Screenshot captured successfully");
}
}