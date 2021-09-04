import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class First_with_ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\91956\\Automation-Workspace\\Introduction\\Browser extensions\\IEDriverServer.exe");
		WebDriver  driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
