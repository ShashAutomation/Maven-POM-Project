package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPageTest {
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
	public static WebElement clickFacebookHome(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));	
	    return element;	
	}
	public static WebElement facebookLogoDisplay(WebDriver driver)
	{
	   element=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	   return element;
	}
}
