package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UseTagNameLocatorTwo {


    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium");

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

        System.out.println(linkElements.size());

        for (WebElement element : linkElements) {
            String text = element.getText();
            System.out.println(text);
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
