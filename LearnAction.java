package week7.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnAction {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Thread.sleep(3000);
		WebElement sam = driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		Thread.sleep(3000);
		builder.moveToElement(sam).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		Thread.sleep(3000);
		List<WebElement> cost = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		System.out.println("size" +cost.size());
		for(int i=0;i<cost.size();i++) {
			String text = cost.get(i).getText();
			System.out.println(text);
		}
			
		}
	}



