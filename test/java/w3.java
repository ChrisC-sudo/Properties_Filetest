import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class w3 {
	public static void main(String[] args) throws Exception, InterruptedException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Schoolin\\sconfig.properties");
		
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Schoolin\\sconfig.properties");
		prop.load(file);
		String driverPath = prop.getProperty("driverPath");
		String url= prop.getProperty("url");*/
		System.setProperty("webdriver.chrome.driver","driverPath");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//i[@class='fa']")).click();
		driver.findElement(By.id("gsc-i-id1")).sendKeys("Selenium");
		driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']")).click();
		Thread.sleep(3000);
		driver.close();
		
		System.out.println("driverPath" + prop.getProperty("driverPath"));
		System.out.println("Url" + prop.getProperty("url"));
		

	}

}
