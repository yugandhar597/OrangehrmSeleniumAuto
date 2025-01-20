package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseTest {

	protected WebDriver driver;
	@Test
	public void setup() {
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void teardown() {
		driver.quit();
	}

}
