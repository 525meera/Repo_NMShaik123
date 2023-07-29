package selenium_basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Pro 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String get_Title=driver.getTitle();
		System.out.println(get_Title);
		Thread.sleep(2000);
		String get_CurrentUrl=driver.getCurrentUrl();
		System.out.println(get_CurrentUrl);
		Thread.sleep(4000);
		String get_PageSource=driver.getPageSource();
		System.out.println(get_PageSource);
		Thread.sleep(2000);
		
		driver.close();

	}
}
