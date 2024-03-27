package tek.selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Project {

    public static void main(String[] args) {

        // Drag Drop!

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/drag-drop");

        By drag = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[1]/div/div/div[1]");
        WebElement dragElment = driver.findElement(drag);

        By drop = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[2]/div/div");
        WebElement dropElement = driver.findElement(drop);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElment,dropElement).perform();

    }
}
