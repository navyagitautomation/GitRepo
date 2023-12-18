package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class first_maven {
@Test
public void test()
{
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\kbnav\\Documents\\javaselenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
}
}
