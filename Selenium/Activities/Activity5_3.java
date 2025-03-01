package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_3 {

    public static void main(String[] args) {

    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //Find the checkbox
        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));

        //Print status
        System.out.println("The checkbox is selected: " + textInput.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        //Print status
        System.out.println("The checkbox is selected: " + textInput.isEnabled());

        //Close the browser
        driver.close();

    }

}