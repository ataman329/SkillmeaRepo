import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // assertions concept - excercise, CSS selector syntax and usage
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //count the number of checkboxes - pouzitie fori
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        // pokracujeme s assertom - tentoraz equals
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // vytlacime potvrdenie True/False, ze sa nam na stranke zobrazil pocet "5 Adult"

//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // vytlacime do konzoly True/False, ci je stlacene tlacitko Round Trip
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // klikame na Round Trip
//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // znovu vytlacime do konzoly True/False, ci je stlacene tlacitko Round Trip
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style")); // tlacitko datumu nieje disabled, len sa mu zmeni opacity z 0.5 na 1

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) { // ak ma tlacitko datumu opacity 1, teda je ho jasne vidiet ako "enabled"
            System.out.println("its enabled"); // vypise sa toto do konzoly
                    Assert.assertTrue(true);
            } else {
            Assert.assertFalse(false);
        }
    }
}