package hello1;

public class introsele {
	
	package selenium123;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class introselenium {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver() ;
			 driver.get("https://web.whatsapp.com/");
			
					}

	}


}
