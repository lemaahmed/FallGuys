package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageObjects;

public class FallGuysGoogleSearch extends GoogleBase {
 
	HomePageObjects hpo;

	@Given("I am on the Google Homepage")
	public void i_am_on_the_google_homepage() {

		launchbrowser();
	}

	@When("I enter search {string}")
	public void i_enter_search(String term) {
		//WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys(term); 
		hpo = new HomePageObjects (lema);
		hpo.enterTerm(term);

	}

	@When("I click on the Google search button")
	public void i_click_on_the_google_search_button() {

		WebElement searchBtn = lema.findElement(By.name("btnK"));
		searchBtn.click();

	}

	@Then("I receive related test result")
	public void i_receive_related_test_result() {

		String title = lema.getTitle();
		System.out.println(title);
		closebrowser();

	}
}
