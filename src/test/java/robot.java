import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class robot {

    public static void main(String[] args) throws Exception {
        //WebDriverManager helps to automate the browser setup in the Selenium code
        //later we r creating chromedriver(); instance and storing it in a variable called driver
        // and ultimatley definning the type of var as webdriver interface
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //opening url --
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //maximizng the screen --
        driver.manage().window().maximize();

        //A Robot class in Selenium is used to generate input events for test automation,
        // self-running demos, and other applications where you need control over the mouse and keyboard.

       //making new object of robot class
        Robot robot = new Robot();

        //perfoming down action --
        robot.keyPress(KeyEvent.VK_DOWN);

        //a short pause
        Thread.sleep(3000);

        //performing tab actions --
        robot.keyPress((KeyEvent.VK_TAB));

        // short pause
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);

        //short pause
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);

        //ending session --
        driver.quit();


    }

    }
