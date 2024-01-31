import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.*;

public class TextboxTest extends Common{

    public void submitSuccessfully() {
        getURL();

        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        // input data
        driver.findElement(By.id("userName")).sendKeys("thuy");
        driver.findElement(By.id("userEmail")).sendKeys("thuy@mailsac.com");
        driver.findElement(By.id("currentAddress")).sendKeys("currentAddress");
        driver.findElement(By.id("permanentAddress")).sendKeys("permanentAddress");

        // click submit
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.id("submit")).click();
        //submit.click();

        //Get text hiển thị , So sánh với text nhập vào => giống nhau => pass
        //Get text: Name:fdsfa
        String originFullName = driver.findElement(By.id("name")).getText();
        String originEmail = driver.findElement(By.id("email")).getText();
        //Cắt chuỗi từ phải đến dấu ':'
        int index = originFullName.indexOf(":");
        String actualFullName = originFullName.substring(index + 1);
        int indexemail = originEmail.indexOf(":");
        String actualEmail = originEmail.substring(indexemail + 1);

        assertEquals(actualFullName, "thuy");
        assertEquals(actualEmail, "thuy@mailsac.com");
    }

    public void validEmail() {
        getURL();
        driver.findElement(By.id("userName")).sendKeys("thuy");
        driver.findElement(By.id("userEmail")).sendKeys("thuymailsac.com");
        driver.findElement(By.id("currentAddress")).sendKeys("currentAddress");
        driver.findElement(By.id("permanentAddress")).sendKeys("permanentAddress");

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.id("submit")).click();

        WebElement colorTextInputBox = driver.findElement(By.id("userEmail"));
        String actualColor = colorTextInputBox.getAttribute("class");
        String errorColor = "mr-sm-2 field-error form-control";
        System.out.println(actualColor);

        // Assert - TestNG : Compare actual vs expect
        assertEquals(actualColor, errorColor);
    }
}