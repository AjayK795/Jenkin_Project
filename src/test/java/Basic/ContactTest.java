package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void CreateContactTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ajio.com");
	}

}
