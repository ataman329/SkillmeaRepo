import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngularPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("Rahul Shetty");
        driver.findElement(By.name("email")).sendKeys("rahulshetty@academy.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("password123");
        driver.findElement(By.id("exampleCheck1")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[2]")).click(); // i dont know how to NOT use the second index :-)
        driver.findElement(By.xpath("//*[@id=\"inlineRadio1\"]")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01-07-2025");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}