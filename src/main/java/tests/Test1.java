package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.Base;
import framework.IConstants;
import pageobjects.FlightsPage;
import pageobjects.AccommodationsPage;

public class Test1 extends Base implements IConstants{
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@BeforeClass
	private void setUp() {
		driver = initializeDriver();
		wait = getWait();
		driver.get("https://www.booking.com");
	}
	
	
	@Test
	private void mainTest() {
		AccommodationsPage hp = new AccommodationsPage(driver, wait);
		assertTrue(hp.isBooking());
		hp.changeLanguage("English (US)");
		//hp.changeCurrency("USD");  
		//hp.checkErrorMessageByEmptySearch();
		//hp.checkRegionsDestionationsWeLove(REGIONS);
		//hp.checkCitiesDestionationsWeLove(CITIES);
		hp.checkPlacesOfInterestDestionationsWeLove(PLACESOFINTEREST);
		
		
		FlightsPage fp = new FlightsPage(driver, wait);
		
		
	}
	
	@AfterTest
	private void end() {
		driver.close();
	}
	
}
