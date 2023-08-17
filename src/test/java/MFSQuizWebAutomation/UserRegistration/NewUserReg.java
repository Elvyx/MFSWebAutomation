package MFSQuizWebAutomation.UserRegistration;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import MFSQuizWebAutomation.PageObjects.LandingPage;
import MFSQuizWebAutomation.PageObjects.RegistrationForm;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewUserReg   {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String	 webUrl= "https://demoqa.com/login";
        // Set the path to ChromeDriver executable
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // Selenium WebDriver Automation - Open web application
        driver.get(webUrl);
        
        
        
        
        //Click on NewUser button
        
        WebElement newuserbtn=driver.findElement(By.id("newUser"));
        newuserbtn.click();
        
       
        // Fill out form and create a record using API data
        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Rebecca");

        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("Macron");
        
        
        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("rebmac@yopmail.com");
        
        WebElement loginPassword = driver.findElement(By.id("password"));
        loginPassword.sendKeys("Password123*");
      
        
        
        WebElement captcha= driver.findElement(By.xpath("//div[@id='g-recaptcha']"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", captcha);

        //captcha.click();
        
        
     // Solve CAPTCHA using a CAPTCHA solving service
        //String captchaSolution = solveCaptchaUsingService(captcha.getAttribute("src"));

        // Enter the solved CAPTCHA value into the input field
        //WebElement captchaInput = driver.findElement(By.xpath("//div[@id='g-recaptcha']")); // Replace with actual locator
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       // captchaInput.sendKeys(captchaSolution);
        
        //Submit registration
        WebElement regButton= driver.findElement(By.cssSelector("#register"));
        regButton.click();
        
        WebElement captchamessage=driver.findElement(By.cssSelector("#name"));
        String message=captchamessage.getText();
        System.out.println(message);
     
        
       
        WebElement backToLogin= driver.findElement(By.cssSelector("#gotologin"));
        backToLogin.click();
        
        driver.quit();
        
       
       
       
       
        
        

     // Validation - Retrieve data from the web application and compare with API response
        //Alert alert = driver.switchTo().alert();
       //String message= alert.getText();
       //System.out.println(message);
        //alert.accept();
	}
	

        
        
	}

	
