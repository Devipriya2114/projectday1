package hello1;

public class getsele {
	
	package selenium123;

	import java.awt.Dimension;

	import javax.swing.text.Position;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class getselenium {
	      public static void main(String[] args) {
	    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	  		WebDriver driver = new ChromeDriver() ;
	  		 driver.get("https://www.facebook.com/login/");
	  		 
	  		 String title=driver.getTitle();                        //title
	  		 System.out.println(title);
	  		 
			 String currenturl = driver.getCurrentUrl();         //currenturl
	  		 System.out.println(currenturl);
	  		 
	  		 String pagesource = driver.getPageSource();     //pagesource
			 System.out.println(pagesource);
			 
		org.openqa.selenium.Dimension a = new org.openqa.selenium.Dimension(100, 1000);   //dimension
		driver.manage().window().setSize(a);
		
		org.openqa.selenium.Point b = new org.openqa.selenium.Point(10, 10);       //position

		driver.manage().window().setPosition(b);
		}
	}


}
