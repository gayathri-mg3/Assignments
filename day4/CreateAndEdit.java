package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndEdit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("River");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manoharan");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mgayathri@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf_G3");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
