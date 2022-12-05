package Test_Atomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRM\\eclipse-workspace\\Selenium_Automation_java_file\\Driver\\chromedriver.exe");
		
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.youtube.com/watch?v=gu3ZIEKLQGM");
		
		driver1.manage().window().maximize();
		
		Thread.sleep(5000);

	}

}
