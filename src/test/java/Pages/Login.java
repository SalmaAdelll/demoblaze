package Pages;

import Steps.Hooks;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.Duration;

public class Login {
    static WebDriver driver = Hooks.driver;


    public static void Openbrowser() {
        driver.get("https://demoblaze.com/");
    }
    public void Maxmize() {
        driver.manage().window().maximize();
    }


    public WebElement Login_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"login2\"]"));
    }


    public WebElement Email() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"loginusername\"]"));
    }


    public WebElement pass() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
    }


    public WebElement Login_Button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
    }


    public WebElement Products_Button() throws InterruptedException {
            Thread.sleep(5000);
            return driver.findElement(By.xpath("//a[text()='Laptops']"));
        }
    public WebElement First_product() throws InterruptedException {
        Thread.sleep(15000);
        return driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));

    }

    public WebElement Add_First_product() throws InterruptedException {
        Thread.sleep(15000);
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

    }

    public WebElement back () throws InterruptedException {
        Thread.sleep(5000);

        return null;
    }

    public WebElement Click_Home() throws InterruptedException {
        Thread.sleep(15000);
        return driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));

    }
    public WebElement Second_product() throws InterruptedException {
        Thread.sleep(15000);
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a')]"));

    }

    public WebElement Add_Second_product() throws InterruptedException {
        Thread.sleep(15000);
        return driver.findElement(By.xpath("//a[text()='Add to Cart']"));

    }

    public WebElement Cart_Button() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
    }


public String getFisrtProductMessage() throws InterruptedException {
        Thread.sleep(5000);
        String ExpectedMessageforFirstProduct = String.valueOf((By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[2]")));
        // Close the alert
        return ExpectedMessageforFirstProduct;
    }
    public String getSecondProductMessage() throws InterruptedException {
        Thread.sleep(5000);
        String ExpectedMessageforSecondProduct = String.valueOf((By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[2]")));
        // Close the alert
        return ExpectedMessageforSecondProduct;
    }

    }

