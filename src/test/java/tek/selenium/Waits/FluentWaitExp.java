package tek.selenium.Waits;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitExp {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /* NOTE: The FluentWait is mainly used for application which are extremely slow and need more wait time to execute, se we used the FluentWait to configure the poll interval.
        * FluentWait = WebDriver that implement Wait interface! Also, it is another type of Explicitly Wait
        * <WebDriver> = What type of driver is being implemented the WebDriver interface which in this case is Chrome!
        * Wait = is the new we have assigned for the instance of the class!
        * new FluentWait<>(driver) = Creating new instance of FluentWait with the Driver Object!
        *  pollingEvery(Duration.ofMillis(1000) = This method specifies the polling interval(How often the FluentWait should check for the condition) here is set to 1 which mean poll every 1 second!
        * withTimeout(Duration.ofSeconds(20)) = This method specifies the maximum amount of time to wait for the condition to be met. In this case, it's set to wait for a maximum of 20 seconds.
        * ignoring(NoSuchElementException.class) = Fluent will ignore the Exception for the amount time that has been configure!
        *  */
        FluentWait<WebDriver> wait = new FluentWait<>(driver).pollingEvery(Duration.ofMillis(1000)).withTimeout(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class);

    }
}
