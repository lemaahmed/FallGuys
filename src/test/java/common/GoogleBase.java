package common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {
	
	public WebDriver lema;

	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		lema = new ChromeDriver();
		lema.get("https://www.google.com/");
		lema.manage().window().maximize();
		lema.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void closebrowser() {
		lema.close();
	}

	public void browsecloseallr() {
		lema.quit();
	}
}
