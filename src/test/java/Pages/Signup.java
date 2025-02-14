package Pages;

import Steps.Hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {
    static WebDriver driver= Hooks.driver;

    public static void Openbrowser(){
        driver.get("https://demoblaze.com/");
    }

    public WebElement SignUp_button() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//*[@id=\"signin2\"]"));
    }


    public WebElement username() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//*[@id=\"sign-username\"]"));
    }



    public WebElement password() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//*[@id=\"sign-password\"]"));
    }


    public WebElement Sign_up_button() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
    }



    public String getSignUpAlertMessage() throws InterruptedException {
        Thread.sleep(10000);
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.accept(); // Close the alert
        return message;
    }

}
