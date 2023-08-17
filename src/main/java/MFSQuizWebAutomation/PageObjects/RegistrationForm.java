package MFSQuizWebAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegistrationForm {
	
	
WebDriver driver;
	
	public RegistrationForm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
    //  WebElement firstName = driver.findElement(By.id("firstname"));
		@FindBy(id="firstname")
		WebElement firstName;
		
	    //WebElement lastName = driver.findElement(By.id("lastname"));
		@FindBy(id="lastname")
		WebElement lastName;
		
	    //WebElement userName = driver.findElement(By.id("userName"));
		@FindBy(id="userName")
		WebElement userName;
		
		   // WebElement loginPassword = driver.findElement(By.id("password"));
		@FindBy(id="password")
		WebElement Password;
		
	    //WebElement captchaInput = driver.findElement(By.xpath("//div[@id='g-recaptcha']")); // Replace with actual locator
		@FindBy(xpath="//div[@id='g-recaptcha']")
		WebElement Captcha;
		
		//WebElement regButton= driver.findElement(By.cssSelector("#register"))
		@FindBy(css="#register")
		WebElement submitReg;
		
		//driver.findElement(By.cssSelector("#name"))
		@FindBy(css="#name")
		WebElement Captchamsg;
		
		@FindBy(css="#gotologin")
		WebElement gotobtn;
		
		
		
		
		
		
		
		
		
		public void userReg(String firstname, String lastname, String username, String password)
		{
			firstName.sendKeys(firstname);
			lastName.sendKeys(lastname);
			userName.sendKeys(username);
			Password.sendKeys(password);
			JavascriptExecutor js=  (JavascriptExecutor) driver;	
			js.executeScript("window.scrollBy(0, 500)");
			submitReg.click();
			String message=Captchamsg.getText();
			System.out.println(message);
			gotobtn.click();
			
			
		}

	}
