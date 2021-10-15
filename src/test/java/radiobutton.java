import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

    public static void main(String[] args)throws Exception {

        //WebDriverManager helps to automate the browser setup in the Selenium code
        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //opening url --
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //maximizng screen --
        driver.manage().window().maximize();

        //defining path of the element and storing it in a variable  --
        WebElement choices =  driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));

        //a short suspension of execution --
        Thread.sleep(10);

        //printing the outcome --
        System.out.println(choices.isDisplayed());
        System.out.println(choices.isEnabled());

        //performing click action --
        choices.click();

        //ending session --
        driver.quit();



    }

}
