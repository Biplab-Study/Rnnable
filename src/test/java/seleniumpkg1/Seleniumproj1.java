package seleniumpkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Seleniumproj1 {

	public class LoginAutomation {
		@Test
		public void login() {
		System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.name("login"));
		username.sendKeys("biplabroy446@gmail.com");
		password.sendKeys("bilu@2011");
		login.click();
		String actualUrl="https://www.facebook.com/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		}
		}

}
