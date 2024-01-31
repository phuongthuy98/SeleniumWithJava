import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
    WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void getURL() {
        // go url
        System.setProperty("webdriver.chrome.driver","/Users/thuy/Documents/Automation/03Tools/chromedriver");
        driver.get("https://demoqa.com/");
        // maximize man hinh
        driver.manage().window().maximize();
        //scroll man hinh
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // zoom man hinh
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("document.body.style.zoom = '50%'");
        // click element
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        // click vao menu textbox
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
    }
}
