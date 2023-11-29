import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\RahulShetty\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#name")).sendKeys("Bhabani");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#name")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#name")).sendKeys("Shetty");
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		driver.switchTo().alert().dismiss();

	}

}
