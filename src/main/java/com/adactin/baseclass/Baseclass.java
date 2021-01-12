package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"F:\\Java\\eclipse\\workspace\\Selenium\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"F:\\Java\\eclipse\\workspace\\Selenium\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid BrowserName");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return driver;
	}

	// ==Get==
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==ExplicitWait==
	public static void explicitWait(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==ImplicitWait==
	public static void ImplicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==SendKeys==
	public static void inputToElement(WebElement element, String value) {
		explicitWait(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==Click==
	public static void inputToClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==Close==
	public static void driverClose() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==Quit==
	public static void driverQuit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==NavigateTo==
	public static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==NavigateBack==
	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==NavigateForword==
	public static void navigateForword() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==NavigateRefresh==
	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==GetTitle==
	public static void getTitle() {
		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==GetCurrentUrl==
	public static void getCurrentUrl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==GetAttribute==
	public static void getAttribute(WebElement element) {
		try {
			element.getAttribute(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==GetText==
	public static void getText(WebElement element) {
		try {
			element.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==SelectDropDown==
	public static void selectDropDown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
	}

	// ==Actions==
	public static void moveToElement(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==SimpleAlert==
	public static void simpleAlert() {
		try {
			Alert salert = driver.switchTo().alert();
			salert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==PromptAlert==
	public static void promptAlert() {
		try {
			Alert palert = driver.switchTo().alert();
			palert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==ConfirmAlert==
	public static void confirAlert(String string) {
		try {
			Alert calert = driver.switchTo().alert();
			calert.sendKeys(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==RobotClass==
	public static void robotClass() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	// ==IsEnabled==
	public static void isEnabledTest(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==IsDisplayed==
	public static void isDisplayedTest(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==IsSelected==
	public static void isSelectedTest(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==MultipleDropDown==
	public static void getOptions(WebElement element) {
		try {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement op : options) {
				System.out.println(op.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==GetAllSelectedOptions==
	public static void getAllSelectedOptions(WebElement element) {
		try {
			Select s = new Select(element);
			List<WebElement> option1 = s.getAllSelectedOptions();
			for (WebElement op1 : option1) {
				System.out.println(op1.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==GetFirstSelectedOptions==
	public static void getFirstSelectedOption(WebElement element) {
		try {
			Select s = new Select(element);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==Frames==
	public static void framesString(String value) {
		try {
			driver.switchTo().frame(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==DefaultContent
	public static void defaultContent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==ParentFrame==
	public static void parentFrame() {
		try {
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ==ScreenShot==
	public static void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc = new File("");
		FileUtils.copyFile(src, dsc);
	}

	// ==ScrollUpDown==
	public static void scrollUpDown() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", "elements");
			js.executeScript("window.scrollBy(0, -1000);", "");
			js.executeScript("window.scrollBy(0, 1000);", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
