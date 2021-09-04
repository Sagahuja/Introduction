import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class First_with_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91956\\Automation-Workspace\\Introduction\\Browser extensions\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://salesforce.com");
		System.out.println(driver.getTitle());
		
		
		
		
		//driver.close();
		
	
	
	}

}
