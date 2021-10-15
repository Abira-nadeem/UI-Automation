import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

    public static void main(String[] args) throws Exception {
        //WebDriverManager helps to automate the browser setup in the Selenium code
        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //opening url
        driver.get("http://omayo.blogspot.com/");

        //screen size maximize--
        driver.manage().window().maximize();

        //defining path of the element and posting location of the file --
       driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\Humayun Khan\\Desktop\\Test.jpg");



    }

}
