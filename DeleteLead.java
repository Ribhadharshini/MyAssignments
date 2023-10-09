package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		///*http://leaftaps.com/opentaps/control/main
		//Delete Lead:
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
		//8	Click on Phone
		driver.findElement(By.linkText("Phone")).click();
		//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//11	Capture lead ID of First Resulting lead
		//driver.findElement(By.xpath("//a[text()='11782']")).click();
        //12	Click First Resulting lead
		//13	Click Delete
		//driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//14	Click Find leads
		//driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//15	Enter captured lead ID
		//driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11782");
		//16	Click find leads button
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		//String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		//System.out.println(text);
		//18	Close the browser (Do not log out)
		//driver.close();
		
	}

}
