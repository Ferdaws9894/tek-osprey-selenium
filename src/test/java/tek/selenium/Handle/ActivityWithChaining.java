package tek.selenium.Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityWithChaining {

      /*
    Login to Retail app with your Credentials
    Then navigate to Account and update phone number
    Click update and make toast is displayed.
    your output should be true.
 */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("dummy2@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Ferdaws123456789$");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("accountLink"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personalPhoneInput"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personalPhoneInput"))).sendKeys("5712458879"); // Since we are updating the phone#, we must change it in every run!
        wait.until(ExpectedConditions.elementToBeClickable(By.id("personalUpdateBtn"))).click();
        boolean popUpMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify']/div"))).isDisplayed();
        System.out.println("Message display result: " + popUpMessage);

        driver.quit();



    }

}
