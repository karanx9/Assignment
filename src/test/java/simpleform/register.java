package simpleform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class register {
	WebDriver driver;
	
	
	
	@Given("Open the browser and click on url")
	public void open_the_browser_and_click_on_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("complete the form")
	public void complete_the_form() {
	   driver.findElement(By.cssSelector("input[id=\"firstName\"]")).sendKeys("karan");
	
	   driver.findElement(By.cssSelector("input[id=\"lastName\"]")).sendKeys("Soni");
	   driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("bussiness@gmail.com");
	   driver.findElement(By.cssSelector("input[id=\"number\"]")).sendKeys("9403343224");
	   driver.findElement(By.cssSelector("textarea[rows=\"2\"]")).sendKeys("Testing purpose");
	  
		
	}

	@Then("Iclick on the submit button")
	public void iclick_on_the_submit_button() {
	  
		driver.findElement(By.xpath("//input[@class=\"ui green button\"]")).click();
		
	}


}
