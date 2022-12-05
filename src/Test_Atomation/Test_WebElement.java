package Test_Atomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_WebElement {

	public static void main(String[] args) {
		
		// browesr open
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRM\\eclipse-workspace\\Selenium_Automation_java_file\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		// web element
		
		WebElement txt_email =driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_password = driver.findElement(By.xpath("//input[@name='pass']"));
	WebElement btn_login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		//Action
		if(txt_email.isEnabled()==true && txt_email.isDisplayed()== true) {
			txt_email.sendKeys("Test10");
		}
		
		else {
			
		
			System.out.println("Element is disabled");
		}
		txt_password.sendKeys("700054615");
		btn_login.click();
		
		driver.close();
		
	}

}
