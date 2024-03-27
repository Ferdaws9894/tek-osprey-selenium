package tek.selenium.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectExp {

    /*
    from https://retail.tekschool-students.com/selenium/dropdown
    Select your country drop down we select the United States.
 */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        By countryLocator = By.name("country");
        WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(countryLocator));

        Select countrySelect = new Select(nameElement);
        countrySelect.selectByIndex(2);

//        countrySelect.selectByValue("Afghanistan"); // we have this option available to select from!

//        countrySelect.selectByVisibleText("Afghanistan"); // we have this option available to select from!

//         How can we select the first Value by the use of "index" method? || Answer: We can mention the first Index which is '0' to retrieve the first value.
        countrySelect.selectByIndex(0);
        /* Quesion: How can we Select the last value by the use of "Index" method?
           Answer: The "Select" class has a method "getOptions()" which is the drop down of all the options, and this is a "List of WebElement" which mean we have to import the "List<Element>"
                   Full Syntax = List<WebElement> options = countrySelect.getOptions(); and how can I read this line of code??
                   getOptions() = is a collection which it returns a WebElement for that options
        */
        List<WebElement> options = countrySelect.getOptions();
        System.out.println(options.size()); // This will display the length of list!
        countrySelect.selectByIndex(options.size()-1); // This line of code will select the last element from the dropdown || remember n-1 for index!

        // If you wanted to see what option is available for you in that country drop down menu? || we use simple For loop which will loop through all the elements and with the option.gettext()
        //  method which returns a String, so placing it inside a "sout" it will print all the available Options in the console!
        for (WebElement option : options){
            String text = option.getText();
            System.out.println(text);

            // Since gettext() method is returning a String, we can directly call it inside "sout" for the sake of simplicity as such:  System.out.println(option.getText());! The above is with details!
        }

        driver.quit();






    }
}
