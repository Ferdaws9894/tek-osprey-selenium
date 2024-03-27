package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UseTagNameLocator {

    public static void main(String[] args) throws Exception{

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        Thread.sleep(2000);

        // Looking for all <a></a> in HTML which are links
        By linkLocator = By.tagName("a");
        List<WebElement> linkElement = driver.findElements(linkLocator);

        System.out.println(linkElement.size());
        // Using Enhanced for loop

        for( WebElement element : linkElement){
            String text = element.getText();
            System.out.println(text);
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
