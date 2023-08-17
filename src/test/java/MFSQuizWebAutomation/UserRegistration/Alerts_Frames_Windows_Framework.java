package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import MFSQuizWebAutomation.PageObjects.AlertsFramesWindows;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_Frames_Windows_Framework {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String	 webUrl= "https://demoqa.com/login";
        // Set the path to ChromeDriver executable
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // Selenium WebDriver Automation - Open web application
        driver.get(webUrl);
        
        AlertsFramesWindows AFW= new AlertsFramesWindows(driver);
        
        AFW.printFrames();
       
       driver.quit();
   }
    
	}
	

        
        
	

	
