package week6.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0wp4yggz5ikn51wjgrja8jnf8p540318.node0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		//driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		//driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("test");
		promptAlert.accept();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-check'])[2]")).click();
	}

}
