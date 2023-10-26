package week7.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
	    // 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img[1]")).click();
		Set<String> childWindow=driver.getWindowHandles();
		List<String> child1=new ArrayList<String>(childWindow);
        driver.switchTo().window(child1.get(1));
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//div[contains(@class,'x-grid3')]/following::a[@class='linktext']")).click();
        driver.switchTo().window(child1.get(0));
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        Set<String> childWindow1 = driver.getWindowHandles();
        List<String> child2=new ArrayList<String>(childWindow1);
        driver.switchTo().window(child2.get(1));
        driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/following::a[contains(@class,'linktext')])[10]")).click();
        driver.switchTo().window(child2.get(0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        driver.switchTo().alert().accept();
        String title2 = driver.getTitle();
        System.out.println(title2);
        
		
	}

}
