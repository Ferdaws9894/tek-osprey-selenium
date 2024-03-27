package tek.selenium.Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleIFrame {

    /* What is an iFrame? An iFrame is referring to an HTML inside another HTML. Which is not common in modern Apps, but important to know for an interview!
        We can have different Types of iFrames:
        1) Main HTML(Main iFrame) --> Multiple Children(Many children iFrame)
        2) Inside"Main HTML page" we have "Child HTML iFrame" and inside that we have "GrandChild iFrame. || iFrame in general referring to child HTML.
         Main KeyWord to remember about iFrame
         1) When we have Child iFrame(Child HTML) inside the main iframe(Main HTML), we MUST switch to the "Child iFrame" to locate the element of that page.
         2) Vice versa, Once we are done on that iFrame, we Must change it back to the Main IFrame(Main HTML) to access all the Elements in the main Iframe.
         What is the syntax of iFrame?
         1) When we switch to ""iFrame from Main page"", we use the following Syntax: driver.switchTo().frame(frameElement); || keep in mind that Frame returning(Parameter) A "WebDriver"
         2) To switch back to the "Main page" we use the following: driver.switchTo().defaultContent(); || for return you dont need any parameter!
         NOTE: When you switch from "Main Page" to an "iFrame" and try to look for element of the "Main Page", you will receive "no such element found error message!"
       */

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/iframe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//  This is element is inside the Main page and we are locating it with CSS Selector, and printing the title of the element!
        String titleText = driver.findElement(By.cssSelector("p#title")).getText();
        System.out.println(titleText);

//  Here we are merging in to an iFrame from the Main page with use of xPath to locate the iframe!
//      When we use ".switchTo().frame(parameter);" it does require a parameter which is a WebDriver!
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
        driver.switchTo().frame(frameElement);

//  This element is inside another HTML or iframe.
//      Here we have located the title of the iFrame and storing it inside a String value and print!
        String titleText2 = driver.findElement(By.xpath("//h1[@class='font-bold text-2xl']")).getText();
        System.out.println(titleText2);

//  Switching back to the Main page from iFrame!
        driver.switchTo().defaultContent();

//  Here same as step one With use of CSS selector we are testing to see if we have successfully revert to Main Page from iFrame.
        String titleText3 = driver.findElement(By.cssSelector("p#title")).getText();
        System.out.println(titleText3);

//  We are closing the driver!
        driver.quit();



    }
}
