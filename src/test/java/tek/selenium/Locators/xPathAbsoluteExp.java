package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathAbsoluteExp {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By xpathLocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/h1");
        WebElement xpathElement = driver.findElement(xpathLocator);
        String title = xpathElement.getText();
        System.out.println(title);



        driver.quit();
    }
}
