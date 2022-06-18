package selenium.week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.out.println("automation Testing ");
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://www.leafground.com/pages/Alert.html");
		
		 driver.manage().window().maximize();
	
		 driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
			 Alert alert = driver.switchTo().alert();
//			String text = alert.getText();
			 
			 String text = alert.getText(); 
			System.out.println(text);
			alert.accept();

			driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
			String text1 = alert.getText();
			System.out.println(text1);
			Thread.sleep(2000);
			alert.dismiss();

			driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
			alert.sendKeys("test");
			Thread.sleep(2000);
			alert.accept();
}
}
