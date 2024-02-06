package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseTest {

	public void selectOriginAndDestination(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@aria-label='Remove']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("Las Vegas");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='To?']")).sendKeys("San Francisco");

	}
	
	
	public void selectDates(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='sR_k-value'])[1]")).click();
		
		driver.findElement(By.cssSelector("div[aria-label='Tuesday March 19, 2024']")).click();
		
		driver.findElement(By.xpath("(//span[@class ='sR_k-value'])[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Saturday March 30, 2024']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		
	}

}