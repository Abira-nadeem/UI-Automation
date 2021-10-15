import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class dragndrop {

    public static void main(String[] args) throws Exception {
        //WebDriverManager helps to automate the browser setup in the Selenium code
        // Chrome Driver Setup
        WebDriverManager.chromedriver().setup();

        //here we are creating an instance of chromedriver() and storing it in a variable called driver
        // and ultimatley defining the type of variable as webdriver interface
        WebDriver driver = new ChromeDriver();

       //opening the url--
        driver.get("https://jqueryui.com/droppable/");

        //maximizing the screen--
        driver.manage().window().maximize();


        ////defining the path of the iframe ans string it in a variable--
        WebElement frame =  driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));

       //driver.switchto() method allows the users to switch to a particular frame--
        driver.switchTo().frame(frame);

       //definning paths of elements and  storing them in variables
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop =  driver.findElement(By.id("droppable"));

        // To use the methods provided by the Actions class, we need to create an object of this
        // class and pass the driver as an argument--
        Actions act = new Actions(driver);

        //drag and drop action from act object
       act.dragAndDrop(drag,drop).perform();


    }

}
