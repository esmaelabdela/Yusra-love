package newLogin;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static WebDriver driver;
	
	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://qa.codefios.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void loginMethod() {
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("demo1@codefios.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@id='login_submit']")).click();
		System.out.println("i am on dashboard");
	}
	
}
