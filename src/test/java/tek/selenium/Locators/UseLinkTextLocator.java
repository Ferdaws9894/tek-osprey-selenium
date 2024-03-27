package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseLinkTextLocator {

    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com");

       Thread.sleep(3000);  // 3 second wait
       By sportLinkLocator = By.linkText("Sport");
       WebElement sportLinkElement = driver.findElement(sportLinkLocator);
       sportLinkElement.click();

        Thread.sleep(3000);
       By homeLinkLocator = By.linkText("Home");
       WebElement homeLinkElement = driver.findElement(homeLinkLocator);
       homeLinkElement.click();

       Thread.sleep(3000);
       driver.quit();





    }

}
