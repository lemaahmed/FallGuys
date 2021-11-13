package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	
	WebDriver driver;
	 
	 public HomePageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	WebElement searchBox = driver.findElement(By.name("q"));
//	searchBox.sendKeys(term);
	@FindBy(css = "input[name='q']")
	private WebElement searchbox;

	public void enterTerm(String term) {
		searchbox.sendKeys(term);

	}

//	WebElement searchBtn = driver.findElement(By.name("btnK"));
//	searchBtn.click();

	@FindBy(xpath= "//input tag[@name=\"q\"]")
   WebElement searchBtn;

	public void clickSearch() {
		searchBtn.click();
	}

}
