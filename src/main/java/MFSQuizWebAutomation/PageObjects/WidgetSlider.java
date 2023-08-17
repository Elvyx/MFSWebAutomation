package MFSQuizWebAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetSlider {
	
	
WebDriver driver;
	
	public WidgetSlider(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement wgt= driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[4]"));
	@FindBy(xpath="(//div[contains(@class,'element-group')])[4]")
	WebElement wgt;
  
    
    
   // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wgt);
   
    
    //WebElement sldrtab= driver.findElement(By.xpath("(//li[@id='item-3'])[3]"));  
   @FindBy(xpath="(//li[@id='item-3'])[3]")
   WebElement sldrtab;
  
    
    //WebElement slider=driver.findElement(By.cssSelector("input[type='range']"));
    @FindBy(css="input[type='range']")
    WebElement slider;
    
   
   
		public void Wslider()
		{
			
			wgt.click();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wgt);
			sldrtab.click();
			 int xOffset = calculateSliderOffset(slider, 49) - calculateSliderOffset(slider, 25);
			
			 Actions actions = new Actions(driver);
		       actions.clickAndHold(slider).moveByOffset(xOffset, 0).release().perform();
		}

			
		



		private static int calculateSliderOffset(WebElement slider, int targetValue) {
       int min = Integer.parseInt(slider.getAttribute("min"));
       int max = Integer.parseInt(slider.getAttribute("max"));
       int sliderWidth = slider.getSize().getWidth();

       double range = max - min;
       double pixelPerUnit = sliderWidth / range;
       int offset = (int) Math.round(pixelPerUnit * (targetValue - min));

       return offset;
		}
		
		}

	
