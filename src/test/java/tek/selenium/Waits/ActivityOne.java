package tek.selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityOne {

    /* In the Retail App Click on Video Games, and then Click on the PS5 Console and then print the "PlayStation 5 Console which is the title of the section!*/

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

        //Implicitly Wait Input
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Importing Explicitly wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        By videoGameLocator = By.xpath("//img[@alt='Video Games']");
        WebElement videoGameElement = wait.until(ExpectedConditions.elementToBeClickable(videoGameLocator));
        videoGameElement.click();
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Video Games']"))).click(); // Chained way

        By playStationLocator = By.xpath("//img[@alt='PlayStation 5 Console']");
        WebElement playStationElement = wait.until(ExpectedConditions.elementToBeClickable(playStationLocator));
        playStationElement.click();
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='PlayStation 5 Console']"))).click(); // Chained way

        By productNameLocator = By.cssSelector("h1.product__name");
        WebElement productNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productNameLocator));
        String title = productNameElement.getText();
        System.out.println(title);
//         String title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.product__name"))).getText(); // Chained way
//         System.out.println(title);

        driver.quit();

    }
}
