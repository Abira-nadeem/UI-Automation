import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

    public static void main(String[] args) {

        //WebDriverManager helps to automate the browser setup in the Selenium code
        WebDriverManager.chromedriver().setup();

        //here we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriver driver = new ChromeDriver();

        //opening the url --
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //maximizing the screen --
        driver.manage().window().maximize();

        //now using select class to make a new object and passing the path of webelement inside--
        Select drp = new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));

        //selecting the option --
        drp.selectByVisibleText("Evening");

    }

}
