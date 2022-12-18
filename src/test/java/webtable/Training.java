package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Training {

	public static WebDriver driver;

	public static void browser_Launch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
	}
	
	public static void getAllData () {//multiple elements using for each
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr/td"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());	
		}
	}
		public static void particularData () {
			WebElement data = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]"));
					System.out.println(data.getText());
					
		}
		
		public static void rowwise () { //multiple elements using for each
			List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[8]/td"));
			for (WebElement data1 : findElements) {
				System.out.println(data1.getText());	
			}	
	}
		public static void columnwise () {
			List<WebElement> findElements1 = driver.findElements(By.xpath("//table/tbody[1]/tr/td[2]"));
			for (WebElement data2 : findElements1) {
				System.out.println(data2.getText());
			}
			
		}

		
		
public static void main(String[] args) {
	browser_Launch();
	//getAllData();
	//particularData();
	//rowwise();
	columnwise();
	
	
}
}
