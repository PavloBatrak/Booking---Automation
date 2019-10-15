package pageobjects;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.Base;

public class AccommodationsPage extends Base {

	public AccommodationsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	private WebElement bookingLogo;
	private WebElement languageElement;
	private WebElement languageArea;
	private WebElement concreteLanguage;
	private WebElement trueLanguage;
	private WebElement flightsElement;
	private WebElement flightsPageElement;
	private WebElement currencyElement;
	private WebElement currencyArea;
	private WebElement concreteCurrency;
	private WebElement searchButton;
	private WebElement errorMessage;
	private WebElement searchField;
	private WebElement cities;
	private WebElement places;

	public boolean isBooking() {
		bookingLogo = driver
				.findElement(By.xpath("//div[@class='header-wrapper']/img[@alt[contains(., 'Booking.com')]]"));
		return bookingLogo.isDisplayed();
	}

	public void changeLanguage(String newLanguage) {
		languageElement = driver.findElement(By.xpath("//a[@class='popover_trigger']"));
		languageElement.click();
		languageArea = driver.findElement(
				By.xpath("//div[@aria-describedby='language-popup-description'][@style[contains(., 'block')]]"));
		wait.until(ExpectedConditions.visibilityOf(languageArea));
		concreteLanguage = driver
				.findElement(By.xpath("(//span[@class='seldescription'][contains(., '" + newLanguage + "')])[last()]"));
		concreteLanguage.click();
		trueLanguage = driver.findElement(By.xpath(
				"//div[@class='sign_in_wrapper sign_in_wrapper-add-property']/span[contains(., 'List Your Property')]"));
		wait.until(ExpectedConditions.visibilityOf(trueLanguage));
	}

	public void changeCurrency(String newCurrency) {
		currencyElement = driver
				.findElement(By.xpath("//div[@id='user_form']//a[@class='popover_trigger long_currency_text']"));
		currencyElement.click();
		currencyArea = driver.findElement(By.xpath("//div[@class='popover_content']//div[@class='select_foldout']"));
		wait.until(ExpectedConditions.visibilityOf(currencyArea));
		concreteCurrency = driver
				.findElement(By.xpath("//div[@id='currency_dropdown_all']//a[@data-currency='" + newCurrency + "']"));
		wait.until(ExpectedConditions.visibilityOf(concreteCurrency));
		concreteCurrency.click();
		wait.until(ExpectedConditions.invisibilityOf(currencyArea));
	}

	public void goToFlights() {
		flightsElement = driver.findElement(By.xpath("//span[@class='xpb__link__icon']//../span[text()='Flights']"));
		flightsElement.click();
		flightsPageElement = driver.findElement(By.xpath(
				"//div[@class='keel-container layer-header headerContainer cross-product-bar-content']/a[@class='selected']/span[text()='Flights']"));
		wait.until(ExpectedConditions.visibilityOf(flightsPageElement));
	}

	public void clickSearch() {
		searchButton = driver.findElement(By.xpath("(//button[@type='submit']/span)[1]"));
		searchButton.click();
	}

	public void checkErrorMessageByEmptySearch() {
		clickSearch();
		errorMessage = driver
				.findElement(By.xpath("//div[@id='destination__error']/div[@class='fe_banner__message ']"));
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		assertEquals(errorMessage.getText(), "Error:\n" + "Enter a destination to start searching.");
	}

	public void goToCities() {
		// todo
		// wait for static list
	}

	// method1
//	public void checkListFromConcreteCity(String city, List<String> list) {
//		searchField = driver.findElement(By.xpath("//input[@id='ss']"));
//		wait.until(ExpectedConditions.visibilityOf(searchField));
//		searchField.clear();
//		searchField.sendKeys(city);
//		List<WebElement> citiesElements = driver.findElements(By.xpath(
//				"//div[@data-view='accommodation']//ul[@aria-label='List of suggested destinations ']/li//span[2]/span"));
//		ArrayList<String> cities = (ArrayList<String>) citiesElements.stream().map(s -> s.getText())
//				.collect(Collectors.toList());
//		Collections.sort(cities);
//		Collections.sort(list);
//		assertEquals(cities, list);
//	}

	// method2
//	public void checkListFromConcreteCity(String city, List<String> list) {
//		searchField = driver.findElement(By.xpath("//input[@id='ss']"));
//		wait.until(ExpectedConditions.visibilityOf(searchField));
//	
//		List<WebElement> citiesElements = driver.findElements(By.xpath(
//				"//li[@class='ia_section active']//a"));
//	
//		String r1 = citiesElements.get(0).getText();
//		String r2 = citiesElements.get(1).getText();
//		String r3 = citiesElements.get(2).getText();
//		String r4 = citiesElements.get(3).getText();
//		String r5 = citiesElements.get(4).getText();
//		String r6 = citiesElements.get(5).getText();
//		String r7 = citiesElements.get(6).getText();
//		String r8 = citiesElements.get(7).getText();
//		String r9 = citiesElements.get(8).getText();
//		String r10 = citiesElements.get(9).getText();
//		String r11 = citiesElements.get(10).getText();
//		String r12 = citiesElements.get(11).getText();
//		String r13 = citiesElements.get(12).getText();
//		String r14 = citiesElements.get(13).getText();
//		String r15 = citiesElements.get(14).getText();
//		String r16 = citiesElements.get(15).getText();
//		String r17 = citiesElements.get(16).getText();
//		String r18 = citiesElements.get(17).getText();
//		String r19 = citiesElements.get(18).getText();
//		String r20 = citiesElements.get(19).getText();
//		
//		List<String> results = new ArrayList<String>();
//		results.add(r1);
//		results.add(r3);
//		results.add(r5);
//		results.add(r4);
//		results.add(r2);
//		results.add(r6);
//		results.add(r7);
//		results.add(r8);
//		results.add(r9);
//		results.add(r10);
//		results.add(r11);
//		results.add(r12);
//		results.add(r13);
//		results.add(r14);
//		results.add(r15);
//		results.add(r16);
//		results.add(r17);
//		results.add(r18);
//		results.add(r19);
//		results.add(r20);
//		Collections.sort(list);
//		Collections.sort(results);
//		System.out.println(list.hashCode());
//		System.out.println(results.hashCode());
//		assertEquals(results, list);
//	}

