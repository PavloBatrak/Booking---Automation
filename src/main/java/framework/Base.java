package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	protected WebDriverWait wait;
	protected WebDriver driver;

	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\goodi\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	protected WebDriverWait getWait() {
		wait = new WebDriverWait(this.driver, 5);
		return wait;
	}
}
