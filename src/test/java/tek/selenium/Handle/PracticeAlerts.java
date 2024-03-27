package tek.selenium.Handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class PracticeAlerts {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//  First, we locate the Element using the 8 Locator!
        wait.until(ExpectedConditions.elementToBeClickable(By.id("alertBtn"))).click();
        /* To handle Popups in Selenium, we have a class called Alert which is an interface!
           Alert will require us to Explicitly Wait to pause the alert
           Although, we cant inspect most of the POPups, but the Alert Class give us some ability or method to select ok, cancel or get the text of that alert
           Useful Alert Methods:
           1) We can get the print the title of the Alert by the use of .getText() which return a String!
           2) We can use the Accept() method to accept(ok) the alert!
           3) We can use the Dismiss() method to cancel the alert!
           NOTE: When Setting up the exception for the Alert, You want to make sure that we use .alertIsPresent()
           */
//  alertBtn || Once it is Located, we are using the Alert Class which comes from Selenium to get the text, select ok/cancel or send text in the box to the alert!
        Alert alertButton = wait.until(ExpectedConditions.alertIsPresent());
        String alertTitle = alertButton.getText();
        System.out.println(alertTitle);
        alertButton.accept();
//  First, we locate the Element using the 8 Locator!
        wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmBtn"))).click();
//  confirmBtn || Once it is Located, we are using the Alert Class which comes from Selenium to get the text, select ok/cancel or sending text in the box to the alert!
        Alert confirmButton = wait.until(ExpectedConditions.alertIsPresent());
        String configureTitle = confirmButton.getText();
        System.out.println(configureTitle);
        alertButton.dismiss();
//  First, we locate the Element using the 8 Locator!
        wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBtn"))).click();
//  promptBtn || Once it is Located, we are using the Alert Class which comes from Selenium to get the text, select ok/cancel or sending text in the box to the alert!
        Alert promptButton = wait.until(ExpectedConditions.alertIsPresent());
        String promptTitle = promptButton.getText();
        System.out.println(promptTitle);
        promptButton.sendKeys("This Alert is for the Security purposes!");
        promptButton.accept();
//  Close all the browser!
        driver.quit();


    }
}
