
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {
	
	
	    public static void main(String args[]){  
	        System.setProperty("webdriver.chrome.driver","D:\\SEM 6\\Devops\\sele\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        //Launch website 
	        driver.get("https://facebook.com/");
	       }  
	   }