import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

    public static void main(String[] args) throws Exception {

        //WebDriverManager helps to automate the browser setup in the Selenium code
        WebDriverManager.chromedriver().setup();

        //here we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface

        WebDriver driver = new ChromeDriver();

        //opening the url--
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //maximizing the screen
        driver.manage().window().maximize();

        //definning the path of webelement and performing click action--
        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td/label")).click();

        //suspending execution for a specified time--
        Thread.sleep(10);

        //defining the path of webelement and performing click action
        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label")).click();

        //printing the message
        System.out.println("options selected");

        //ending the session/exiting the browser;
        driver.quit();


    }

}
