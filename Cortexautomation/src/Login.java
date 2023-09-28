import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://cortexuat.acr.org");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='button button-primary shadow mt-3 mb-4'][1]")).click();
		driver.findElement(By.xpath(" //*[@name='username']")).sendKeys("testdxit1");
		driver.findElement(By.xpath(" //*[@type='submit']")).click();
		
		driver.findElement(By.xpath(" //*[@id=\"okta-signin-password\"]")).sendKeys("Titp42023!");
	    driver.findElement(By.xpath(" //*[@id='okta-signin-submit']")).click();
		
	
	
		
	
		
	}
}

	
