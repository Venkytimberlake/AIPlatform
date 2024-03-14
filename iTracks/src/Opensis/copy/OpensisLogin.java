package Opensis.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class OpensisLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\is8744\\Music\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
				
		
		 opt.addArguments("--use-fake-ui-for-media-stream");  // Use fake UI to allow camera access
	     opt.addArguments("--use-fake-device-for-media-stream");  // Use a fake camera device
	     WebDriver driver = new ChromeDriver(opt);
	     driver.get("https://webcamtests.com/take-photo");
	     
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//button[@id='webcam-launcher']")).click();
		 driver.get("https://webcamtests.com/take-photo");
		System.out.println(driver.getTitle());
		

	}

}
