package stepdefinationlogin;

import io.cucumber.java.en.*;

import java.util.logging.SimpleFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepslogins {
    WebDriver driver;
    SimpleFormatter formPage;

    @Given("I open the form page")
    public void openFormPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/form"); // Replace with actual form URL
        formPage = new SimpleFormPage(driver);
    }

    @When("I enter {string} as first name")
    public void enterFirstName(String firstName) {
        formPage.enterFirstName(firstName);
    }

    @When("I enter {string} as last name")
    public void enterLastName(String lastName) {
        formPage.enterLastName(lastName);
    }

    @When("I enter {string} as email")
    public void enterEmail(String email) {
        formPage.enterEmail(email);
    }

    @When("I enter {string} as contact number")
    public void enterContact(String contact) {
        formPage.enterContact(contact);
    }

    @When("I enter {string} in the message box")
    public void enterMessage(String message) {
        formPage.enterMessage(message);
    }

    @When("I click the submit button")
    public void clickSubmit() {
        formPage.clickSubmit();
    }

    @Then("The form should be submitted successfully")
    public void verifySubmission() {
        // Add validation logic like checking success message or redirect
        driver.quit();
    }
}




