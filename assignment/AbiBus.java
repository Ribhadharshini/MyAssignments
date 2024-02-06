package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AbiBus {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//div[@class='container text-input  ']"));
		//findElement.sendKeys("chennai");
		findElement.click();
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		Thread.sleep(3000);
		WebElement findElement2 = driver.findElement(By.xpath("//h5[text()='Parveen Travels']"));
		String text = findElement2.getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		Thread.sleep(3000);
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='text-grey']/small"));
		String text2 = findElement3.getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		Thread.sleep(3000);
		WebElement findElement4 = driver.findElement(By.xpath("//div[@class='row selectedSeatDetails']"));
		String text3 = findElement4.getText();
		System.out.println(text3);
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
