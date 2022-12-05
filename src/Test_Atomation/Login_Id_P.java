package Test_Atomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Id_P {

	public static void main(String[] args) {
		
		String path ="C:\\Users\\SRM\\eclipse-workspace\\Selenium_Automation_java_file\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/login/");

	 driver.manage().window().maximize();
	 
	 WebElement txt_email = driver.findElement(By.id("email"));
	 txt_email.sendKeys("vilash");
	 
	 WebElement txt_password = driver.findElement(By.name("pass"));
	 txt_password.sendKeys("7000554");
	 
	 WebElement btn_login = driver.findElement(By.id("loginbutton"));
	 btn_login.click();
	 
	 driver.close();
	 
	

	}

}
