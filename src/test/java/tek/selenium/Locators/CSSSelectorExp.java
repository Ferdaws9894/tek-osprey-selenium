package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorExp {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        Thread.sleep(1000);
        By idLocator = By.id("signinLink");
        WebElement idElement = driver.findElement(idLocator);
        idElement.click();
        Thread.sleep(1000);
        By partialLinkTextLocator = By.linkText("Create New Account");
        WebElement partialLinkTextElement = driver.findElement(partialLinkTextLocator);
        partialLinkTextElement.click();
        Thread.sleep(1000);
        By signupName = By.id("nameInput");
        WebElement signupNameElement = driver.findElement(signupName);
        signupNameElement.sendKeys("Ferdaws");
        Thread.sleep(1000);
        By signupEmail = By.id("emailInput");
        WebElement signupEmailElement = driver.findElement(signupEmail);
        signupEmailElement.sendKeys("dummy2@gmail.com");
        Thread.sleep(1000);
        By signupPassword = By.xpath("//input[@name ='password']");
        WebElement signupPasswordElement = driver.findElement(signupPassword);
        signupPasswordElement.sendKeys("Ferdaws123456789$");
        Thread.sleep(1000);
        By signupConfPassword = By.xpath("//input[@name ='confirmPassword']");
        WebElement signupConfPasswordElement = driver.findElement(signupConfPassword);
        signupConfPasswordElement.sendKeys("Ferdaws123456789$");
        Thread.sleep(1000);
        By signUp = By.id("signupBtn");
        WebElement signUpElement = driver.findElement(signUp);
        signUpElement.click();
        Thread.sleep(2000);
        String nameTitle = driver.findElement(By.cssSelector("h1.account__information-username")).getText();
        System.out.println(nameTitle);
        Thread.sleep(2000);
        String emailTitle = driver.findElement(By.cssSelector("h1.account__information-email")).getText();
        System.out.println(emailTitle);
        Thread.sleep(2000);
        driver.quit();

    }
}
