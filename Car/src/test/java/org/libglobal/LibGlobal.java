package org.libglobal;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;

	public static void launchbrowser(String browsername) {
		switch (browsername) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	public static void maximizewindow() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	public void selectOptionByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void selectOptionByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void selectOptionByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public List<WebElement> getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public String getAttributeValue(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public void clickElement(WebElement e) {
		e.click();

	}

	public void quitbrowser() {
		driver.quit();

	}

	public void enterValue(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static String getProjectDirectory() {
		String path = System.getProperty("user.dir");
		return path;

	}

}
