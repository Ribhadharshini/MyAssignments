package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cinemas {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("nav-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='city']"));
		Select dropDownBox=new Select(dropDown);
		dropDownBox.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@name='genre']"));
		Select dropDownBox1=new Select(dropDown1);
		dropDownBox1.selectByVisibleText("ANIMATION");
		Thread.sleep(3000);
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@name='lang']"));
		Select dropDownBox2=new Select(dropDown2);
		dropDownBox2.selectByVisibleText("ENGLISH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(3000);
		WebElement cinema = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		cinema.sendKeys("PVR Ampa Chennai");
	    cinema.click();
	    Thread.sleep(3000);
	    WebElement dropDown3 = driver.findElement(By.xpath("//select[@name='timings']"));
	    Select dropDownBox3=new Select(dropDown3);
	    dropDownBox3.selectByIndex(1);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ribha");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9952715403");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("nothing");
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
	    driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("1");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ribharibha368@gmail.com");
	    Thread.sleep(5000);
        WebElement dropDown4 = driver.findElement(By.xpath("//select[@name='food']"));
        Select dropDownBox4=new Select(dropDown4);
        dropDownBox4.selectByIndex(1);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='display-block']")).click();
        driver.findElement(By.xpath("(//div[@class='form-group col-sm-6'])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[@class='btn already-member'])[4]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
	}

}
