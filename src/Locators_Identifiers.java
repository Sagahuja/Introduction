import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Identifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Automation-Workspace\\Introduction\\Browser extensions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dopagent.indiapost.gov.in/");
		driver.manage().window().maximize();
		
		//Notes - every object may not have id,Class Name or name thus, Xpath and CSS preferred
		//      Alpha numeric id may vary on every refresh thus do check before using it.
		//      confirm the link object with anchor "a" tag
		//      Classes Should not have spaces - Compound classes cannot be accepted.
		//      Multiple values identifies the first one - Scans from top left
		//     Double quotes inside double quotes are not accepted
		//     X path & CSS can be defined in n number of way
		//     Right click copy on blue highlighted html code to generate xpath
		//     when xpath starts with html- not reliable- switch browser to get another one 
		//     There is no direct way to get CSS in Chrome , you will find it in toolbar
		//     $("") is for CSS and $x("") for xpath
		//     
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("DOP.MI1410080500004");
		driver.findElement(By.className("txtField")).sendKeys("RamRam#$43");
		driver.findElement(By.name("Action.VALIDATE_RM_PLUS_CREDENTIALS_CATCHA_DISABLED")).click();
		
		
		/////////////////////////////////////////////////
		
		
		 
		  driver.findElement(By.xpath("//*[@id='Accounts']")).click();
		  driver.findElement(By.linkText("Agent Enquire & Update Screen")).click();
		  driver.findElement(By.cssSelector("#CustomAgentRDAccountFG\\.SELECT_INDEX_ARRAY\\[0\\]")).click();
		  
		  //customized Xpath
		  driver.findElement(By.xpath("//input[@value='Save']")).click();
		  // it is also possible to customise Xpath with tag name , when we are not sure 
		  // if tag names will be changed or not , just * to be added like- //*[@value='Save']
		  // general x path syntax - //tagname[@attribute='value']
		 // driver.findElement(By.id("Button26553257")).click();
		  // general CSS syntax - tagName[attribute='value']
		//  another syntax css - tagname#id , input#username
		  // another syntax css - tagname.classname - input.inputtext
		  
		  
		  
		  // System.out.println(driver.findElement(By.cssSelector("div#MessageDisplay_Table.section")).getText());
		 // System.out.println(driver.findElement(By.id("errorlink1")).getText());
		//  div#MessageDisplay_Table.section,id="errorlink1"
		//System.out.println(driver.findElement(By.cssSelector("div#.errorlink1")).getText());  
			  
			  
			  
			  //Xpath Syntax with Regular expression 
		      // //tagname[@contains(@attribute,'value')];
		      
			  
			  
			  
			  
			  
		 //driver.close();
			 

	}

}
