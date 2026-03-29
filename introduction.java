package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class introduction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//step locate or find username field and enter value 
		driver.findElement(By.id("_R_64qjbjb9pb6amH1_")).sendKeys("sagar.ambre85@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("r@pper123");
		driver.close();
		//driver.findElements(By.id("replay")).click();
	
	}

}
