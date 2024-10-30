package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.SeleniumUtility;

public class dropdown {
 public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com/");
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		SeleniumUtility su= new SeleniumUtility();
		su.handleDropDownByLocator(driver, "//a[@data-testid='open-registration-form-button']");
}

}
