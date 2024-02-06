import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) {
       
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\SEM 6\\Devops\\sele\\main\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/login.html");
        
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys("tanaykumar0903@gmail.com"); 
        
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("chrome123"); 
        
        WebElement pass1 = driver.findElement(By.xpath("/html/body/div/form/button"));
        pass1.click(); 

       
}
}