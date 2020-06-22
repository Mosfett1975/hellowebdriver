import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloWebDriver {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org");
        Thread.sleep(2000);
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]"));
        searchInput.sendKeys("Hello there!");
        WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/div/img"));
        searchBtn.click();
        driver.quit();





    }
}
