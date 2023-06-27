package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


driver.findElement(By.linkText("Create new account")).click();
driver.findElement(By.name("firstname")).sendKeys("Gayathri");
driver.findElement(By.name("lastname")).sendKeys("Manoharan");
driver.findElement(By.name("reg_email__")).sendKeys("0987654321");
driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
Thread.sleep(2000);
WebElement drop1=driver.findElement(By.id("day"));

Select date=new Select(drop1);
date.selectByIndex(18);

WebElement drop2=driver.findElement(By.id("month"));

Select month=new Select(drop2);
month.selectByVisibleText("Mar");

WebElement drop3=driver.findElement(By.id("year"));

Select year=new Select(drop3);
year.selectByVisibleText("1992");

driver.findElement(By.xpath("//label[text()='Female']")).click();
//driver.findElement(By.name("websubmit")).click();

Thread.sleep(5000);

driver.close();
	}

}
