import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //precvicenie drop-downs
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click(); // klik na sipku pri Passengers/Adults
            Thread.sleep(2000L); // pockame

        int i=1;
    while(i<5){
        driver.findElement(By.id("hrefIncAdt")).click(); //klik 4x na adult passenger
        i++;
    }
        driver.findElement(By.id("btnclosepaxoption")).click(); // klik na button Done
    }
}