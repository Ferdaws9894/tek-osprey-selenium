package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocatorActivityOne {

    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https:\\google.com");

        // Steps to find element with selenium!
        // Step 1)  Locate the element using 1 of 8 locators.
                /*In Selenium we use "By" which is an Class and it returns us the name we pass in */
        By searchLocator = By.name("q");

        // Step 2) Find the element with Driver and Locator.
                /* WebElement is an Interface with helps us locate the element with the use one it method which is .findElement(String)*/
        WebElement searchElement = chrome.findElement(searchLocator);

        // Step 3) perform actions to element.
        searchElement.sendKeys("TekSchool");

        // Step 4) Close the website!
        chrome.quit();

    }
}
