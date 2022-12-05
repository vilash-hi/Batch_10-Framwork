package Test_Atomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRM\\eclipse-workspace\\Selenium_Automation_java_file\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//send vaule-------searchbar
		
		WebElement txt_searchbar=driver.findElement(By.xpath("//input[@name='q']"));
		txt_searchbar.sendKeys("class");
		Thread.sleep(3000);
		
		// list by class
		
		List<WebElement>autolist=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		
		Thread.sleep(3000);
		System.out.println(autolist.get(4).getText());
		
		Thread.sleep(3000);
		System.out.println(autolist.size());
		
	
		for(int i=0;i<autolist.size();i++) {
			
			Thread.sleep(3000);
			
			String textlist=autolist.get(i).getText();
			
			System.out.println(textlist);
			
			if(textlist.equals("googal classroom")) {
				
				autolist.get(i).click();
			}
			
			
		}
		
		

	}

}
