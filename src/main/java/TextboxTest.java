import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxTest {
    public void submitSuccessfully() {

        // go url
        // click element
        // click vao menu textbox
        // input data
        // click submit

        System.setProperty("webdriver.chrome.driver","/Users/thuy/Documents/Automation/03Tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();

    }
}