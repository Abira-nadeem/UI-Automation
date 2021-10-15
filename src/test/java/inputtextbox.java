import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class inputtextbox {

    public static void main(String[] args)throws Exception{
        //WebDriverManager helps to automate the browser setup in the Selenium code
        WebDriverManager.chromedriver().setup();

        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriver driver = new ChromeDriver();

        //opening url
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //maximizing screen;
        driver.manage().window().maximize();

        //defining path of the element and writting data inside --
        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("john");

        //defining path of the element and writting data inside --
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("doe");

        //a short pause
        Thread.sleep(10);

        //defining path of the element and writting data inside --
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("12345");

        // again a short pause
        Thread.sleep(10);

        //defining path of the element and writting data inside --
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("US");

        //defining path of the element and writting data inside --
        driver.findElement(By.id("RESULT_TextField-5")).sendKeys("aspen");

        //defining path of the element and writting data inside --
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("qwe@test.com");

        //suspending the execution for a specific time --
        Thread.sleep(10);

        //ending session --
        driver.quit();
















    }
}
