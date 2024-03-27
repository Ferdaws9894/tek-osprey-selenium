package tek.selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepWaitExp {

    /*
    Login to Retail app with your account
    Then in the Accessories section add first keyboard to Cart
    and go to Cart and make sure there is 1 item there
    and delete it then print the text "Your shopping cart is Empty"
    */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");


        //NOTE: "Thread.Sleep()" is used to pause the execution of Selenium! So the Web page is loaded before navigating to the next step! Otherwise, we will get "No Such Element Found"

        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dummy2@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ferdaws123456789$");
        driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='Accessories']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='products__layout'][2]/img[@class='image']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button#addToCartBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div#cartBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span.cart__item-delete")).click();
        Thread.sleep(2000);
        String shopTitle = driver.findElement(By.cssSelector("h1.cart__empty-title")).getText();
        System.out.println(shopTitle);
        Thread.sleep(2000);
        driver.quit();




    }
}
