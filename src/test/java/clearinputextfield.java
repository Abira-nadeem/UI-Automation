import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearinputextfield {

    public static void main (String[] args) throws InterruptedException {
        //WebDriverManager helps to automate the browser setup in the Selenium code
        WebDriverManager.chromedriver().setup();

        //here we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
       WebDriver driver = new ChromeDriver();

        //opening the website
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //defining the path of element and storing it in the variable of webelement type --
       WebElement firstname = driver.findElement(By.id("RESULT_TextField-1"));

       //entering the data
       firstname.sendKeys("john");

       //suspending the execution for a specified time--
       Thread.sleep(3000);

       //clearing the field
       firstname.clear();
    }
}
