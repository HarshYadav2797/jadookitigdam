package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.LoginPage;
public class BaseClass {
	
	WebDriver driver= null;
	
@BeforeSuite
public void bsConfig()
{
	System.out.println("----database connection successful------");
}


@BeforeClass
public void bcConfig()
{
	driver= new ChromeDriver();
	System.out.println("----browser is launched-----");
}


@BeforeMethod
public void bmConfig()
{
	LoginPage lp= new LoginPage();
	//to-do
	System.out.println("----login is successful-----");
}

@AfterMethod
public void amConfig()
{
	System.out.println("logout successful");
}

@AfterClass
public void acConfig()
{
	System.out.println("----browser closed-----");
}

@AfterSuite
public void asConfig()
{
	System.out.println("----db connection closed------");
}
}
