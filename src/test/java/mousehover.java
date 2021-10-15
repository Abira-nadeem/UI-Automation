import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mousehover {

    public static void main(String[] args)throws Exception{
        //WebDriverManager helps to automate the browser setup in the Selenium code
        WebDriverManager.chromedriver().setup();

        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriver driver = new ChromeDriver();

        //opening url
        driver.get("https://www.google.com/");

        //maximizing the screen --
        driver.manage().window().maximize();

        //defining path of the element and storing them in variables --
        WebElement Gm= driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
        WebElement Im =driver.findElement(By.xpath("//*[@id=\"gb\"]/d iv/div[1]/div/div[2]/a"));
        WebElement St= driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]"));

        //a short pause --
        Thread.sleep(5000);

        // To use the methods provided by the Actions class, we need to create an object of this
        // class and pass the driver as an argument.
        Actions act = new Actions(driver);
        act.moveToElement(Gm).moveToElement(Im).moveToElement(St).click().build().perform();



    }
}
