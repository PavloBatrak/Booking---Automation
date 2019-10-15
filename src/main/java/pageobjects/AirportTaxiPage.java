package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.Base;

public class AirportTaxiPage extends Base {
	
	
	public AirportTaxiPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	private WebElement firstTaxiType;
	private WebElement standartTaxi;
	private WebElement executiveTaxi;
	private WebElement secondTaxiType;
	private WebElement peopleCarrier;
	private WebElement executiveCarrier;
	private WebElement largeCarrier;
	private WebElement thirdTaxiType;
	private WebElement onewayButton;
	private WebElement returnButton;
	private WebElement pickupLocationOptionReturn;
	private WebElement dropLocationOptionReturn;
	private WebElement pickupDateOptionReturn;
	private WebElement pickupTimeOptionReturn;
	private WebElement passengerFieldOptionReturn;
	private WebElement searchButton;
	private WebElement passengerField;
	private WebElement pickupTime;
	private WebElement pickupDate;
	private WebElement dropLocation;
	private WebElement pickupLocation;
	
	
	public void firstTaxiTypeLooking() {
		
		firstTaxiType = driver.findElement(By.xpath("//div[@id='bodyconstraint']//label[@for='sortbutton_0']"));
		
		standartTaxi = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(1) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
		executiveTaxi = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(2) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
	}
	
	public void secondTaxiTypeLooking() {
		
		secondTaxiType = driver.findElement(By.xpath("//div[@id='bodyconstraint']//label[@for='sortbutton_1']"));
		
		peopleCarrier = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(3) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
		executiveCarrier = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(4) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
		largeCarrier = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(5) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
	}
	
	public void thirdTaxiTypeLooking() {
		
		thirdTaxiType = driver.findElement(By.xpath("//div[@id='bodyconstraint']//label[@for='sortbutton_2']"));
		
		peopleCarrier = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(3) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
		executiveCarrier = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(4) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
		largeCarrier = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(5) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
		standartTaxi = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(1) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
		executiveTaxi = driver.findElement(By.cssSelector("#bodyconstraint > div > section:nth-child(3) > div > div > div.landing-page__small-cars > div > div:nth-child(2) > div > div > div.bui-group.bui-group--inline.bui-card__actions.www-taxi-types__book-cta > button"));
	}
	
	public void returnField() {
		
		returnButton = driver.findElement(By.xpath("//div[@class='rw-return-radio__options gb-u-display-flex']//span[@data-translation='web.summary.return']"));
		
	}
	
	public void pickupSecondField() {
		
		pickupLocationOptionReturn = driver.findElement(By.xpath("//div[@class='gb-u-p- gb-u-pb0@l gb-u-radius gb-u-bg-secondary gb-c-search-form__panel']//div[@data-test='rw-poi-finder-returnPickupLocation']"));
		
	}
	
	public void dropoffSecondField() {
		
		dropLocationOptionReturn = driver.findElement(By.xpath("//div[@class='gb-u-p- gb-u-pb0@l gb-u-radius gb-u-bg-secondary gb-c-search-form__panel']//div[@data-test='rw-poi-finder-returnDropoffLocation']"));
		
	}
	
	public void pickupDateSecondField() {
		
		pickupDateOptionReturn = driver.findElement(By.xpath("//div[@class='gb-u-p- gb-u-pb0@l gb-u-radius gb-u-bg-secondary gb-c-search-form__panel']//div[@class='ui-layout ui-layout--gutter-']//button[@data-test='return-date']"));
		
	}
	
	public void pickupSecondFieldTime() {
		
		pickupTimeOptionReturn = driver.findElement(By.xpath("//div[@class='gb-u-p- gb-u-pb0@l gb-u-radius gb-u-bg-secondary gb-c-search-form__panel']//div[@class='ui-layout ui-layout--gutter-']//button[@data-test=\"return-time\"]"));
		
	}
	
	public void passengersSecondField() {
		
		passengerFieldOptionReturn = driver.findElement(By.xpath("//div[@class='gb-u-p- gb-u-pb0@l gb-u-radius gb-u-bg-secondary gb-c-search-form__panel']//div[@class='ui-layout ui-layout--gutter-']//div[@class='ui-layout__item ui-1/2']//select[@id='returnPassengers']"));
		
	}
	
	
	public void onewayField() {
		
		onewayButton = driver.findElement(By.xpath("//div[@class='rw-return-radio__options gb-u-display-flex']//span[@data-translation='web.summary.oneway']"));
		
	}
	
	public void pickupFirstField() {
		
		pickupLocation = driver.findElement(By.xpath("//div[@class='ui-layout ui-layout--gutter-']//input[@id='pickupLocation']"));
		
	}
	
	 
	
	public void dropoffFirstField() {
		
		dropLocation = driver.findElement(By.xpath("//div[@class='ui-layout ui-layout--gutter-']//input[@id='dropoffLocation']"));
		
	}
	
	
	
	public void pickupDateFirstField() {
		
		pickupDate = driver.findElement(By.xpath("//div[@class='ui-layout ui-layout--gutter-']//button[@aria-label='pickup date input field']"));
				
	}
	
	
	public void pickupFirstFieldTime() {
		
		pickupTime = driver.findElement(By.xpath("//div[@class='ui-layout ui-layout--gutter-']//button[@aria-label='pickup time input field']"));
		
	}
	
	
	public void passengersFirstField() {
		
		passengerField = driver.findElement(By.xpath("//div[@class='ui-layout ui-layout--gutter-']//select[@id='passengers']"));
		
	}
	
	public void buttonSearch() {
		
		searchButton = driver.findElement(By.xpath("//div[@class='ui-layout ui-layout--gutter-']//button[@name='searchButton']"));
		
	}
	

}
