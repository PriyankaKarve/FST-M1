package activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_1 {

    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
		
	//Open the browser
	driver.get("https://www.training-support.net");
		
	//Close the browser
	driver.close();
    }

}