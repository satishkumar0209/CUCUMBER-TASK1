
package StepDefination;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stackoverflow 

{
	WebDriver driver;
	
	@Given("^Navigate to stack over flow URL$")
	public void navigate_to_stack_over_flow_URL() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver", "D://satish//geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://stackoverflow.com/users/login");
	}

	@Given("^Provide valid credentials$")
	public void provide_valid_credentials() throws Throwable
	{
		
		 driver.findElement(By.name("email")).sendKeys("gsatishkumar0209@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("stackoverflow@123");
		
	}

	@Given("^Click on sign in button$")
	public void click_on_sign_in_button() throws Throwable 
	{
		driver.findElement(By.id("submit-button")).click();
	  
	}

	@When("^Login page should displayed$")
	public void login_page_should_displayed() throws Throwable 
	{
	
		Thread.sleep(4000);
		Assert.assertEquals("https://stackoverflow.com/", "https://stackoverflow.com/");
	}

	@When("^Hiding the URl$")
	public void hiding_the_URl() throws Throwable
	{
		Thread.sleep(4000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.get(url+"questions/tagged/javascript");
	}

	@When("^Getting the text$")
	public void getting_the_text() throws Throwable 
	{
		String text=driver.findElement(By.xpath(".//*[@class='summarycount al']")).getText();
		System.out.println("Total questions ="+text);
	}

	@When("^Capturing the screen print of first page$")
	public void capturing_the_screen_print_of_first_page() throws Throwable
	{
		String url=driver.getCurrentUrl();
		System.out.println("page1="+url);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D://screen shots//page1.png"));
	   
	   
	}

	@When("^capturing the screen print of Second page$")
	public void capturing_the_screen_print_of_Second_page() throws Throwable
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[@class='page-numbers next']")).click();
		Thread.sleep(3000);
		String url1=driver.getCurrentUrl();
		System.out.println("page2="+url1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D://screen shots//page2.png"));
	   
	  
	}

	@When("^capturing the screen print of Third page$")
	public void capturing_the_screen_print_of_Third_page() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[@class='page-numbers next']")).click();
		Thread.sleep(3000);
		String url1=driver.getCurrentUrl();
		System.out.println("page3="+url1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D://screen shots//page3.png"));
	   
	  
	}

	@When("^capturing the screen print of Fourth page$")
	public void capturing_the_screen_print_of_Fourth_page() throws Throwable
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[@class='page-numbers next']")).click();
		Thread.sleep(3000);
		String url1=driver.getCurrentUrl();
		System.out.println("page4="+url1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D://screen shots//page4.png"));
	   
	   
	}

	@When("^capturing the screen print of Fifth page$")
	public void capturing_the_screen_print_of_Fifth_page() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[@class='page-numbers next']")).click();
		Thread.sleep(3000);
		String url1=driver.getCurrentUrl();
		System.out.println("page5="+url1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D://screen shots//page5.png"));
	   
	  
	}

	@Then("^Logout$")
	public void logout() throws Throwable 
	{
		System.out.println("logout succssfully");
	    
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable 
	{
		driver.quit();
	   
	}
}
