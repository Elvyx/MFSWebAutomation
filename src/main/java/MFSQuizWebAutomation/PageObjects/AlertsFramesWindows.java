package MFSQuizWebAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsFramesWindows {
	
	
WebDriver driver;
	
	public AlertsFramesWindows(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement afw= driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[3]"));
	
	@FindBy(xpath="(//div[contains(@class,'element-group')])[3]")
	WebElement afw;
   
    
    
    
   
    
   // WebElement nstFrms= driver.findElement(By.xpath("(//li[@id='item-3'])[2]"));  
    @FindBy(xpath="(//li[@id='item-3'])[2]")
    WebElement nstFrms;
    
    
 
    
   
   
		public void printFrames()
		
		{
			
			afw.click();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", afw);
			nstFrms.click();
			driver.switchTo().frame("frame1");
			 WebElement childIframe = driver.findElement(By.tagName("iframe"));
			    String childContent = childIframe.getAttribute("innerHTML");
			    System.out.println("Child Iframe :\n" + childContent);
			    driver.switchTo().defaultContent();
			    driver.switchTo().frame("frame1");
			    WebElement parentFrame = driver.findElement(By.tagName("iframe"));
			    String parentContent = parentFrame.getAttribute("innerHTML");
			    System.out.println("Parent Frame :\n" + parentContent);
			 
		}
		}
		
	
