package Steps;

import Pages.Login;
import Pages.Signup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static Steps.Hooks.driver;

public class LoginSteps {

    Login login = new Login();


    @Given("User navigate to Demoblaze website to login")
    public void User_navigate_to_Demoblaze_website_to_login() {
        login.Openbrowser();
    }

    @And("user can maximize page")
    public void user_can_maximize_page() {
        login.Maxmize();
    }

    @When("user click on Login button")
    public void user_click_on_Login_button() throws InterruptedException {
        login.Login_button().click();
    }

    @And("user enter username {string}")
    public void user_enter_email(String email) throws InterruptedException {
        login.Email().sendKeys(email);
    }

    @And("user enter Password {string}")
    public void user_enter_Password(String Password) throws InterruptedException {
        login.pass().sendKeys(Password);
    }

    @And("User click Login button")
    public void user_click_Login_button() throws InterruptedException {
        login.Login_Button().click();
    }

    @And("user choose and open products page")
    public void user_choose_and_open_products_page() throws InterruptedException {
        login.Products_Button().click();
    }


    @And("user can choose first product")
    public void user_can_choose_first_product() throws InterruptedException {
        login.First_product().click();
    }

    @And("user can add first product to the cart")
    public void user_can_add_first_product_to_the_cart() throws InterruptedException {
        login.Add_First_product().click();
    }



    @And("user can go back")
    public void user_can_go_back() throws InterruptedException {
        login.back();

        driver.navigate().back();

    }

    @And("user can Click Home")
    public void user_can_Click_Home() throws InterruptedException {
        login.Click_Home().click();
    }

    @And("user can choose second product")
    public void user_can_choose_second_product() throws InterruptedException {
        login.Second_product().click();
    }

    @And("user can add second product to the cart")
    public void user_can_add_second_product_to_the_cart() throws InterruptedException {
        login.Add_Second_product().click();
    }

    @And("user can open cart page")
    public void user_Can_Open_Cart_Page() throws InterruptedException {
        login.Cart_Button().click();
    }

    @Then("user can check first product name {string}")
    public void userCanCheckFirstProductName(String ExpectedMessageforFirstProduct) throws InterruptedException {
        String actualMessage = String.valueOf(login.getFisrtProductMessage());
        Assert.assertEquals(actualMessage, ExpectedMessageforFirstProduct);


    }

    @Then("user can check Second product name {string}")
    public void userCanCheckSecondProductName(String ExpectedMessageforSecondProduct) throws InterruptedException {
        String actualMessage = String.valueOf(login.getSecondProductMessage());
        Assert.assertEquals(actualMessage, ExpectedMessageforSecondProduct);

    }

    @Then("user can check Total {string}")
    public void userCanCheckTotal(String ExpectedMessageforTotal) throws InterruptedException {
        String actualMessage = String.valueOf(login.getSecondTotalAmount());
        Assert.assertEquals(actualMessage, ExpectedMessageforTotal);
    }

}