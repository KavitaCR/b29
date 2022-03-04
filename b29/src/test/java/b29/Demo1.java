package b29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void testA() {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new firefoxdriver();
		driver.get("http://www.google.com");
		driver.close();
		
		
	}
}
