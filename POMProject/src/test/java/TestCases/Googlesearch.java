package TestCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.FacebookPageTest;
import Pages.GooglePageTest;
import Pages.InstagramPageTest;

public class Googlesearch {
	WebDriver driver;
	@BeforeMethod
	public void chromeRun()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
	@Test(priority=1)
	public void googleTest() throws InterruptedException
	{
		GooglePageTest.GmailButtonTest(driver).click();
		driver.navigate().back();
		GooglePageTest.Search(driver).sendKeys("Google");
		Thread.sleep(2000);
		GooglePageTest.SearchButton(driver).click();
		GooglePageTest.googleHomeButton(driver).click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		boolean b=GooglePageTest.googleLogoDisplay(driver).isDisplayed();
		Assert.assertTrue(b);
	}
	@Test(priority=2)
	public void facebookTest() throws InterruptedException
	{
		FacebookPageTest.Search(driver).sendKeys("Facebook");
		Thread.sleep(2000);
		FacebookPageTest.SearchButton(driver).click();
		FacebookPageTest.clickFacebookHome(driver).click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		boolean b=FacebookPageTest.facebookLogoDisplay(driver).isDisplayed();
		Assert.assertTrue(b);
	}
	@Test(priority=3)
	public void instagramTest() throws InterruptedException
	{
		InstagramPageTest.Search(driver).sendKeys("Instagram");
		Thread.sleep(2000);
		InstagramPageTest.SearchButton(driver).click();
		InstagramPageTest.clickInstagramHome(driver).click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Instagram");
		boolean b=InstagramPageTest.instagramLogoDisplay(driver).isDisplayed();
		Assert.assertTrue(b);
		Thread.sleep(2000);
		boolean b1=InstagramPageTest.loginEnabledcheck1(driver).isEnabled();
		if(b1)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
		InstagramPageTest.username(driver).sendKeys("abc");
		InstagramPageTest.password(driver).sendKeys("abc123");
		boolean b2=InstagramPageTest.loginEnabledcheck1(driver).isEnabled();
	    Assert.assertTrue(b2);
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
