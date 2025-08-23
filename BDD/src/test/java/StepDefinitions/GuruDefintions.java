//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.demoguru;
//
//import pages.loginpage;
//import utils.DriverFactory;
//
//public class GuruDefintions 
//{
//	WebDriver driver = DriverFactory.getDriver();
//	demoguru regPage = new demoguru(driver);
//
//    @Given("the user is on the Registration page")
//    public void user_on_registration_page() throws InterruptedException {
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//        Thread.sleep(2000);
//    }
//
//    @When("the user enters first name {string} and last name {string}")
//    public void user_enters_first_and_lastname(String firstname, String lastname) throws InterruptedException {
//        regPage.enterFirstName(firstname);
//        regPage.enterLastName(lastname);
//    }
//
//    @When("the user enters phone {string}")
//    public void user_enters_phone(String phone) throws InterruptedException {
//        regPage.enterPhone(phone);
//    }
//
//    @When("the user enters email {string}")
//    public void user_enters_email(String email) throws InterruptedException {
//        regPage.enterEmail(email);
//    }
//
//    @When("the user enters address {string}")
//    public void user_enters_address(String address) throws InterruptedException {
//        regPage.enterAddress(address);
//    }
//
//    @When("the user enters city {string}")
//    public void user_enters_city(String city) throws InterruptedException {
//        regPage.enterCity(city);
//    }
//
//    @When("the user enters state {string}")
//    public void user_enters_state(String state) throws InterruptedException {
//        regPage.enterState(state);
//    }
//
//    @When("the user enters postal code {string}")
//    public void user_enters_postalcode(String postalcode) throws InterruptedException {
//        regPage.enterPostalCode(postalcode);
//    }
//
//    @When("the user selects country {string}")
//    public void user_selects_country(String country) throws InterruptedException {
//        regPage.selectCountry(country);
//    }
//
//    @When("the user enters username {string}")
//    public void user_enters_username(String username) throws InterruptedException {
//        regPage.enterUsername(username);
//    }
//
//    @When("the user enters password {string} and confirm password {string}")
//    public void user_enters_passwords(String password, String confirmpassword) throws InterruptedException {
//        regPage.enterPassword(password);
//        regPage.enterConfirmPassword(confirmpassword);
//    }
//
//    @When("the user clicks on the submit button")
//    public void user_clicks_submit() throws InterruptedException {
//        regPage.clickSubmit();
//    }
//
//    @Then("the registration should be successful")
//    public void registration_successful() {
//        System.out.println("Registration submitted successfully!");
//    }
//}
//
