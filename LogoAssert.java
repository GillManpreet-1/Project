import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogoAssert {
    @Test
    public void testNGBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://thedemosite.co.uk/");
        String title= driver.getTitle();
        Assert.assertEquals("MySQL",title);

        WebElement logo=driver.findElement(By.xpath("/html/body/div[2]/center/strong/font"));
        Assert.assertTrue(logo.isDisplayed());
        driver.quit();
    }
}


