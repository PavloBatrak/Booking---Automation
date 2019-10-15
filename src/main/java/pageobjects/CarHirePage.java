package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.Base;

public class CarHirePage extends Base {
	
	
	public CarHirePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	private WebElement returnSameLocationButton;
	private WebElement returnDifferentLocationButton;
	private WebElement pickupField;
	private WebElement dropoffField;
	private WebElement ageLimitOff;
	private WebElement setAge;
	private WebElement searchButton;
	private WebElement firstCalendarField;
	private WebElement secondCalendarField;
	
	private WebElement algheroElement;
	private WebElement londonElement;
	private WebElement milanElement;
	private WebElement romeElement;
	private WebElement parisElement;
	private WebElement barcelonaElement;
	
	private WebElement madridElement;
	private WebElement dubaiElement;
	private WebElement malagaElement;
	private WebElement lisbonElement;
	private WebElement munichElement;
	private WebElement istanbulElement;
	private WebElement frankfurtElement;
	private WebElement alicanteElement;
	private WebElement berlinElement;
	private WebElement veniceElement;
	private WebElement portoElement;
	private WebElement laElement;
	
	
	
	public void returnSameLocationField() {
		
		returnSameLocationButton = driver.findElement(By.xpath("(//div[@class='xpi__searchbox rentalcars']//div[@class='bui-radio'])[1]"));
		
	}
	
	public void returnDifferentLocationField() {
		
		returnDifferentLocationButton = driver.findElement(By.xpath("(//div[@class='xpi__searchbox rentalcars']//div[@class='bui-radio'])[2]"));
		
	}
	
	public void driverAgeLimitField() {
		
		ageLimitOff = driver.findElement(By.xpath("//div[@class='xpi__searchbox rentalcars']//span[@class='bui-checkbox__label']"));
		setAge = driver.findElement(By.xpath("//div[@class='xpi__searchbox rentalcars']//input[@id='driverAgeInput']"));
	}
	
	public void pickupLocationField() {
		
		pickupField = driver.findElement(By.xpath("//div[@class='xp__fieldset rentalcars']//input[@id='ss_origin']"));
		
	}
	
	public void dropoffLocationField() {
		
		dropoffField = driver.findElement(By.xpath("//div[@class='xp__fieldset rentalcars']//input[@id='ss']"));
		
	}
	
	public void firstDateCalendarField() {
		
		firstCalendarField = driver.findElement(By.xpath("(//div[@class='xpi__searchbox rentalcars']//div[@class='xp__dates xp__group']//button[@type='button'])[1]"));
		
	}
	
	public void secondDateCalendarField() {
		
		secondCalendarField = driver.findElement(By.xpath("(//div[@class='xpi__searchbox rentalcars']//div[@class='xp__dates xp__group']//button[@type='button'])[2]"));
		
	}
	
	public void buttonSearch() {
		
		searchButton = driver.findElement(By.xpath("//div[@class='xpi__searchbox rentalcars']//div[@class='xp__button xp-button__no_age']//button[@type='submit']"));
		
	}
	
	public void popularCarHireDestinations() {
		
		algheroElement = driver.findElement(By.xpath("(//div[@class='bui-spacer--largest']//div[@class='bui-spacer--small']//a)[1]"));
		londonElement = driver.findElement(By.xpath("(//div[@class='bui-spacer--largest']//div[@class='bui-spacer--small']//a)[2]"));
		milanElement = driver.findElement(By.xpath("(//div[@class='bui-spacer--largest']//div[@class='bui-spacer--small']//a)[3]"));
		romeElement = driver.findElement(By.xpath("(//div[@class='bui-spacer--largest']//div[@class='bui-spacer--small']//a)[4]"));
		parisElement = driver.findElement(By.xpath("(//div[@class='bui-spacer--largest']//div[@class='bui-spacer--small']//a)[5]"));
		barcelonaElement = driver.findElement(By.xpath("(//div[@class='bui-spacer--largest']//div[@class='bui-spacer--small']//a)[6]"));
		
	} 
	
	public void worldwideCarRentalLocations() {
		
		madridElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[1]"));
		dubaiElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[2]"));
		malagaElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[3]"));
		lisbonElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[4]"));
		munichElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[5]"));
		istanbulElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[6]"));
		frankfurtElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[7]"));
		alicanteElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[8]"));
		berlinElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[9]"));
		veniceElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[10]"));
		portoElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[11]"));
		laElement = driver.findElement(By.xpath("(//div[@class='cars-page']//div[@class='bui-grid']//div[@class='bui-grid__column-3']//a)[12]"));
		
	}
	

}
