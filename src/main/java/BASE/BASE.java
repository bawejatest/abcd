package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BASE {
public WebDriver driver;
	
	@BeforeClass
	public void test() {
		System.setProperty("webdriver.chrome.driver","E:\\rajatnarang_qa\\test123\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.iic.idrivelogistics.com/login?redirect=%2Fhome");
}
}