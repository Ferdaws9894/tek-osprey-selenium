package tek.selenium.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecapForDropdown {

    /* Prompt:
        Navigate to Retail App With the use of the URL:"https://tek-retail-ui.azurewebsites.net/"
        Click On "Sign in" button then Click on "Video Games" under Electronic section
        then Click on "Xbox Series X" then Click on Quantity box and Select 5 of them then add it to th cart! */

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("GulKoko1620@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Kokojan1234$");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Video Games']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Xbox Series X']"))).click();
//  For this line of code, we have to store it in a "WebElement" since the dropdown will need to know from where you want me to select the element! Also the Select Class require a Web-element constructor!
        WebElement quantityElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select.product__select")));
        Select quantitySelect = new Select(quantityElement);
        quantitySelect.selectByVisibleText("5");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("addToCartBtn"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='top-nav__btn top-nav__cart']"))).click();
//  To retrieve an attribute from a Web App, we must store our condition in a WebElement which has to access to method .getAttribute().
//  .getAttribute() also has a String return type meaning it is returning a String which has to be stored inside a String or can be printed directly!
//  .getAttribute(name: "") this method comes with a parameter "name" which is referring to the Attribute of an element from the HTML DOM.
        WebElement cartItemQty = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.cart__item-quantity")));
        String itemQuantity = cartItemQty.getAttribute("value");
        System.out.println(itemQuantity);

        driver.quit();



    }
}
