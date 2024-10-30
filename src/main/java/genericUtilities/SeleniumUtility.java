package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {
	
	/**
	 * This method will perform context click 
	 * @param driver
	 */
	
	public void contextClick(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method will perform double click
	 */
	
	public void doubleClick(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method will perform mouseHovering
	 */
	
	public void mouseHovering(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method will perform click and hold actions
	 */
	public void clickAndHold(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.clickAndHold().perform();
	}
	
	/**
	 * This method will perform click action
	 */
	public void click(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.click().perform();
				
	}
	/**
	 * This method will perform drag and drop
	 */
	
	public void dragAndDrop(WebDriver driver, WebElement ele, WebElement ele2)
	{
		Actions act= new Actions(driver);
		act.dragAndDrop(ele, ele2);
	}
	/**
	 * This method will switch the frame using Index
	 */
	
	public void frameSwitchByIndex(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * this method will switch the frame using Name or Value
	 * @param driver
	 * @param name
	 */
	
	public void frameSwitchByName(WebDriver driver, String name)
	{
		driver.switchTo().frame(name);
	}
	
	/**
	 * this method will switch the frame using element
	 * @param driver
	 * @param element
	 */
	
	public void framwSwitchBy(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * this method will accept the alert popup
	 * @param driver
	 */
	public void AcceptAlertPopUp(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this method will dismiss the alert pop up
	 * @param driver
	 */
	public void dismissAlertPopUp(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * this method will return the text of alert pop up
	 * @param driver
	 */
	public void getTextAlertPopUp(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	
	/**
	 * this method will allow to write inside alert pop up
	 * @param driver
	 * @param value
	 */
	public void sendKeysAlertPopUp(WebDriver driver, String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	/**
	 * this method will capture the screenshot
	 * @param driver
	 * @param screenshot1
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public String screenShot(WebDriver driver, String screenshot1, String path) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path+screenshot1+".png");
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();
	}
	
	/**
	 * This method will handle the Drop down by index
	 */
	
	public void handleDropdownByIndex(WebDriver driver, WebElement ele, int index)
	{
		Select sc = new Select(ele);
		sc.selectByIndex(index);
	}
	
	public void handleDropDownValue(WebDriver driver, WebElement ele, String value)
	{
		Select sc = new Select(ele);
		sc.selectByValue(value);
	}
	public void handleDropDownByVisibleText(WebDriver driver, WebElement ele, String text)
	{
		Select sc = new Select(ele);
		sc.selectByVisibleText(text);
	}
	
	/**
     * This will handle the drop down by Xpath
     */
	
    public void handleDropDownByLocator(WebDriver driver, String ele)
     
    {
	    driver.findElement(By.xpath(ele)).click();
	  
    }
    /**
     * this method will maximize the screen
     */
    
    public void maximizeScreen(WebDriver driver)
    {
    	driver.manage().window().maximize();
    }
    
    /**
     * this method will minimize the screen
     */
    public void minimizeScreen(WebDriver driver)
    {
    	driver.manage().window().minimize();
    }
    
    /**
     * This method will perform implicit waits
     */
    
    public void implicitWaits(WebDriver driver,int time )
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
    
    /**
     * This method will wait for element to be clickable
     * 
     */
    public void waitForElementTobeClickable(WebDriver driver, WebElement element, int time)
    {
    	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    /**
     * This method will wait for element to be visible
     */
    
    public void waitForElementTobeVisible(WebDriver driver, int time, WebElement element)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
    	wait.until(ExpectedConditions.visibilityOf(element));
    	
    }
    /**
     * This method will perform scroll Down action
     * @param driver
     */
    public void scrollDown(WebDriver driver)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("Window.scrollBy(0,500);", "");
	}
    
    /**
     * This method will perform scroll up action
     */
    public void scrollUp(WebDriver driver)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("Windows.scrollBy(0,-500);", "");
    }
    
   
    
    
 }
   	

