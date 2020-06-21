package pack.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasetoverifyLogin {

	// Selenium --API --> Packages > Classes > Methods
	// browsers
	// Chrome

	@Test
	public void verifyGoogle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

	}

}
