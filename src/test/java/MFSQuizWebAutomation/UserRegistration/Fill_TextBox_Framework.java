package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import MFSQuizWebAutomation.PageObjects.TextBox;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fill_TextBox_Framework {

	
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

         TextBox textBox=new TextBox(driver);
         textBox.fillTextBox("Elvis Ekatah", "mluther@yopmail.com", "Plot 5 Kilomanjaro Crescent, Ikoyi-Lagos", "5 Oduduwa Crescent, Ikeja-GRA");
        
         driver.quit();
       
       
       
       
        
        

     // Validation - Retrieve data from the web application and compare with API response
        //Alert alert = driver.switchTo().alert();
       //String message= alert.getText();
       //System.out.println(message);
        //alert.accept();
	}
	

        
        
	}

	
