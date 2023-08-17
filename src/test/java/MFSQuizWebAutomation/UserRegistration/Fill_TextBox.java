package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fill_TextBox {

	
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

        
        
       WebElement ele= driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[1]"));
       ele.click();
       
       WebElement txtBox= driver.findElement(By.xpath("//li[@id='item-0']")); //span[normalize-space()='Text Box']
       txtBox.click();
       
      
       
       WebElement fullName= driver.findElement(By.cssSelector("#userName"));
       fullName.sendKeys("Elvis Ekatah");
       
       
       WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
       email.sendKeys("mluther@yopmail.com");
       
       
       WebElement crtAddrs= driver.findElement(By.id("currentAddress"));
       crtAddrs.sendKeys("Plot 5 Kilomanjaro Crescent, Ikoyi-Lagos");
       
       
       WebElement pmtAddrs= driver.findElement(By.cssSelector("#permanentAddress"));
       
       pmtAddrs.sendKeys("5 Oduduwa Crescent, Ikeja-GRA");
       
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pmtAddrs);
       
       
       WebElement sbmtbtn= driver.findElement(By.cssSelector("button[id='submit']"));
       
       sbmtbtn.click();
       
       
      WebElement output= driver.findElement(By.id("output"));
      String result=output.getText();
     System.out.println(result);
     
     driver.quit();
       
       
       
       
        
        

     // Validation - Retrieve data from the web application and compare with API response
        //Alert alert = driver.switchTo().alert();
       //String message= alert.getText();
       //System.out.println(message);
        //alert.accept();
	}
	

        
        
	}

	
