package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageTest {
public static WebElement element;
	
	public static WebElement GmailButtonTest(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[@class='gb_d']"));
		return element;	
	}
	public static WebElement Search(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		return element;
	}
	
	public static WebElement SearchButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@class='gNO89b']"));
		return element;
	}
	public static WebElement googleHomeButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		return element;
	}
	public static WebElement googleLogoDisplay(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		return element;
	}
}
