package tek.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExp {

    // Question: 1, Navigate to google.com, 2, Type something in the search bar 3, click on the Google Search-Button 4, Close the browser!

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

       /* Thread.sleep(2000);
        By xPathLocator = By.xpath("//textarea[@class='gLFyf']");
        WebElement xPathElement = driver.findElement(xPathLocator);
        xPathElement.sendKeys("What is the answer for the following: 2+2/2?");*/

        Thread.sleep(3000);
        By xPathLocator1 = By.xpath("//button[@id='hamburgerBtn']");
        WebElement xPathElement1 = driver.findElement(xPathLocator1);
        xPathElement1.click();

        Thread.sleep(3000);
        By xPathLocator2 = By.xpath("//div[@data-id='1']/span");
        WebElement xPathElement2 = driver.findElement(xPathLocator2);
        xPathElement2.click();

        Thread.sleep(3000);
        By xPathLocator3 = By.xpath("//div[@data-id='7']/span");
        WebElement xPathElement3 = driver.findElement(xPathLocator3);
        xPathElement3.click();

        Thread.sleep(3000);
        By xPathLocator4 = By.xpath("//div[@data-id='16']/p[@class='products__company']");
        WebElement xPathElement4 = driver.findElement(xPathLocator4);
        String title = xPathElement4.getText();

        System.out.println(title);

        Thread.sleep(3000);
        By xPathLocator5 = By.xpath("//div[@class='top-nav']/a");
        WebElement xPathElement5 = driver.findElement(xPathLocator5);
        xPathElement5.click();

        Thread.sleep(1000);
        By idLocator = By.id("signinLink");
        WebElement idElement = driver.findElement(idLocator);
        idElement.click();

        Thread.sleep(1000);
        By partialLinkTextLocator = By.linkText("Create New Account");
        WebElement partialLinkTextElement = driver.findElement(partialLinkTextLocator);
        partialLinkTextElement.click();

        Thread.sleep(1000);
        By signupName = By.id("nameInput");
        WebElement signupNameElement = driver.findElement(signupName);
        signupNameElement.sendKeys("Ferdaws");

        Thread.sleep(1000);
        By signupEmail = By.id("emailInput");
        WebElement signupEmailElement = driver.findElement(signupEmail);
        signupEmailElement.sendKeys("Ferdaws.sekander18@gmail.com");

        Thread.sleep(1000);
        By signupPassword = By.xpath("//input[@name ='password']");
        WebElement signupPasswordElement = driver.findElement(signupPassword);
        signupPasswordElement.sendKeys("Ferdaws123456789$");

        Thread.sleep(1000);
        By signupConfPassword = By.xpath("//input[@name ='confirmPassword']");
        WebElement signupConfPasswordElement = driver.findElement(signupConfPassword);
        signupConfPasswordElement.sendKeys("Ferdaws123456789$");

        Thread.sleep(1000);
        By signUp = By.id("signupBtn");
        WebElement signUpElement = driver.findElement(signUp);
        signUpElement.click();




        Thread.sleep(2000);
        driver.quit();



        //div[@data-id='16']/p[@class='products__company']
        //div[@class='glue-header__container glue-header__container--linkbar']//a[@title='Overview']
    }
}
