package bdms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class StagingServer {
	
	@Test
	public void testjenkins() {
		
		System.out.println("Welcome to Jenkins world");
		//Create a instance of ChromeOptions class
		ChromeOptions options=new ChromeOptions();
		//Add browser switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		//initiate the web driver
		WebDriver driver=new ChromeDriver(options);
		// maximize the browser
		driver.manage().window().maximize();
		//define the Url's
		//driver.get("http://jnk:be@free@stg.befreecrm.com.au");
		//driver.get("http://stg.befreecrm.com.au/bdms/release1.8.0/");
		//defining the elements and perform actions such as click on it
		driver.findElement(By.id("txtName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("html/body/div[2]/form/div/table/tbody/tr[3]/td[2]/input")).click();
		//client module		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/nav/div[2]/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[1]/nav/div[2]/div/div/ul/li[3]/ul/li[1]/a/span")).click();
		
		//driver.findElement(By.xpath("html/body/div[3]/div[2]/div/form/div/table/tbody/tr[1]/td[6]/span/a[1]/img")).click();
		//driver.findElement(By.xpath("html/body/div[3]/div[2]/div/form/div/table/tbody/tr[1]/td[6]/span/a[1]/img")).click();
		//new Select(driver.findElement(By.id("000000"))).selectByVisibleText("1 - One");
		//existing the browser
		driver.quit();
		System.out.println("Test case Pass");
}
}
