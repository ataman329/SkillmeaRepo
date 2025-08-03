import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("Slo");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        // pouzitie enhanced cyklu skratka iter
        for (WebElement option : options) {
            // Slovakia (Slovak Republic) na stranke nefunguje
            if(option.getText().equalsIgnoreCase("Slovenia")){
                option.click();
                break;
            }
        }
    }
}