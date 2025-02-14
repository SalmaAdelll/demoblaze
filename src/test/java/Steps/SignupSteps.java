package Steps;

import Pages.Signup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignupSteps {

    Signup signup = new Signup();



    @Given("User navigate to Demoblaze website")
    public void User_navigate_to_Demoblaze_website()

    {
        Signup.Openbrowser();
    }

    @When("user click on signup button")
    public void User_click_on_signup_button() throws InterruptedException
    {
        signup.SignUp_button().click();
    }

    @And("user Enter username address {string}")
    public void user_Enter_username_address(String email) throws InterruptedException
    {
      // نقل الData من هنا لل runner
        signup.username().sendKeys(email);
    }
    @And("user Enter Password {string}")
    public void user_Enter_Password(String Password) throws InterruptedException
    {
        signup.password().sendKeys(Password);
    }
    @And("User clicks the Sign up button")
    public void User_click_Sign_up_button() throws InterruptedException
    {
        signup.Sign_up_button().click();
    }
    @Then("web will show Success signup website {string}")
    public void web_will_show_Success_signup_website(String expectedMessage) throws InterruptedException {
        String actualMessage = String.valueOf(signup.getSignUpAlertMessage());
        Assert.assertEquals(expectedMessage, actualMessage);


    }

}

/*


@Given("User is on the Demoblaze homepage")
public void user_is_on_the_demoblaze_homepage() {
    // Navigate to Demoblaze homepage
}

@When("User clicks on the Sign Up button")
public void user_clicks_on_the_sign_up_button() {
    // Click Sign Up button
}

@When("User enters username {string} and password {string}")
public void user_enters_username_and_password(String username, String password) {
    // Enter username and password
}

@When("User clicks the Sign Up button")
public void user_clicks_the_sign_up_button() {
    // Click Sign Up button in the form
}

@Then("A success message {string} should be displayed")
public void a_success_message_should_be_displayed(String message) {
    // Verify success message
}
//
public class SignUpPage {
    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton() {
        driver.findElement(By.id("signup-button")).click();
    }

    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);
    }

    public String getSuccessMessage() {
        return driver.findElement(By.id("success-message")).getText();
    }
}
*/







