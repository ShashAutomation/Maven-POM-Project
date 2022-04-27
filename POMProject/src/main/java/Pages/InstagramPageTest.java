package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstagramPageTest {
	public static WebElement element;
	public static WebElement Search(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		return element;
	}
	public static WebElement SearchButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@class='gNO89b']"));
		return element;
	}
	public static WebElement clickInstagramHome(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));	
	    return element;	
	}
	public static WebElement instagramLogoDisplay(WebDriver driver)
	{
	   element=driver.findElement(By.xpath("//img[@class='s4Iyt']"));
	   return element;
	}
	public static WebElement loginEnabledcheck1(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')]"));
		   return element;
	}
	public static WebElement username(WebDriver driver)
	{
		element=driver.findElement(By.name("username"));
		return element;
	}
	public static WebElement password(WebDriver driver)
	{
		element=driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement loginEnabledcheck2(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')]"));
		return element;
	}
}
