package tek.selenium.Handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("promptBtn")).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        System.out.println(alertText);
        Thread.sleep(1000);
        alert.sendKeys("Entering your name");
        //Accept the Alert.
        alert.accept();
        //Cancel Alert
        Thread.sleep(1000);
//       alert.dismiss();

    }
}
