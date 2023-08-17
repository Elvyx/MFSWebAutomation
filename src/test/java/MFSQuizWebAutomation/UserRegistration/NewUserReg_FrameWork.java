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

public class NewUserReg_FrameWork   {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String webUrl= "https://demoqa.com/login";
        // Set the path to ChromeDriver executable
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
       WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();

        // Selenium WebDriver Automation - Open web application
        driver.get(webUrl);
        
        
        
        
        //Click on NewUser button
        
        LandingPage landingPage= new LandingPage(driver);
        
        landingPage.loginPage();
        RegistrationForm regForm= new RegistrationForm(driver);
        regForm.userReg("Rebecca", "Macron", "rebmac@yopmail.com", "Password123*");
       
        driver.quit();
        
      
	}
	

        
        
	}

	
