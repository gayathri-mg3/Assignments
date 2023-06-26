package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassRoomActivity1 {

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

WebElement opt=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select option=new Select(opt);
option.selectByVisibleText("General Services");
Thread.sleep(2000);

WebElement opt1=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select option1=new Select(opt1);
option1.selectByVisibleText("S-Corporation");
Thread.sleep(2000);

WebElement opt2=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select option2=new Select(opt2);
option2.selectByVisibleText("California");
Thread.sleep(3000);

driver.close();
}

}
