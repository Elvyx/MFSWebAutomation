package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import MFSQuizWebAutomation.PageObjects.WebTable_AddRecord;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_AddRecord_Framework {

	
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

        
        WebTable_AddRecord addrecords= new WebTable_AddRecord(driver);
        
        addrecords.AddNewRecord("Murtala", "Rabiu", "mrabiu@yopmail.com", "30", "800000", "Quality Control Unit");
        
       driver.close();
       
	}
	

        
        
	}

	
