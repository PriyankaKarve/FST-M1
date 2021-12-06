import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginWebsiteBackend {
	public static void main(String[] args) throws InterruptedException {
	       
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
    	
        String baseUrl = "https://alchemy.hguy.co/jobs/wp-admin";
             
        driver.get(baseUrl);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\'user_login\']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id=\'user_pass\']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id=\'wp-submit\']")).click();
        driver.close();
}
}
