import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class testng {

    //making a global variable with webdriver interface
     WebDriver driver;

     //TestNG Before and After annotations are mainly used to execute a certain
// set of code before and after the execution of test methods.
    @BeforeTest
    public void setup() {
        //WebDriverManager helps to automate the browser setup in the Selenium code
        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //opening url --
        driver.get("https://www.google.com/");
    }
        @Test
        public void method(){

        //maximizing the screen --
        driver.manage().window().maximize();

        //listing out the options
        List<WebElement> list = driver.findElements(By.tagName("div"));

        //printing the size of options --
       System.out.println(list.size());

       //using for loop to print all the options --
       for(WebElement ls: list){

           System.out.println(ls.getText());
       }
    }
    @AfterTest
    public void method1(){

        //ending session--
        driver.quit();
    }
}
