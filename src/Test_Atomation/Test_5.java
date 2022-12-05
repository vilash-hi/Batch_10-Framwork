package Test_Atomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_5 {

	private static Object drp_counry;
	private static WebElement drp_country;

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRM\\eclipse-workspace\\Selenium_Automation_java_file\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		driver.manage().window().maximize();
		
		// dropdown
		
		driver.findElement(By.xpath("//select[@name='country']"));
		
	//handleDropDown(drp_country,"ANTARCTICA");
		
	//	handleDropDown(drp_country,"ANTARCTICA");
		
		
		Select drp=new Select(drp_country);
		
		drp.selectByIndex(4);
		
		Thread.sleep(3000);
		
		drp.deselectByValue("AMERICAN SAMOA");
		
	System.out.println(drp.getFirstSelectedOption().getText());
	
	//deal--------> drop option----->
	
	List<WebElement>optionlist=drp.getOptions();
	
	System.out.println(optionlist.size()); //264
	
	Thread.sleep(3000);
	
	for(int i=0;i<optionlist.size();i++) {
		
		Thread.sleep(3000);
		
		String option=optionlist.get(i).getText();
		
		System.out.println(option);
		
	}
		
	}

	
		
	}

	
		
	

	
		
	

	
		
	


