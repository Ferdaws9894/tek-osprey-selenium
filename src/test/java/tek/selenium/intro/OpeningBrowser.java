package tek.selenium.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

    public static void main(String[] args) {

//  Opening Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https:\\google.com");
//  Chain of method will maximize open browser
        chromeDriver.manage().window().maximize();
//  This method is returning String and its tab title of an application.
        String tabTitle = chromeDriver.getTitle();
        System.out.println(tabTitle);

    }

}
