package tek.selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Review {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();  //Creating an instance of a Chrome Browser
        driver.manage().window().maximize();    //Maximizing the Chrome Driver page
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/radio");   //Getting to the following URL
//      ImplicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicitly wait is a global wait which means wait for 20 seconds before throwing Exception!
//      ExplicitlyWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Explicitly wait is another wait type which wait for specific amount of time locating an element before throw the Exception!

        By radioButtonLocator = By.linkText("Radio Button");
        WebElement radioButtonElement = wait.until(ExpectedConditions.elementToBeClickable(radioButtonLocator));
        radioButtonElement.click();
//  We can use chaining by shorten the code as the following!
//           WebElement radioButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Radio Button"))).click();
        By idLocator = By.id("css");
        WebElement idElement = wait.until(ExpectedConditions.elementToBeClickable(idLocator));
        idElement.click();
//          WebElement idElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("css"))).click();

        By phoneLocator = By.id("phone");
        WebElement phoneElement = wait.until(ExpectedConditions.elementToBeClickable(phoneLocator));
        phoneElement.click();
//           WebElement phoneElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("phone"))).click();

        By largeLocator = By.id("large");
        WebElement largeElement = wait.until(ExpectedConditions.elementToBeClickable(largeLocator));
        largeElement.click();
//          WebElement largeElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("large")));
        Thread.sleep(3000);     // This line of code will help us to see the areas where we automate!
        driver.quit();



    }
}
