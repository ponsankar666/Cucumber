import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerDetails {
	static WebDriver driver;
	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User is filling all the fields")
	public void user_is_filling_all_the_fields() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Ponsankar");
		driver.findElement(By.id("lname")).sendKeys("S");
		driver.findElement(By.id("email")).sendKeys("ponsankar@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Chennai");
		driver.findElement(By.name("telephoneno")).sendKeys("1232143");

	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("The user should be displayed the customer id")
	public void the_user_should_be_displayed_the_customer_id() throws InterruptedException {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		Thread.sleep(3000);
		driver.close();
	}


}
