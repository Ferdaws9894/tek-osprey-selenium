package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExp {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Thread.sleep(6000);
        By locator = By.xpath("//textarea[@class='gLFyf']");
        WebElement element = driver.findElement(locator);
        element.sendKeys("How old is google?");

        Thread.sleep(6000);
        By locator1 = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
        WebElement element1 = driver.findElement(locator1);
        element1.click();

        Thread.sleep(6000);
        driver.quit();

    }
}
