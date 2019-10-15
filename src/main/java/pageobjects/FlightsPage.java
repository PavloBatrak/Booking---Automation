package pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.Base;

public class FlightsPage extends Base{
	
	public FlightsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	private WebElement switchTab;
	private WebElement searchButton;
	private WebElement errorMessage;
	private WebElement departureElement;
	private WebElement destinationElement;
	private WebElement calendarDepartureElement;
	private WebElement calendarElement;
	private WebElement calendarReturnElement;
	
	private WebElement buttonReturn;
	private WebElement buttonOneWay;
	private WebElement buttonMultiCity;
	private WebElement inputData;
	private WebElement outputData;
	private WebElement calendarInput;
	private WebElement calendarOutput;
	private WebElement carHireElement;
	
	public void departureField() {
		
		departureElement = driver.findElement(By.xpath("//div[@class='search-form-inner']//div[@class='inputWrapper']//input[@id='A1gz-origin']"));
		
	}
	
	public void destinationField() {
		
		destinationElement = driver.findElement(By.xpath("//div[@class='search-form-inner']//div[@class='keel-grid field-grid']//input[@id='A1gz-destination']"));
		
	}
	
	
	public void calendarField() {
		
		calendarDepartureElement = driver.findElement(By.xpath("(//div[@class='search-form-inner']//div[@class='col-dates col-field single-date-picker']//div[@class='keel-grid dateRangeGrid'])[1]"));
		calendarDepartureElement.click();
		wait.until(ExpectedConditions.visibilityOf(calendarDepartureElement));
		
		calendarElement = driver.findElement(By.xpath("//div[@class='contentContainer']"));
		wait.until(ExpectedConditions.visibilityOf(calendarElement));
		
		
	}
	
	public void checkErrorMessageIfEmptySearchField() {
		
		errorMessage = driver.findElement(By.xpath("//div[@class='errorContent']"));
		errorMessage.isDisplayed();
		
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		
		errorMessage = driver.findElement(By.xpath("//div[@class='errorContent']//button[@id='TlcW-close']")); // click - OK
		errorMessage.click();
		
		errorMessage = driver.findElement(By.xpath("div[@id='TlcW-dialog-content']//button[@id='TlcW-dialog-close']")); // click - X
		
	}
	
	public void returnField() {
		
		buttonReturn = driver.findElement(By.xpath("//div[@class='displayCatBlock']//label[@title='Return']"));
		
		
		//div[@class='displayCatBlock']//label[@title='Return']
	}
	
	public void oneWayField() {
		
		buttonOneWay = driver.findElement(By.xpath("//div[@class='displayCatBlock']//label[@title='One-way']"));
		
		//div[@class='displayCatBlock']//label[@title='One-way']
	}
	
	
	public void multiCityField() {
		
		buttonMultiCity = driver.findElement(By.xpath("//div[@class='displayCatBlock']//label[@title='Multi-city']"));
		
		//div[@class='displayCatBlock']//label[@title='Multi-city']
	}
	

	public void goToCarHiresTab() {
		
		carHireElement = driver.findElement(By.linkText("cars"));
		carHireElement.click();
	}
		
	public void clickSearchField() {
		searchButton = driver.findElement(By.xpath("//button[@id='bxHa-submit']"));
		searchButton.click();
	}
	
	
	public void switchTabField() {
		
		switchTab = driver.findElement(By.xpath("(//div[@class='keel-grid headerContainerGrid Common-Layout-Brands-Booking-Header ']//div[@class='keel-container layer-header headerContainer']//a)[1]"));
		switchTab.click();
		
		System.out.println(((WebDriver) switchTab).getTitle());
		
	}
	
	public void switchTab() {
		
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		
		//Use the list of window handles to switch between windows
		driver.switchTo().window((String) tabs.get(0));

		//Switch back to original window
		driver.switchTo().window(windowHandle); //mainWindowHandle
		
		
		//Open a new tab using Ctrl + t
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		//Switch between tabs using Ctrl + \t
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	}
	
}
	
	/**
	 * 
	 * psdbComponent.clickDocumentLink();
    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    driver.close();
    driver.switchTo().window(tabs2.get(0));
	 * 
	 */


	/**
	 * 	//Get the current window handle
	String windowHandle = driver.getWindowHandle();

	//Get the list of window handles
	ArrayList tabs = new ArrayList (driver.getWindowHandles());
	System.out.println(tabs.size());
	//Use the list of window handles to switch between windows
	driver.switchTo().window(tabs.get(0));

	//Switch back to original window
	driver.switchTo().window(mainWindowHandle);
	
	
	//Open a new tab using Ctrl + t
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	//Switch between tabs using Ctrl + \t
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	*/

