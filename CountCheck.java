import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CountCheck {

    @Test
    void testNGCheck() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://thedemosite.co.uk/");

        List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
        System.out.println(radio.size());

        List<WebElement> text = driver.findElements(By.xpath("//input[@type = 'text']"));
        System.out.println(text.size());

        List<WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println(image.size());
    }
}