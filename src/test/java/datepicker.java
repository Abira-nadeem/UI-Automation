import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datepicker {

    public static void main(String[] args) throws Exception {

        //declaration of variables
        String my = "October 2021";
        String day = "16";

        //WebDriverManager helps to automate the browser setup in the Selenium code
        WebDriverManager.chromedriver().setup();

        //here we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface--
        WebDriver driver = new ChromeDriver();

        //opening the site
        driver.get("https://www.hotels.com/");

        //defining the paths to elements and storing it in the webelement type variable --
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[1]/div/div[2]/button/span[1]"));

        //performing click action --
        btn.click();

        // for printing the data inside textfield--
        String text= driver.findElement(By.xpath("//h2[contains(text(),'October 2021')]")).getText();
        System.out.println(text);

        //defining the path of selected date and performing click action --
        driver.findElement(By.xpath("//body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[3]/td[7]/button[1]")).click();
        System.out.println(day +" "+my);

    }

}
