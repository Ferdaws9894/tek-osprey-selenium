package tek.selenium.intro;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ActivityTwoOtherBrowser {

    public static void main(String[] args) {

        // Using Edge
        EdgeDriver edge = new EdgeDriver();
        edge.get("https:\\google.com");
       /*
        // Using FireFox
        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get("https:\\google.com");

        //Using Safari
        SafariDriver safari = new SafariDriver();
        firefox.get("https:\\google.com");*/

        // Closing browsers
        edge.close();
        /*firefox.close();
        safari.close();*/


    }
}
