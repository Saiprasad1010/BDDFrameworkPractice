package StepDef;

import java.time.Duration;

import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdeflogin {
	WebDriver driver;
	

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	    
	}
	@When("User open URL {string}")
	public void user_open_url(String URL) {
		driver.get(URL);
		
	}
	    
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) throws InterruptedException {
		Thread.sleep(2000);
		WebElement Emailid=driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
		Emailid.clear();
		Emailid.sendKeys(email);
		Password.clear();
		Password.sendKeys(password);
		}
		
	@When("Click on Remember Me check box")
	public void click_on_remember_me_check_box() throws InterruptedException {
		Thread.sleep(2000);
		WebElement CheckBox=driver.findElement(By.xpath("//input[@id='RememberMe']"));
		CheckBox.click();

		   
		}
	    
	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement LogInBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
		LogInBtn.click();

	    
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String string) throws InterruptedException {
		Thread.sleep(2000);
		driver.getTitle();  
	}
	
	@Then("LogOut")
	public void log_out() throws InterruptedException {
		Thread.sleep(2000);
		WebElement LogOutBt=driver.findElement(By.xpath("//a[text()='Logout']"));
		LogOutBt.click();
	    
	}

}
