package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class RegisterDemoQA {
	WebDriver driver;
	
public RegisterDemoQA(WebDriver driver) {
		
		
		this.driver=driver;
	
	}

By registration= By.xpath("//a[text()='Registration']");
By registrationHeader= By.xpath("//h1[text()='Registration']");
By firstName=By.xpath("//label[text()='First Name']/following::input[@name='first_name']");
By lastName=By.xpath("//label[text()='Last Name']/following::input[@name='last_name']");
By martialStatus= By.xpath("//label[text()='Marital Status']/following::div/label/following::input[@value='single']");
By hobby=By.xpath("//label[text()='Hobby']/following::div/label[text()='Reading']/following::input[@value='reading']");
By country =By.xpath("//label[text()='Country']/following::select[@id='dropdown_7']");
By date=By.xpath("//div[@class='time_fields']/select[@id='mm_date_8']");
By month=By.xpath("//div[@class='time_fields']/select[@id='dd_date_8']");
By year=By.xpath("//div[@class='time_fields']/select[@id='yy_date_8']");
By phone=By.xpath("//label[text()='Phone Number']/following::input[@id='phone_9']");
By username=By.xpath("//label[text()='Username']/following::input[@id='username']");
By email=By.xpath("//label[text()='E-mail']/following::input[@id='email_1']");
By image= By.xpath("//input[@id='profile_pic_10']");
By description =By.xpath("//label[text()='About Yourself']/following::textarea");
By password=By.xpath("//label[text()='Password']/following::input[@id='password_2']");
By confirmPassword=By.xpath("//label[text()='Confirm Password']/following::input[@id='confirm_password_password_2']");
By submitButton=By.xpath("//input[@name='pie_submit']");
public WebElement clickRegistration() {
	
	return driver.findElement(registration);
}

public WebElement validateHeader() {
if(driver.findElement(registrationHeader).getText().equals("Registration")) {
	System.out.println("User is in registration page");	
	}
	
else {
	System.out.println("User is not in registration page");	
	}
	
	return driver.findElement(registrationHeader);
	
	
}

public WebElement setFirstName() {
	
	return driver.findElement(firstName);
}

public WebElement setLastName() {
	return driver.findElement(lastName);
}

public WebElement selectMartialStatus() {
	return driver.findElement(martialStatus);
	
}

public WebElement selectHobby() {
	
	return driver.findElement(hobby);
}

public WebElement selectCountry() {
Select s= new Select(driver.findElement(this.country));
s.selectByVisibleText("India");

return driver.findElement(this.country);
}

public WebElement setMonth() {
	
	Select s= new Select(driver.findElement(month));
	s.selectByVisibleText("7");
	return  driver.findElement(month);

}
public WebElement setDate() {
	
	Select s= new Select(driver.findElement(date));
	s.selectByVisibleText("6");
	return  driver.findElement(date);

}
public WebElement setYear() {
	
	Select s= new Select(driver.findElement(year));
	s.selectByVisibleText("1988");
	return  driver.findElement(year);

}
public WebElement setPhoneNumber() {
	
	return driver.findElement(phone);
	
}

public WebElement setUsername() {

	return driver.findElement(username);
}
public WebElement setEmail() {

	return driver.findElement(email);
}

public WebElement setDescription() {
	return driver.findElement(description);
	
}
public WebElement setPassword() {
	
	return driver.findElement(password);
}
public WebElement setConfirmPassword() {
	
	return driver.findElement(confirmPassword);
}

public WebElement clickSubmit() {
	return driver.findElement(submitButton);
}
}