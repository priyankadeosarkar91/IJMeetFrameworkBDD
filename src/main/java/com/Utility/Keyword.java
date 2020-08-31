package com.Utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {



	/*
	 * @author:Govind Rudrawar
	 * This method will launch the given Browser
	 * 
	 */
	public static void launchBrowser(String browserName) {
		switch (browserName) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			Constants.driver= new InternetExplorerDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
		default:
			System.err.print("The Entered " + browserName + "is incorrect");
			System.out.println("Enter Correct browserName such as Chrome, IE or Firefox");
			break;
		}

		Constants.edriver = new EventFiringWebDriver(Constants.driver);
		Constants.eventlistener=new WebEventListener();
		
		Constants.edriver.register(Constants.eventlistener);
		Constants.driver = Constants.edriver;
	}

	/*
	 * This method will launch the url by the previously opened driver instance
	 * 
	 * @param:Accepts String url as a parameter which needs to be launched url
	 * should be in format https://www.applicationname.com
	 */
	public static void launchUrl(String url) {

		Constants.driver.get(url);
	}

	/*
	 * This method will maximize the window
	 */
	public static void maximizeWindow() {

		Constants.driver.manage().window().maximize();
	}

	/*
	 * This method will delete all the cookies i.e. the password, the id for all
	 * the websites stored in the browser
	 */
	public static void deleteCookies() {

		Constants.driver.manage().deleteAllCookies();
	}

	/*
	 * This method will hover the mouse over the WebElement which is passed
	 * 
	 * @param:Accepts WebElement as a parameter over which we need to hover the
	 * mouse
	 * 
	 */
	public static void hoverMouseOnWebElement(WebElement element) {
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(element).build().perform();

	}

	/*
	 * This method will fetch the WebElement for which we have passed the
	 * locator type and locator value
	 * 
	 * @param:Accpets parameter as String locator Type
	 * 
	 * @param:Accepts parameter as String locator Value
	 * 
	 * @returns:WebElement of our interest
	 */
	public static WebElement getWebElement(String locatorType, String locatorValue) {

		switch (locatorType) {

		case "CSS":
			Constants.element = Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "XPATH":
			Constants.element = Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "ID":
			Constants.element = Constants.driver.findElement(By.id(locatorValue));
			break;
		case "NAME":
			Constants.element = Constants.driver.findElement(By.name(locatorValue));
			break;
		case "CLASSNAME":
			Constants.element = Constants.driver.findElement(By.className(locatorValue));
			break;
		case "PARTIALLINKTEXT":
			Constants.element = Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		default:
			System.err.print("Either " + locatorType + "or its " + locatorValue + "is incorrect");
			System.out.println("Kindly Enter correct " + locatorType + "And" + locatorValue);
			break;

		}
		return Constants.element;

	}

	/*
	 * This is a overloaded method for fetching the WebElement directly from the
	 * POM Classes.We have to use the Object Reference of the respective POM
	 * class to fetch the WebElement
	 * 
	 * @returns:WebElement from the POM Class
	 */
	public static WebElement getWebElement(WebElement element) {

		return element;
	}

	/*
	 * This method will fetch us the List of WebElement for which we have passed
	 * the locator type and locator value
	 * 
	 * @param:Accepts parameter as locator type and locator value
	 * 
	 */
	public static List<WebElement> getWebElements(String locatorType, String locatorValue) {

		switch (locatorType) {

		case "CSS":
			Constants.elements = Constants.driver.findElements(By.cssSelector(locatorValue));
			break;
		case "XPATH":
			Constants.elements = Constants.driver.findElements(By.xpath(locatorValue));
			break;
		case "ID":
			Constants.elements = Constants.driver.findElements(By.id(locatorValue));
			break;
		case "NAME":
			Constants.elements = Constants.driver.findElements(By.name(locatorValue));
			break;
		case "CLASSNAME":
			Constants.elements = Constants.driver.findElements(By.className(locatorValue));
			break;
		case "PARTIALLINKTEXT":
			Constants.elements = Constants.driver.findElements(By.partialLinkText(locatorValue));
			break;
		default:
			System.err.print("Either " + locatorType + "or its " + locatorValue + "is incorrect");
			System.out.println("Kindly Enter correct " + locatorType + "And" + locatorValue);
			break;

		}
		return Constants.elements;

	}

	/*
	 * This method accepts WebElement Name which we have fetched in our POM
	 * Class and returns List of WebElements
	 * 
	 * @Param:Accepts parameter as WebElement directly from our POM Class
	 * 
	 */
	public static List<WebElement> getWebElements(WebElement element) {

		return Constants.elements;
	}

	/*
	 * This method will fetch us the text for the WebElement which is passed as
	 * parameter
	 * 
	 * @param:Accepts WebElement for which the text is to be fetched
	 * 
	 * @return:Returns String for the given WebElement
	 */
	public static String getWebElementText(WebElement element) {

		String s = element.getText();
		return s;
	}

	/*
	 * This method will enter the text in the location which is passed as an
	 * argument
	 * 
	 * @Param:Accepts WebElement as an argument i.e. the Text Box/Text Field in
	 * which we need to pass the text
	 * 
	 * @Param:Accepts text which needs to be passed to the text box/text field
	 */
	public static void enterText(WebElement element, String textToBeEntered) {

		element.sendKeys(textToBeEntered);
	}

	/*
	 * This method selects value from DropDown which is designed using Select
	 * tag
	 * 
	 * @param:Accepts argument as WebElement for the value which we need to
	 * choose
	 * 
	 * @Param:Accepts argument as 1 of three methods of Select Class
	 * 
	 * @Param:Accepts argument as the value which is available in the dropDown
	 */
	public static void selectFromDropDown(WebElement element, String selectMethod, String valuefromDropDrown) {

		Constants.select = new Select(element);
		switch (selectMethod) {
		case "SelectByIndex":
			Constants.select.selectByIndex(Integer.parseInt(valuefromDropDrown));
			break;
		case "SelectByValue":
			Constants.select.selectByValue(valuefromDropDrown);
		case "SelectByVisibleText":
			Constants.select.selectByVisibleText(valuefromDropDrown);
			break;
		default:
			System.err.print("Value selected is not available in the dropdown");
			break;

		}
	}
	
	/*
	 * This Method will verify if menu(nav) items present. actual menu items stored
	 * in {@code List}. {@code ArrayList} used to get element of list in the form of
	 * array to compare with expected menu items.
	 * 
	 * @param subNavItems {@code List} it is list of {@param locatorValue} find by
	 * {@param locatorType} such as by ID,cssSelector,XPATH,NAME,etc
	 * 
	 * @param actualSubNavItems {@code ArrayList}
	 * 
	 * @param itr {@code Iterator}
	 * 
	 * @return {@link ArrayList} actualSubNavItems
	 */
	public static ArrayList<String> verifyMenuItems(String locatorType, String locatorValue) {

		List<WebElement> subNavItems = getWebElements(locatorType, locatorValue);
		ArrayList<String> actualSubNavItems = new ArrayList<String>();
		Iterator<WebElement> itr = subNavItems.iterator();
		while (itr.hasNext()) {
			actualSubNavItems.add(itr.next().getText());
		}
		return actualSubNavItems;
	}

	/*
	 * This method will get text from auto pop-up List while entering key text.
	 * 
	 * @param enterText
	 */
	public static void autoCompleteText(String locatorType, String locatorValue, String enterText) {

		List<WebElement> optionToSelect = getWebElements(locatorType, locatorValue);

		for (WebElement selectOptionFromList : optionToSelect) {
			// Enter the expected text in text box @param enterText
			if (selectOptionFromList.getText().equalsIgnoreCase(enterText)) {
				selectOptionFromList.click();
				break;
			}
		}
	}

	/*
	 * This method captures screenshot for the viewport using Yandex AShot
	 * library and returns the Image
	 * 
	 * @Param:Accepts parameter the file-format in which we need the output
	 * Image
	 * 
	 * @Param:Accepts parameter as the location in which we want to save the
	 * screenshot taken
	 */

	public static void captureScreenshot(String ImageFormatType, FileOutputStream filepath) throws IOException {

		Constants.ashot = new AShot();
		Screenshot sc = Constants.ashot.takeScreenshot(Constants.driver);
		ImageIO.write(sc.getImage(), ImageFormatType, filepath);

		

	}

	/*
	 * This method will capture the screenshot for the entire web-page by
	 * parsing it
	 * 
	 * @Param:Accepts integer value as parameter i.e. the time in milliseconds for
	 * which the web-page will be parsed
	 * 
	 * @Param:Accepts parameter as the type of Image we want i.e. JPG or PNG
	 * 
	 * @Param:Accepts parameter as the location where we need to save the image
	 * output stream
	 */
	public static void captureFullScreenshot(int timeinMiliseconds, String formatName, FileOutputStream filepath)
			throws IOException {

		Constants.ashot = new AShot();
		Screenshot sc = Constants.ashot.shootingStrategy(ShootingStrategies.viewportPasting(timeinMiliseconds))
				.takeScreenshot(Constants.driver);
		ImageIO.write(sc.getImage(), formatName, filepath);

		

	}

	/*
	 * This method will capture the screenshot for the WebElement of our
	 * interest and which needs to be passed as a parameter
	 * 
	 * @Param:Accepts WebElement as a parameter for which we want the screenshot
	 * 
	 * @Param:Accepts Image format as a parameter the type of format which we
	 * want the image to be of
	 * 
	 * @Param:Accepts the parameter as location where we want our FileOutPut
	 * Stream to be stored at
	 */
	public static void captureWebElementScreenshot(WebElement element, String formatName,
			FileOutputStream filepath) throws IOException {

		Constants.ashot = new AShot();
		Screenshot sc = Constants.ashot.takeScreenshot(Constants.driver, element);
		ImageIO.write(sc.getImage(), formatName, filepath);
		
	}

	/*
	 * This method will fetch the exact Y location (vertical location on the
	 * WebPage for the stated WebElement)
	 * 
	 * @Param:Accepts parameter as WebElement as an argument for which we want
	 * the Y Location The value we get has to be verified against the
	 * specification for exact location of this WebElement
	 */
	public static int getYLocation(WebElement element) {

		int y = element.getLocation().getY();

		return y;

	}

	/*
	 * This method will fetch the exact X location (the horizontal location on
	 * the WebPage for the stated WebElement)
	 * 
	 * @Param:Accepts parameter as WebElement for which we want the exact X
	 * location for
	 * 
	 * @returns:The int X location (The horizontal location which we need for
	 * the WebElement of our interest ) The value we get has to be verified
	 * against the specification for exact location of this WebElement
	 */
	public static int getXLocation(WebElement element) {
		int x = element.getLocation().getX();
		return x;
	}

	/*
	 * This method will scroll the window by the length in pixel which is passed
	 * as argument both horizontally and vertically To scroll the WebPage
	 * vertically give i = 0;
	 * 
	 * @Param:Takes argument as int value j i.e. the length in pixel value by
	 * which the WebPage will be scrolled vertically
	 * 
	 * @Param:Takes argument as int value i i.e. the length in pixel value by
	 * which the WebPage will be scrolled horizontally
	 */
	public static void scrolltheWebPage(int i, int j) {
		JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
		js.executeScript("window.scrollBy(i,j)");
	}

	/**
	 * This method will scroll the window till end of web-page.
	 * 
	 * @author Chirde Sampada
	 * @param
	 */
	public static void scrollWebPageBottom() {
		JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	/**
	 * This method will scroll the window till VisibleElement of webpage.
	 * 
	 * @author: Chirde Sampada
	 * @param WebElement
	 */
	public static void scrollByVisibleElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	/*
	 * This method will apply implicit wait to the current instance of the
	 * driver i
	 * 
	 * @Param:This method accepts argument int value as time in seconds for
	 * which the thread will wait
	 */
	
	/*
	 * This method will switch the WebDriver instance to new pop-up window
	 */
	public void switchToPopupWindow() {
		Constants.parentwindowhandle = Constants.driver.getWindowHandle();
		Constants.allindowhandles = Constants.driver.getWindowHandles();
		for (String window : Constants.allindowhandles) {
			if (!Constants.driver.switchTo().window(window).getWindowHandle().equals(Constants.parentwindowhandle)) {
				Constants.log.info("Switched to " + Constants.driver.getTitle() + " window");
				break;
			}
		}
	}

	/*
	 * This method will switch the WebDriver instance to new pop-up window
	 * having specific title
	 * 
	 * @Params : Accept String(window title) as a parameter for which we want to
	 * switch the WebDriver
	 */
	public void switchToPopupWindow(String windowtitle) {
		Constants.parentwindowhandle = Constants.driver.getWindowHandle();
		Constants.allindowhandles = Constants.driver.getWindowHandles();
		for (String window : Constants.allindowhandles) {
			if (Constants.driver.switchTo().window(window).getTitle().contains(windowtitle)) {
				Constants.log.info("Switched to " + Constants.driver.getTitle() + " window");
				break;
			}
		}
	}

	/*
	 * This method will switch the WebDriver instance to parent window
	 */
	public void switchToMainWindow() {
		Constants.driver.switchTo().window(Constants.parentwindowhandle);
		Constants.log.info("Switching to main window");
	}

	public static void implicitWait(int timeinSeconds) {
		Constants.driver.manage().timeouts().implicitlyWait(timeinSeconds, TimeUnit.SECONDS);
	}

	/**
	 * This method will help to apply customize wait on any element
	 * 
	 * @param :
	 *            timeInSeconds
	 * @author chirde sampada
	 */
	public static void explicitWait(int timeInSeconds) {
		Constants.wait = new FluentWait(Constants.driver);
		Constants.wait.withTimeout(timeInSeconds, TimeUnit.SECONDS);
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a
	 * page and visible. Visibility means that the element is not only displayed
	 * but also has a height and width that is greater than 0.
	 *
	 * @param elementname
	 *            used to find the element
	 * @author chirde sampada
	 */
	public static void waitUntilVisibilityOf(WebElement elementname) {
		Constants.wait.until(ExpectedConditions.visibilityOf(elementname));
	}

	/**
	 * This method will help to poll every provided seconds
	 * 
	 * @param timeunitSeconds
	 * @author chirde sampada
	 * 
	 */
	public static void pollingEvery(int timeInSeconds) {
		Constants.wait = new FluentWait(Constants.driver);
		Constants.wait.pollingEvery(timeInSeconds, TimeUnit.SECONDS);
	}
	
	/*
	 * This method will use to apply wait using thread in msec
	 */
	public static void applyWait(int waitInmsec) {
		try {
			Thread.sleep(waitInmsec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*
	 * This method will used get boolean value when alert is present then switch to
	 * alert alert, accept it and returns true otherwise it returns false.
	 */
	public static boolean ifAlert() {
		try {
			Constants.driver.switchTo().alert().accept();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * This method will refresh the page whenever needed.
	 */
	public static void refreshPage() {
		Constants.driver.navigate().refresh();
	}

	/*
	 * This method will close the current window to which the driver instance is
	 * pointing to
	 */
	public static void closeWindow() {
		Constants.driver.close();
	}

	/*
	 * This method will close all the windows which the driver instance has
	 * opened
	 * 
	 * 
	 */
	public static void closeAllWindows() {
		Constants.driver.quit();
	}

}
