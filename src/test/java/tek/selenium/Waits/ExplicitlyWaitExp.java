package tek.selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitlyWaitExp {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();  //Open a Chrome browser!
        driver.manage().window().maximize();    // Maximize the Webpage!
        driver.get("https://tek-retail-ui.azurewebsites.net/"); // Navigate to This URL!

        // Here we are using Implicitly Wait (Global Wait) instead of Thread.sleep!
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Here we are adding Explicitly Wait which has to be applied to each element we are trying to locate!
        // Point to remember! Every time we use Explicitly Wait we have to create an Object of that class!

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // We have to pass in two Parameter 1) The driver which we are using and 2) Duration of wait!|| Use the same amount time as Implicitly Wait!

        By signInLinkLocator = By.linkText("Sign in");
        WebElement signInElement = wait.until(ExpectedConditions.elementToBeClickable(signInLinkLocator));
        signInElement.click();
        // Also can be written as the following in one line of code:
        //WebElement signInElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();

        By emailLocator = By.name("email");
        WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(emailLocator));
        emailElement.sendKeys("dummy2@gmail.com");

        By passwordLocator = By.id("password");
        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        passwordElement.sendKeys("Ferdaws123456789$");

        By loginButton = By.id("loginBtn");
        WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginElement.click();

        By titleLocator = By.cssSelector("div.top-nav > a");
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(titleLocator));
        String titleText = titleElement.getText();
        System.out.println(titleText);


        driver.quit();

    }
}
