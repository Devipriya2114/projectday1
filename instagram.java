package hello1;

public class instagram {

	package selenium123;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Instagram {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumtasks\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			 driver.get("https://www.amazon.in/");
			
			 String title=driver.getTitle();                        //title
	  		 System.out.println(title);
	  		 
			 String currenturl = driver.getCurrentUrl();         //currenturl
	  		 System.out.println(currenturl);
	  		 
	  		 String pagesource = driver.getPageSource();     //pagesource
			 System.out.println(pagesource);
			
			 // driver.close();
			 
			
		}

	}

}
