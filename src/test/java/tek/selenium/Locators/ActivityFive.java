package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityFive {

/*
Navigate to Retail App https://retail.tekschool-students.com/
click on Sign In
Fill up the Login form with invalid credentials
 and Click on Login and print the error message.
 */
public static void main(String[] args) throws Exception {

    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://retail.tekschool-students.com/");

    /*By idLocator = By.id("signinLink");
    WebElement elementId = driver.findElement(idLocator);
    elementId.click();*/

    driver.findElement(By.linkText("Sign in")).click();

    driver.findElement(By.name("email")).sendKeys("Wrong@gmail.com");

    driver.findElement(By.name("password")).sendKeys("123456789");

    driver.findElement(By.id("loginBtn")).click();
    Thread.sleep(2000);
    String errorText = driver.findElement(By.className("error")).getText();
    System.out.println(errorText);
    Thread.sleep(2000);
    driver.quit();
}

}
