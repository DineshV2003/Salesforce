import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditAccount {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qeagle@123");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	
	WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
	driver.executeScript("arguments[0].click();", element);
	Thread.sleep(600);
	driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Dineshkumar",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Dineshkumar']")).click();
	
	driver.findElement(By.xpath("//span[text()='Show more actions']/preceding-sibling::lightning-primitive-icon")).click();
	driver.findElement(By.xpath("//span[text()='Edit']")).click();
	driver.findElement(By.xpath("//input[@name='Name']")).clear();
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Dinesh");
	driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	driver.close();
}
}
	
