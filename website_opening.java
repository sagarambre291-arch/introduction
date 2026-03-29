package introduction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class website_opening {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.id("_R_64qjbjb9pb6amH1_")).sendKeys("sagar.ambre85@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("r@pper183");
		driver.findElement(By.className("html-div")).click();
	

	}

}
