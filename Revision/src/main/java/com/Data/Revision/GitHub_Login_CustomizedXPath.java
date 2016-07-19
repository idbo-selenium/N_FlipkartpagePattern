package com.Data.Revision;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHub_Login_CustomizedXPath {

	@Test
	//github login and logout using customized xpath
//	public void GitHub_Login() throws InterruptedException{
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://github.com/login");		
//		driver.findElement(By.xpath("//*[@class='auth-form-body']/input[1]")).sendKeys("nirmalakumari");
//		driver.findElement(By.xpath("//*[@class='auth-form-body']/input[2]")).sendKeys("pass@word1");
//		driver.findElement(By.xpath("//*[@class='auth-form-body']/input[3]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='user-links']/li[3]/a/img")).click();
//		driver.findElement(By.xpath("//*[@class='header-nav-item dropdown js-menu-container active']/div/div/form/button")).click();
//		driver.close();	
//	}
	//trello login and logout using customized xpath
	public void Trello_Login() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://trello.com/login");
		driver.findElement(By.xpath("//*[@class='hide-when-two-factor']/input[1]")).sendKeys("knskumari");
		driver.findElement(By.xpath("//*[@class='hide-when-two-factor']/input[2]")).sendKeys("pass@word1");
		driver.findElement(By.xpath("//*[@class='login-password-container-email']/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='header-btn header-member js-open-header-member-menu']/span[2]")).click();
		driver.findElement(By.xpath("//*[@class='pop-over-content js-pop-over-content u-fancy-scrollbar js-tab-parent']/div/div/ul[3]/li/a")).click();
		driver.close();
	}
}