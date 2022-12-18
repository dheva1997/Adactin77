package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpathwebtable {

	public static WebDriver driver;

	public static int indexofpopulation, indexoftotalcases;
	public static int indexofcountry;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
	}

	public static void getonedata() {
		List<WebElement> allheader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < allheader.size(); i++) {
			String text = allheader.get(i).getText();

			if (text.contains("Population")) {
				indexofpopulation = i;
				System.out.println("num of count: " + indexofpopulation);
			} else if (text.contains("Country")) {
				indexofcountry = i;
				System.out.println("country index is " + indexofcountry);
			} else if (text.contains("TotalCases")) {
				indexoftotalcases = i;
				System.out.println("index of toatal cases" + indexoftotalcases);
			}

		}

	}

	public static void main(String[] args) {
		browserLaunch();
		getonedata();

	}

}
