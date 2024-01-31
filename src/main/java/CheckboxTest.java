import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class CheckboxTest extends Common{

    public void verifyCheckBoxCorrectly() {
        // go url
        getURL();
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        //driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
        driver.findElement(By.className("rct-checkbox")).click();
        driver.findElement(By.className("rct-collapse-btn")).click();

        String expedtedHome = "You have selected : home desktop notes " +
                "commands documents workspace react angular veu office public " +
                "private classified general downloads wordFile excelFile";
        String actualResultHome = "";
        List<WebElement> resultHome = driver.findElements(By.xpath("//div[@id='result']/span"));
        for (WebElement e : resultHome) {
            actualResultHome += e.getText() + " ";
        }

        // Assert - TestNG : Compare actual vs expect
        assertEquals(actualResultHome.trim(), expedtedHome);
    }
}
