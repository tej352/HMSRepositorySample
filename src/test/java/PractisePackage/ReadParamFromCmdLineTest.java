package PractisePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadParamFromCmdLineTest {
	@Test
	public void parameters() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");	
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get(URL);
		}
		System.out.println("BROWSER");
		System.out.println("URL");
	}

}
