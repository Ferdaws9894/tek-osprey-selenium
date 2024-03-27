package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsActivity2 {

    // Navigate to "https:\\retail.tekschool-student.com/"
    // click on the sign in || Enter username: wrong@gmail.com && enter password:1231234 than click on login!
    //When you enter a wrong username and password


    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By idLocator = By.id("signinLink");
        WebElement elementId = driver.findElement(idLocator);
        elementId.click();

        By emailLocator = By.name("email");
        WebElement elementEmail = driver.findElement(emailLocator);
        elementEmail.sendKeys("wrong@gmail.com");

        By pasLocator = By.name("password");
        WebElement elementPass = driver.findElement(pasLocator);
        elementPass.sendKeys("1231234");

        By loginLocator = By.id("loginBtn");
        WebElement elementLogin = driver.findElement(loginLocator);
        elementLogin.click();
//      Threat.sleep is from Java not Selenium which will hold the execution for amount of milliseconds, since we pass 1000 it means 1000 milliseconds one Second,
//          so it will wait for one second and then continue the executions. || We are going to place this inside of Try and catch and has to mentioned right before the blog of code where issue exists.
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        By errorLocator = By.className("error");
        WebElement elementError = driver.findElement(errorLocator);
        String errorMessage = elementError.getText();

        System.out.println(errorMessage);

        driver.quit();





    }
}
