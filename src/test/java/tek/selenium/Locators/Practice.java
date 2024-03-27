package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        By searchName = By.name("email");
        WebElement nameElement = driver.findElement(searchName);
        nameElement.sendKeys("Johnathan.james@gmail.com");

        By nameLocator = By.name("pass");
        WebElement name2Element = driver.findElement(nameLocator);
        name2Element.sendKeys("123456789");

        By loginLocator = By.name("login");
        WebElement loginElement = driver.findElement(loginLocator);
        loginElement.click();

        driver.close();






    }
}
