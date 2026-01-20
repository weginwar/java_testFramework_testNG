package FunctionalTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test102 {
	
	//invocationCount=3,timeOut=10000,threadPoolSize=3,groups= {"smoke","regression"
	@Test()
	public static void test01() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://demoqa.com/");
		driver.quit();
		
	}
	
	@Test(groups= {"smoke","regression"})
	public static void test02() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://demoqa.com/");
		driver.quit();
		
	}
	@Test(groups= {"smoke","regression"})
	public static void test03() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://demoqa.com/");
		driver.quit();
		
	}

	
}
