package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		//1	Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//8	Click on Email
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		//9	Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("ribha123@gmail.com");
		//10	Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		//11	Capture name of First Resulting lead
		driver.findElement(By.xpath("//a[text()='kavi']")).click();
		//12	Click First Resulting lead
		//13	Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//14	Verify the title as 'Duplicate Lead'
		String text=driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		System.out.println(text);
		//15	Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		//16	Confirm the duplicated lead name is same as captured name
		//17	Close the browser (Do not log out)
		driver.close();
	}

}
