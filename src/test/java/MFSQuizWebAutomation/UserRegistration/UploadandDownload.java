package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadandDownload {

	
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

        
        
       WebElement ele= driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[1]"));
       ele.click();
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
       
       
       
       WebElement upldwn= driver.findElement(By.xpath("//li[@id='item-7']"));  //span[normalize-space()='Web Elements']
       upldwn.click();
       
       WebElement fileInput= driver.findElement(By.cssSelector("#uploadFile"));
    
       
       String filePath = "C:\\Users\\USER\\OneDrive\\Documents\\SOFTWARE TESTING TRAINING MANUAL updated.pptx"; 
       fileInput.sendKeys(filePath);
       
       WebElement dwnldbtn= driver.findElement(By.cssSelector("#downloadButton"));
       dwnldbtn.click();
       driver.close();
       
	}
	

        
        
	}

	
