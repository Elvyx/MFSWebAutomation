package MFSQuizWebAutomation.UserRegistration;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Widgets_Slider {

	
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

        
        
       WebElement wgt= driver.findElement(By.xpath("(//div[contains(@class,'element-group')])[4]"));
       wgt.click();
       
       
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wgt);
      
       
       WebElement sldrtab= driver.findElement(By.xpath("(//li[@id='item-3'])[3]"));  
      
       sldrtab.click();
       
       WebElement slider=driver.findElement(By.cssSelector("input[type='range']"));

       
    // Calculate the offset for moving from 25 to 75 on the slider
       int xOffset = calculateSliderOffset(slider, 49) - calculateSliderOffset(slider, 25);

       // Use Actions class to perform drag-and-drop to move the slider
       Actions actions = new Actions(driver);
       actions.clickAndHold(slider).moveByOffset(xOffset, 0).release().perform();

       // Close the browser
       driver.quit();
   }

   // Calculate the slider offset for a given value
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



    
  
