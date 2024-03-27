package tek.selenium.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

   /* Question:  Open the browser maximize it and navigate to "https://retial.tekschool-studens.com/"
     And get title "React App" make sure title is correct.*/

    public static void main(String[] args) {
//  Creating an object of a Chrome driver which gives us the ability to open a Chrome browser for us!
        ChromeDriver chrome = new ChromeDriver();
//  This line of code will Return us the website we have requested! Remember Get() Method always return a value back.
        chrome.get("https://tek-retail-ui.azurewebsites.net");
//  This line of code we're asking maximizing the browser || We will learn later about manage() and Window() later.
        chrome.manage().window().maximize();
//  We are asking to return the title and since this will return a string value we have to store it in a String!
//      Than we are write an statement to check whether or not the title appear as asked in the question.
        String title = chrome.getTitle();
        if (title.equals("React App")){
            System.out.println(title);
        }else {
            System.err.println("Your title is not correct!"); // "err" will highlight the message in Red!
        }

        chrome.quit();
    }
}
