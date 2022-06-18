package selenium.week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
System.out.println("automation Testing ");
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		 driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	 Alert alert = driver.switchTo().alert();
	
	Thread.sleep(2000);
	
	alert.sendKeys("text");
	alert.accept();
	String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println(text);

	if (text.contains("text")) {
		System.out.println("This case is PASSED");

	} else {
		System.out.println("This case is FAILED");
	}
	
	
	}

}
