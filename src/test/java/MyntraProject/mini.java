package MyntraProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mini {
	
	public static WebDriver driver;
	
	public static void Browser_Launch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
	}
	
	public static void project() {
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		
	}

	private static void getsize() {
		driver.findElements(By.xpath("//a[@target='_blank']"));
		
		System.out.println("");
		
	}
	

	public static void main(String[] args) {
		

	}

}
