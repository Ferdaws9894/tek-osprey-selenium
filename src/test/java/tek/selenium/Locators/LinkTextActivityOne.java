package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextActivityOne {

    /*
    Navigate to "https://retail.tekschool-student.com/selenium/"
    click on Input Link
    and print title ("Input")
    * */

    public static void main(String[] args) throws Exception{

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/");

        Thread.sleep(2000);  // 2 second wait
        By inputLinkLocator = By.linkText("Inputs");
        WebElement inputLinkElement = driver.findElement(inputLinkLocator);
        inputLinkElement.click();

        Thread.sleep(2000);  // 2 second wait
        By titleLocator = By.id("title");
        WebElement titleElement = driver.findElement(titleLocator);
        String titleText = titleElement.getText();

        System.out.println(titleText);

        Thread.sleep(2000);  // 2 second wait
        driver.quit();


    }
}
