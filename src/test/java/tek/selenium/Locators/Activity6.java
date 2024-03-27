package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

    /*In Retail App Click on Computer section, then click on first keyboard and print that title!*/

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(5000);
        By xpathLocator = By.xpath("//img[@alt='Accessories']");
        WebElement xpathElement = driver.findElement(xpathLocator);
        xpathElement.click();

        Thread.sleep(5000);
        By xpathLocator1 = By.xpath("//div[@class='products__layout'][2]/img[@class='image']");
        WebElement xpathElement1 = driver.findElement(xpathLocator1);
        xpathElement1.click();

        Thread.sleep(4000);
        By xpathLocator2 = By.cssSelector("h1.product__name");
        WebElement xpathElement2 = driver.findElement(xpathLocator2);
        String title = xpathElement2.getText();
        System.out.println(title);

        Thread.sleep(4000);
        driver.quit();

    }
}
