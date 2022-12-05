package Test_Atomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_12 {

	public static void main(String[] args) {
		
System.setProperty("Webdriver.chromedriver","C:\\Users\\SRM\\eclipse-workspace\\Selenium_Automation_java_file\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.0");
		

	}

}
