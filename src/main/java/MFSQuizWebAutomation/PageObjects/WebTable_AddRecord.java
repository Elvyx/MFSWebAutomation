package MFSQuizWebAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTable_AddRecord {
	
	
WebDriver driver;
	
	public WebTable_AddRecord(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[1]"));
	
	@FindBy(xpath="(//div[contains(@class,'element-group')])[1]")
	WebElement ele;
    
   // Thread.sleep(10);
    //WebElement wbtbl= driver.findElement(By.xpath("//li[@id='item-3']"));  //span[normalize-space()='Web Elements']
    @FindBy(xpath="//li[@id='item-3']")
    WebElement wbtbl;
    
    
   //driver.findElement(By.id("addNewRecordButton"));
    @FindBy(id="addNewRecordButton")
    WebElement addNewrec;
    
    
    
    //WebElement firstName= driver.findElement(By.cssSelector("#firstName"));
    @FindBy(css="#firstName")
    WebElement firstName;
    
    
    //driver.findElement(By.id("lastName"));
    @FindBy(id="lastName")
    WebElement lstName;
  
    
    
   //driver.findElement(By.id("userEmail"));
    @FindBy(id="userEmail")
    WebElement email;
   
    
    
    //WebElement age= driver.findElement(By.id("age"));
    @FindBy(id="age")
    WebElement age;
    
    //driver.findElement(By.id("salary"));
    @FindBy(id="salary")
    WebElement salary;
    
    
    //= driver.findElement(By.cssSelector("#department"));
    @FindBy(css="#department")
    WebElement dept;
    
    
    //button[id='submit']
    //driver.findElement(By.cssSelector("button[id='submit']"));
    @FindBy(css="button[id='submit']")
    WebElement sbmtbtn;
    
     //driver.findElement(By.xpath("(//div[@role='rowgroup'])[4]"));
    @FindBy(xpath="(//div[@role='rowgroup'])[4]")
    WebElement addedRecord;
    
    
    
    
    //WebElement deleteButton = addedRecord.findElement(By.cssSelector("#delete-record-4"));
    
   @FindBy(css="#delete-record-4")
   WebElement deleteButton;

    
   
   
		public void AddNewRecord(String firstname, String lastname, String userEmail, String Age, String Salary, String department)
		{
			
			ele.click();
			wbtbl.click();
			addNewrec.click();
			
			firstName.sendKeys(firstname);
			lstName.sendKeys(lastname);
			email.sendKeys(userEmail);
			age.sendKeys(Age);
			salary.sendKeys(Salary);
			dept.sendKeys(department);
			sbmtbtn.click();
			String recInfo=addedRecord.getText();
			System.out.println(recInfo);
			deleteButton.click();
			
			
			
		}

	}
