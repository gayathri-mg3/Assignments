package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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

WebElement submit=driver.findElement(By.name("submitButton"));
submit.click();

//Thread.sleep(2000);
driver.close();
	}

}
