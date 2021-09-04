import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class First_with_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Create Driver object for chrome browser
		// we will strictly implement methods of webdriver ( which is an interface)
		// If the name of the class is = X , to create the object -> x driver = new x();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Automation-Workspace\\Introduction\\Browser extensions\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//////////////////////////////////////////////////////////////////////
		System.out.println(driver.getCurrentUrl());
		if( driver.getCurrentUrl() == "http://google.com")
		{
			System.out.println("It is the expected URL");
		}
		
		else {
			System.out.println("There is some issue with URL");
		}
		
		
		//////////////////////////////////////////////////////////////////////
		
		//System.out.println(driver.getPageSource());
		
		
		
		/////////////////////////////////////////////////////////////////////
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		
		
		
		
		
		
		////////////////////////////////////////////////////////////////////
		driver.close();
		
		
		
	
		
		
	}

}
