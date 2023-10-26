package week6.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='product-title']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("621305");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='View Cart']")).click();
		driver.findElement(By.xpath("//a[@class='harman_btn4']/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();

	}

}
