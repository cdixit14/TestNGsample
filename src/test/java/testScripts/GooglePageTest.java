package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
	
	//this will create run script for test1
  @Test
  public void JavaTutorialsearch() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("Java Tutorial");
	  srcBox.submit();
	 
  }
  //this will create run script for test2
  @Test
  public void JavaTutorialsearch1() {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com/");
  WebElement srcBox = driver.findElement(By.className("gLFyf"));
  srcBox.sendKeys("W3school");
  srcBox.submit();
  }
}
