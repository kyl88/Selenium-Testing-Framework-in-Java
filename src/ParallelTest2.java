import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest2 {

    WebDriver driver;

    void login(){

        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");

        driver= new ChromeDriver();

        driver.get("https//:opensource-demo.orangehrmlive.com");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");


    }
}
