package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_AddRecord {

	
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
       
       Thread.sleep(10);
       WebElement wbtbl= driver.findElement(By.xpath("//li[@id='item-3']"));  //span[normalize-space()='Web Elements']
       wbtbl.click();
       
       
       WebElement addNewrec= driver.findElement(By.id("addNewRecordButton"));
       addNewrec.click();
       
       
       WebElement firstName= driver.findElement(By.cssSelector("#firstName"));
       firstName.sendKeys("Murtala");
       
       
       WebElement lstName= driver.findElement(By.id("lastName"));
       lstName.sendKeys("Rabiu");
       
       
       WebElement email= driver.findElement(By.id("userEmail"));
       
       email.sendKeys("mrabiu@yopmail.com");
       
       
       WebElement age= driver.findElement(By.id("age"));
       
       age.sendKeys("30");
       
       WebElement salary= driver.findElement(By.id("salary"));
       
       salary.sendKeys("800000");
       
       WebElement dept= driver.findElement(By.cssSelector("#department"));
       
       dept.sendKeys("Quality Control Unit");
       
       
       WebElement sbmtbtn= driver.findElement(By.cssSelector("button[id='submit']"));
       
       sbmtbtn.click();
       
       
       WebElement addedRecord = driver.findElement(By.xpath("(//div[@role='rowgroup'])[4]"));
       
       String recInfo=addedRecord.getText();
       
       System.out.println(recInfo);
       
       
       WebElement deleteButton = addedRecord.findElement(By.cssSelector("#delete-record-4"));
       deleteButton.click();

       driver.close();
       
	}
	

        
        
	}

	