	// method3
//	public void checkListFromConcreteCity(String city, List<String> list) {
//	searchField = driver.findElement(By.xpath("//input[@id='ss']"));
//	wait.until(ExpectedConditions.visibilityOf(searchField));
//
//	List<WebElement> citiesElements = driver.findElements(By.xpath(
//			"//li[@class='ia_section active']//a"));
//	
//	List<String> results = new ArrayList<String>();
//	results.add(citiesElements.get(0).getText());
//	results.add(citiesElements.get(1).getText());
//	results.add(citiesElements.get(2).getText());
//	results.add(citiesElements.get(3).getText());
//	results.add(citiesElements.get(4).getText());
//	results.add(citiesElements.get(5).getText());
//	results.add(citiesElements.get(6).getText());
//	results.add(citiesElements.get(7).getText());
//	results.add(citiesElements.get(8).getText());
//	results.add(citiesElements.get(9).getText());
//	results.add(citiesElements.get(10).getText());
//	results.add(citiesElements.get(11).getText());
//	results.add(citiesElements.get(12).getText());
//	results.add(citiesElements.get(13).getText());
//	results.add(citiesElements.get(14).getText());
//	results.add(citiesElements.get(15).getText());
//	results.add(citiesElements.get(16).getText());
//	results.add(citiesElements.get(17).getText());
//	results.add(citiesElements.get(18).getText());
//	results.add(citiesElements.get(19).getText());
//	Collections.sort(list);
//	Collections.sort(results);
//	System.out.println(list.hashCode());
//	System.out.println(results.hashCode());
//	assertEquals(results, list);
//}
	// method 4
	public void checkRegionsDestionationsWeLove(List<String> list) {
		List<String> results = new ArrayList<String>();
		searchField = driver.findElement(By.xpath("//input[@id='ss']"));
		wait.until(ExpectedConditions.visibilityOf(searchField));

		List<WebElement> citiesElements = driver.findElements(By.xpath("//li[@class='ia_section active']//a"));

		for (int i = 0; i < citiesElements.size(); i++) {
			results.add(citiesElements.get(i).getText());
		}

		Collections.sort(list);
		Collections.sort(results);

		assertEquals(results, list);
	}

	public void checkCitiesDestionationsWeLove(List<String> list) {
		List<String> results1 = new ArrayList<String>();

		// cities = driver.findElement(By.xpath("//div[@class='slinks
		// ']//class=\"ia_section-container clearfixul[@class='ia_tab']//li[2]"));
		cities = driver.findElement(By.xpath(
				"//div[@class='slinks ']//ul[@class='ia_tab']//li[@class='ia_tab_btn '][contains(text(),'Cities')]"));

		// wait.until(ExpectedConditions.elementToBeClickable(cities));
		// wait.until(ExpectedConditions.visibilityOf(cities));
		// wait.until(ExpectedConditions.elementToBeClickable(By.id("//div[@class='slinks
		// ']//ul[@class='ia_tab']//li[@class='ia_tab_btn
		// '][contains(text(),'Cities')]")));
		// cities.click();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", cities);

		List<WebElement> townsElements = driver
				.findElements(By.xpath("//div[@class='slinks ']//ul[@class='ia_body clearfix']//li[@class='ia_section  active']//li"));
		//ul[@class='ia_section-container clearfix']//li
		for (int i = 0; i < townsElements.size(); i++) {
			results1.add(townsElements.get(i).getText());
		}

		Collections.sort(list);
		Collections.sort(results1);

		assertEquals(results1, list);
	}

	public void checkPlacesOfInterestDestionationsWeLove(List<String> list) {
		List<String> results2 = new ArrayList<String>();

		// places = driver.findElement(By.xpath("(//ul[@class='ia_tab']//li)[3]"));
		places = driver.findElement(By.xpath(
				"//div[@class='slinks ']//ul[@class='ia_tab']//li[@class='ia_tab_btn '][contains(text(),'Places of interest')]"));
		// wait.until(ExpectedConditions.visibilityOf(places));
		// wait.until(ExpectedConditions.elementToBeClickable(places));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", places);
		
		List<WebElement> placesElements = driver.findElements(By
				.xpath("//div[@class='slinks ']//ul[@class='ia_body clearfix']//li[@class='ia_section  active']//li"));
		
		for (int i = 0; i < placesElements.size(); i++) {
			results2.add(placesElements.get(i).getText());
		}

		Collections.sort(list);
		Collections.sort(results2);

		assertEquals(results2, list);
	}

}
