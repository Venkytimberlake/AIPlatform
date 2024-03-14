package AI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AILogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\is8744\\Music\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
				
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://quixl-test.integra.co.in/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("superadmin@integra.co.in");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@href='/user/']")).getCssValue("font-family");
		driver.findElement(By.xpath("//a[@href='/user/']")).click();
		driver.findElement(By.id("add_user_button")).click();
		driver.findElement(By.xpath("//a[@href='/tenants/']")).click();
		driver.findElement(By.xpath("//button[@class='tenantIconBtn'][1]")).click();
//		driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-1gj39a5']]")).click();
//		driver.findElement(By.xpath("//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root item_font css-qz21go'][1]")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("dinesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dineshraj.thiyaga@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dinesh@1212");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root cancelButton_for_all_pages css-xjeo1l']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault avatar-svg css-68ksd8']")).click();
		driver.findElement(By.xpath("//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root Logout_menuItem css-qz21go']")).click();
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root closeConfirmButton css-103fral']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("dineshraj.thiyaga@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dinesh@1212");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root LaunchButton_for_User css-103fral'][1]")).click();
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root closeConfirmButtonLaunch css-1iadkma']")).click();
		
		
		// Wait for the alert to be present        
		//WebDriverWait wait = new WebDriverWait(driver, 50);         
		//'wait.until(ExpectedConditions.alertIsPresent());         
		// Switch to the alert        
		Alert alert = driver.switchTo().alert();         
		// Get the text from the alert        
		String alertText = alert.getText();         
		System.out.println("Alert Text: " + alertText);         
		// Close the alert        
	//	alert.accept();         
		// Close the browser        
	//	driver.quit();     
		}
		
		
		
		
		
		
		
		
		
	}


