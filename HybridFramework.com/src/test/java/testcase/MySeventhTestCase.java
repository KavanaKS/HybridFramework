package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import base.BaseTest;

public class MySeventhTestCase extends BaseTest{
	
		@Test
		public static void LoginTest() throws InterruptedException, IOException
		{
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='header']/section/div/ul[1]/li[1]/a")).click();
        System.out.println("Help clicked Successfully");
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\HybridFramework.com\\Screenshots\\Screenshots.png"));
		System.out.println("Screenshot captured successfully");
		}
}
