import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobListing_backend {
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
        Thread.sleep(3000);        
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/a")).click();
        Thread.sleep(3000);
        
        //driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[1]/button/svg/path")).click();
      
        
        driver.findElement(By.xpath("//*[@id=\'post-title-0\']")).sendKeys("PriyankaCompany");
        WebElement Element = driver.findElement(By.xpath("//*[@id=\'_job_location\']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.sendKeys("London");
        
        driver.findElement(By.xpath("//*[@id=\'_company_name\']")).sendKeys("PriyankaCompany");
        driver.findElement(By.xpath("//*[@id=\'_company_website\']")).sendKeys("www.abc.com");
        driver.findElement(By.xpath("//*[@id=\'_company_tagline\']")).sendKeys("tagline");
        driver.findElement(By.xpath("//*[@id=\'_company_twitter\']")).sendKeys("@abc");
        driver.findElement(By.xpath("//*[@id=\'_company_video\']")).sendKeys("www.abc.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
        //driver.close();
}

}
