package MFSQuizWebAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage  {
	
	
WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement newuserbtn=driver.findElement(By.id("newUser"));
	
	@FindBy(id="newUser")
	WebElement signUpbtn;
	


public void loginPage()
{
	
	signUpbtn.click();
}

}
