package TestCases;

import org.testng.annotations.Test;

import ObjectRepo.RegisterDemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RegisterClass {
	@Test
	public void registerSite() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_Latest\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		RegisterDemoQA r= new RegisterDemoQA(driver);
		r.clickRegistration().click();
		r.validateHeader();
		r.setFirstName().sendKeys("FirstName");
		r.setLastName().sendKeys("LastName");
		r.selectMartialStatus().click();
		r.selectHobby().click();
		r.selectCountry();
		r.setDate();
		r.setMonth();
		r.setYear();
		r.setPhoneNumber().sendKeys("1234567890");
		r.setUsername().sendKeys("FirstNameLastName");
		r.setEmail().sendKeys("firstname@abc.com");;
		r.setDescription().sendKeys("I am an automation tester");;
		r.setPassword().sendKeys("Barclays@123");
		r.setConfirmPassword().sendKeys("Barclays@123");
		r.clickSubmit();
	}

}
