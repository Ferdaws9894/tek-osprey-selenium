package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityFour {

    public static void main(String[] args) {

        // Navigate to "https:\\retail.tekschool-students.com/selenium/inputs" and fill up form (except range)!

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/inputs");

        By textLocator = By.name("text");
        WebElement searchTextElement = driver.findElement(textLocator);
        searchTextElement.sendKeys("Ferdaws");

        By emailLocator = By.name("email");
        WebElement searchEmailElement = driver.findElement(emailLocator);
        searchEmailElement.sendKeys("Ferdaws.sekander@gamil.com");

        By passLocator = By.name("password");
        WebElement searchPassElement = driver.findElement(passLocator);
        searchPassElement.sendKeys("Ferdaws1234!");

        By dateLocator = By.name("date");
        WebElement searchDateElement = driver.findElement(dateLocator);
        searchDateElement.sendKeys("12/20/1995");

        By numberLocator = By.name("number");
        WebElement searchNumberElement = driver.findElement(numberLocator);
        searchNumberElement.sendKeys("(571)-299-5482");

        driver.quit();


    }
}
