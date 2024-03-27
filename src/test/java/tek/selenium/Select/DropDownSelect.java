package tek.selenium.Select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownSelect {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();  // Created instance(Object) of Chrome driver!
        driver.manage().window().maximize();    // Maximize the Chrome Browser!
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown"); // Navigate to the URL!
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Adding ImplicitlyWait(Global Wait) for the amount of 10 seconds!

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));  // Adding ExplicitlyWait for the amount of 10 seconds|| This is used for each to find each locator for 10 second before throw and error message!

        By languageLocator = By.name("language"); // With the use of BY locator, we are Locating an element By name!
        WebElement nameDDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(languageLocator)); // Adding condition for the visibility of an element which will wait for 10 sec! This is referring to Explicitly Wait!

        /* DropDowns:
                 * Most of the DropDown will have a tag name called "Select" in the HTML when you inspect!
                 * In Selenium, we have Three options for "Select" a value!
                       1) Visibly What we See and this the Method: .selectByVisibleText("Java");
                       2) Value This is assigned, and this is the Method: .selectByValue("Italian");
                       3) Index location and This is the Method: selectByIndex(4);
                 * Previously We would used the Click() = to click on a button, SendKey() = to input some String value, BUT in "DropDown" We are using "Select"
                 * In order to use "Select" we Must create and instance(Object) of the "Select" Class which does require a Constructor parameter of WebElement!
                 * Why does "Select" requires a "Constructor/Parameter" it uses that parameter to locate an element! So by passing WebElement as a parameter the Select class will be able to get to Element with the help of three methods mentioned above!
                 * This "Select" Class comes from selenium.support.ui
                 * */
        Select nameSelect = new Select(nameDDElement);
        nameSelect.selectByVisibleText("Java");

        By countryLocator = By.name("country");
        WebElement countryDDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(countryLocator));

        Select countrySelect = new Select(countryDDElement);
        countrySelect.selectByIndex(4);

        By idLocator = By.id("languageSelect");
        WebElement idDDElement = wait.until(ExpectedConditions.visibilityOfElementLocated(idLocator));

        Select idSelect = new Select(idDDElement);
        idSelect.selectByValue("Italian");

        Thread.sleep(2000);
        driver.quit();


    }
}
