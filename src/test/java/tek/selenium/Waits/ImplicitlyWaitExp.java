package tek.selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitlyWaitExp {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();  //Open a Chrome browser!
        driver.manage().window().maximize();    // Maximize the Webpage!
        driver.get("https://tek-retail-ui.azurewebsites.net/"); // Navigate to This URL!

        // Here we are using Implicitly Wait (Global Wait) instead of Thread.sleep!
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("signinLink")).click(); // Click on SignIn button

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dummy2@gmail.com");  // Insert this key for username!

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ferdaws123456789$"); //Insert this key for Password!

        driver.findElement(By.xpath("//button[@id='loginBtn']")).click();   // Click on login button!

        driver.findElement(By.xpath("//img[@alt='Accessories']")).click(); // Click on Accessories!

        driver.findElement(By.xpath("//div[@class='products__layout'][2]/img[@class='image']")).click(); // Click on Keyboard!

        driver.findElement(By.cssSelector("button#addToCartBtn")).click(); // Add or click to add the item to the cart!

        driver.findElement(By.cssSelector("div#cartBtn")).click(); // Click on the cart!

        driver.findElement(By.cssSelector("span.cart__item-delete")).click(); // remove the item from the item from cart by clicking the delete!

        String shopTitle = driver.findElement(By.cssSelector("h1.cart__empty-title")).getText(); // When the item is removed, a message displays, capture the the title and store it in a string!
        System.out.println(shopTitle);  // print out the title name in the console!

        driver.quit();  // Close the Web browser!

    }
}
