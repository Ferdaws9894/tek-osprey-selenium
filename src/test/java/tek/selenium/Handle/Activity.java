package tek.selenium.Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity {

    /*
    Login to Retail app with your Credentials
    Then navigate to Account and update phone number
    Click update and make toast is displayed.
    your output should be true.
 */
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By signInLinkLocator = By.linkText("Sign in");
        WebElement signInElement = wait.until(ExpectedConditions.elementToBeClickable(signInLinkLocator));
        signInElement.click();

        By emailLocator = By.name("email");
        WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(emailLocator));
        emailElement.sendKeys("dummy2@gmail.com");

        By passwordLocator = By.id("password");
        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        passwordElement.sendKeys("Ferdaws123456789$");

        By loginButton = By.id("loginBtn");
        WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginElement.click();

        By account = By.id("accountLink");
        WebElement accountElement = wait.until(ExpectedConditions.elementToBeClickable(account));
        accountElement.click();

        By clearPhone = By.id("personalPhoneInput");
        WebElement clearPhoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clearPhone));
        clearPhoneElement.clear();

        By phoneNumber = By.id("personalPhoneInput");
        WebElement phoneNumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber));
        phoneNumberElement.sendKeys("5712458874");

        By update = By.id("personalUpdateBtn");
        WebElement updateElement = wait.until(ExpectedConditions.elementToBeClickable(update));
        updateElement.click();
        Thread.sleep(5000);

        By successfullyUpdate = By.xpath("//div[@class='Toastify']/div");
        boolean toastText = wait.until(ExpectedConditions.visibilityOfElementLocated(successfullyUpdate)).isDisplayed();
        System.out.println(toastText);

        driver.quit();





    }
}
