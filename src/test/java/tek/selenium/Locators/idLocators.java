package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocators {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/inputs");


        By idLocator = By.id("textInput");
        WebElement element = driver.findElement(idLocator);
        element.sendKeys("Ferdaws");

    }
}
