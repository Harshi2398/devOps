package loginTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class UdemyLogin {
	WebDriver driver;

	@Test
	public void doLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.udemy.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
	Assert.assertEquals(driver.getTitle(), "Attention Required! | CloudFlare");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/target/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
