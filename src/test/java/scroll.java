import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
    public static void main(String[] args) throws Exception {
        //WebDriverManager helps to automate the browser setup in the Selenium code
        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //openign url
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //maximzing the screen
        driver.manage().window().maximize();

       //Scrolling is a JavaScript method. The JavaScriptExecutor provides an interface that enables to
        // run JavaScript methods for Selenium scripts. Hence, to scroll up or down with Selenium,
        // a JavaScriptExecutor is a must
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //using the js object to exceute scroll action by pixels --
        js.executeScript("window.scrollBy(0,450)");

        //a short pause --
        Thread.sleep(2000);

        //ending session --
        driver.quit();


    }
}
