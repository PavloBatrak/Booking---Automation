package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {

	private static WebDriver driver;
	private static WebDriverWait wait;

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\goodi\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);
	}

	public static WebDriver getDriver() {
		return driver;
	}
		
	public static WebDriverWait getWait() {
		return wait;
	}

}
