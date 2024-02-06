package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for b");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
		WebElement text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span"));
		//text.getText();
		System.out.println(text.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
		WebElement text1 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	    System.out.println(text1.getText());
	    Thread.sleep(3000);
	    WebElement text2 = driver.findElement(By.xpath("//span[text()='1,761']"));
	    System.out.println(text2.getText());
	    Thread.sleep(3000);
	    String windowHandle = driver.getWindowHandle();
	    String title = driver.getTitle();
	    System.out.println("title" + title);
	    driver.close();
	    
	    
	}

}
