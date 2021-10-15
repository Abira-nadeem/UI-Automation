import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

    public static void main(String[] args) throws Exception {

        //WebDriverManager helps to automate the browser setup in the Selenium code
        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //opening url
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //maximizing the screen--
        driver.manage().window().maximize();

        //webdriver in selenium provides some basic navigation commands;

        //to refresh --
        driver.navigate().refresh();

        //to move the page backwards--
        driver.navigate().back();

        //to move the page forward --
        driver.navigate().forward();

        //printing a message
        System.out.println("refresh,back,forward");


        //ending session --
        driver.quit();

    }

}
