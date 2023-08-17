package MFSQuizWebAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox {
	
	
WebDriver driver;
	
	public TextBox(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement ele= driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[1]"));
	
	@FindBy(xpath="(//div[contains(@class,'element-group')])[1]")
	WebElement ele;
    
   //driver.findElement(By.xpath("//li[@id='item-0']")); //span[normalize-space()='Text Box']
	@FindBy(xpath="//li[@id='item-0']")
   WebElement txtBox;
    
   
    
    // driver.findElement(By.cssSelector("#userName"));
    @FindBy(css="#userName")
    WebElement fullName;
    
    
    //driver.findElement(By.xpath("//input[@type='email']"));
    
    @FindBy(xpath="//input[@type='email']")
    WebElement email;
    
    
    //driver.findElement(By.id("currentAddress"));
    @FindBy(id="currentAddress")
    WebElement crtAddrs;
    
    
    //driver.findElement(By.cssSelector("#permanentAddress"));
    @FindBy(css="#permanentAddress")
    WebElement pmtAddrs;
    
   
    
    //@((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pmtAddrs);
    
    
   //driver.findElement(By.cssSelector("button[id='submit']"));
    
    @FindBy(css="button[id='submit']")
    WebElement sbmtbtn;
    //WebElement output= driver.findElement(By.id("output") );
    @FindBy(id="output")
    WebElement output;
    
	
	
	
    
	  
		
		
		
		
		
		
		
		
		
		public void fillTextBox(String username, String Email, String CurentAddress, String PermanentAddress)
		{
			
			ele.click();
			txtBox.click();
			
			
			fullName.sendKeys(username);
			email.sendKeys(Email);
			crtAddrs.sendKeys(CurentAddress);
			pmtAddrs.sendKeys(PermanentAddress);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pmtAddrs);
			sbmtbtn.click();
			String result=output.getText();
			System.out.println(result);
			
			
			
		}

	}
