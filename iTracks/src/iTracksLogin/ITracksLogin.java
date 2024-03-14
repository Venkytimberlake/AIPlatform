package iTracksLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ITracksLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\is8744\\Music\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
//		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		ChromeOptions option;
		opt.setAcceptInsecureCerts(true);
		
		driver.get("https://lms.integra.co.in/opensis/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//a[normalize-space()='School'][1]"));
		a.moveToElement(admin).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='hidden-ul']//li[@class='active']//a[@id='hm']")).click();
//		driver.findElement(By.xpath("//ul[@class='hidden-ul']//li[@class='active']//a[@id='hm']")).click();
//		driver.findElement(By.xpath("//span[@id='select2-syear-d1-container']")).click();
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//ul[@style='display: none;']")).click();
		
//		driver.find_element(By.xpath("/span[@class='legitRipple-ripple' and contains(., 'School Setup')]"));
		//		WebElement dropdown = driver.findElement(By.xpath("//ul[@style='display: none;']"));
		// Change "dropdownId" to your dropdown's ID
		       
		// Create a Select object
		       
//		Select select = new Select (dropdown);        
		// Select by visible text
//select.selectByVisibleText("Portal Notes");
	//	System.out.println(driver.getTitle());
		
//		driver.manage().window().maximize();
		
		
//		ChromeOptions options = new ChromeOptions();
//		
//		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
//				"--ignore-certificate-errors");
//		
//		driver.get("http://inet/iTracks/iTracks/Home/iTracksLogin.aspx");
		
//	driver.findElement(By.xpath("//input[@id='ctl00_cphBody_txtUser']")).sendKeys("is0262");
//	
//	driver.findElement(By.xpath("//input[@id='ctl00_cphBody_txtPass']")).sendKeys("123Welcome");
//	
//	driver.findElement(By.xpath("//input[@id='ctl00_cphBody_btnLogin']")).click();
	

	}

}
