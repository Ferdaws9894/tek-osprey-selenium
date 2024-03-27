package tek.selenium.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementUseFullMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /* We have a Method which checks if a button is Enabled or Disabled! This is a very curial step to take as a Tester to ensure that users are not able to login without a valid credential!
        * IF you click isEnabled() and isDisabled() Method, you will notice that it is returning a Boolean as a return type which means it has to be store in somewhere, or we can simply print it out!
        * The step below shows how we initialized then print! And also it can be written as such directly to the sout to print it into the console: System.out.println(loginBtnElement.isEnabled()); */
        driver.findElement(By.linkText("Sign in")).click();
        WebElement loginBtnElement = driver.findElement(By.id("loginBtn"));
        boolean isEnabled = loginBtnElement.isEnabled();
        System.out.println("IS Button Enabled: " + isEnabled);

        driver.findElement(By.name("email")).sendKeys("StupidJohn@gmail.com");
        driver.findElement(By.name("password")).sendKeys("John123454");

         /* .isEnabled(); & .isDisabled();
            Now we have to Locate the element again! We can use the previous "WebElement loginBtnElement",
            But it is not a proper way! The proper way is to the process again since the state of element has changed from disabled to enable! This time we have wrote all in one line */

        boolean isLoginEnabled = driver.findElement(By.id("loginBtn")).isEnabled();
        System.out.println("IS Button Enabled: " + isLoginEnabled);

         /* .isDisplayed();
                We also have another Method() = .isDisplayed() which is usually used for image, logo etc... The way we valid those images or logos etc.. by the use of .isDisplayed() Method!
                This is also has a return type which is boolean */

        boolean isDisplayed = driver.findElement(By.id("loginBtn")).isDisplayed();
        System.out.println("Is Button Displayed: " + isDisplayed);


        driver.quit();
    }
}
