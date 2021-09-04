import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Automation-Workspace\\Introduction\\Browser extensions\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		/*
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Login Login");
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).
		 * sendKeys("Password Password");
		 * driver.findElement(By.xpath("//button[@name='login'] ")).click();
		 */
		
		//--------------
		
		//Complete CSS 
		
		
		
		
		/*
		 * driver.findElement(By.cssSelector("input[id='email']")).
		 * sendKeys("Login Login");
		 * driver.findElement(By.cssSelector("input[placeholder='Password']")).
		 * sendKeys("Password Password");
		 * driver.findElement(By.cssSelector("button[name='login']")).click();
		 * 
		 * // Xpath Regular expresson
		 * driver.findElement(By.xpath("//input[@id,'email']")).sendKeys("Login Login");
		 * driver.findElement(By.xpath("//imput[@placeholder,'Password Password']")).
		 * sendKeys("PWD");
		 * driver.findElement(By.xpath("//button[@name,'login']")).click();
		 * 
		 * // when you have only one identifier and it is also keep on changing,we look
		 * // into the part which is constant in value of that identifier // Regular
		 * Expression - // tagname[contains(@attribute,'value')] - xpath // above should
		 * not be required to exactlu match, it should contains // //
		 * input[contains(@name,'usern')];
		 * driver.findElement(By.xpath("//input[contains(@id,'email')]")).
		 * sendKeys("Login Login");
		 * driver.findElement(By.xpath("//input[contains(@placeholder,'Passwo')]")).
		 * sendKeys("PWD");
		 * driver.findElement(By.xpath("//button[contains(@name,'logi')]")).click();
		 */
		 // similarly we have regular expression in CSS
		  //tagname[Attribute*='value'] - css regular expression
		  // //input[placeholder*='Passw'];
		  
		  
		  //Parent Child relationship xpath-Define xpath for parent/tagnames
		  driver.findElement(By.xpath("//div[@class='_8esk']//div[2]/div//div//div//div//input")).sendKeys("Hu La La La LalelO");
		  //driver.findElement(By.xpath(""));
		  
		  
		  
		//driver.close();
		  
		  
	
	
	}

}
