package MFSQuizWebAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upload_Download {
	
	
WebDriver driver;
	
	public Upload_Download(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 
    //driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[1]"));
    @FindBy(xpath="(//div[contains(@class,'element-group')])[1]")
    WebElement ele;
    
    //WebElement upldwn= driver.findElement(By.xpath("//li[@id='item-7']"));  //span[normalize-space()='Web Elements']
    @FindBy(xpath="//li[@id='item-7']")
    WebElement upldwn;
   
   
   // WebElement fileInput= driver.findElement(By.cssSelector("#uploadFile"));
    @FindBy(css="#uploadFile")
    WebElement fileInput;
    
   
    
    //WebElement dwnldbtn= driver.findElement(By.cssSelector("#downloadButton"));
    @FindBy(css="#downloadButton")
    WebElement dwnldbtn;
   
    
		public void upload_download()
		{
			
			ele.click();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			upldwn.click();
			String filePath = "C:\\Users\\USER\\OneDrive\\Documents\\SOFTWARE TESTING TRAINING MANUAL updated.pptx"; 
		    fileInput.sendKeys(filePath);
		    dwnldbtn.click();
			
			
		}

	}
