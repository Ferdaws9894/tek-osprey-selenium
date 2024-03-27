package tek.selenium.intro;

import org.openqa.selenium.chrome.ChromeDriver;


public class ActivityNumberOne {

    //With Chrome browser navigate to https://facebook.com

    public static void main(String[] args) {
        // Creating an object of a
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://facebook.com");

        // How to close the browser
        // Quit is a method to close the entire browser
        chromeDriver.quit();
        // Close is a method to close current tab
        chromeDriver.close();


    }
}
