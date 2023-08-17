package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_Frames_Windows {

	
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

        
        
       WebElement afw= driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[3]"));
       afw.click();
       
       
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", afw);
      
       
       WebElement nstFrms= driver.findElement(By.xpath("(//li[@id='item-3'])[2]"));  
       nstFrms.click();
       
       
    // Switch to the top frame
       driver.switchTo().frame("frame1");

       

       // Print the content of the child iframe
       WebElement childIframe = driver.findElement(By.tagName("iframe"));
       String childContent = childIframe.getAttribute("innerHTML");
       System.out.println("Child Iframe :\n" + childContent);

       // Switch back to the default content (main page)
       driver.switchTo().defaultContent();

       // Switch back to the parent frame
       driver.switchTo().frame("frame1");

       // Print the content of the parent frame
       WebElement parentFrame = driver.findElement(By.tagName("iframe"));
       String parentContent = parentFrame.getAttribute("innerHTML");
       System.out.println("Parent Frame :\n" + parentContent);

       // Close the browser
       driver.quit();
   }
    
	}
	

        
        
	

	
