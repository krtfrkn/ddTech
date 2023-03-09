package com.qlub.step_definitions;

import com.qlub.pages.MainPage;
import com.qlub.utilities.ConfigurationReader;
import com.qlub.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class ddTechStepDef {

    MainPage mainPage = new MainPage();
    @Given("the user goes to the main page")
    public void theUserGoesToTheMainPage()  {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("the user is on the correct page")
    public void theUserIsOnTheCorrectPage() {
        String pageName = "Register";
        Assert.assertEquals(pageName,Driver.get().getTitle());
    }
    @And("the user puts firstName")
    public void theUserPutsFirstName() throws InterruptedException {
        mainPage.nameBox.sendKeys(ConfigurationReader.get("name"));
        Thread.sleep(1000);
    }

    @And("the user puts familyName")
    public void theUserPutsFamilyName() throws InterruptedException {
        mainPage.surnameBox.sendKeys(ConfigurationReader.get("surname"));
        Thread.sleep(1000);
    }

    @And("the user puts email")
    public void theUserPutsEmail() throws InterruptedException {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        mainPage.emailBox.sendKeys(saltStr+"@gmail.com");
        Thread.sleep(1000);
    }

    @And("the user puts phoneNumber")
    public void theUserPutsPhoneNumber() throws InterruptedException {
        mainPage.phoneBox.sendKeys(ConfigurationReader.get("telephone"));
        Thread.sleep(1000);
    }

    @And("the user puts password")
    public void theUserPutsPassword() throws InterruptedException {
        mainPage.passwordBox.sendKeys(ConfigurationReader.get("password"));
        Thread.sleep(1000);
    }

    @And("the user puts the password again")
    public void theUserPutsThePasswordAgain() throws InterruptedException {
        mainPage.rePasswordBox.sendKeys(ConfigurationReader.get("password"));
        Thread.sleep(1000);
    }

    @And("the user clicks the Terms of Use and Agreement")
    public void theUserClicksTheTermsOfUseAndAgreement() throws InterruptedException {
        mainPage.checkBox.click();
        Thread.sleep(1000);
    }

    @And("the user clicks on signUp")
    public void theUserClicksOnSignUp() {
        mainPage.signUp.click();

    }

    @Then("the user created account")
    public void theUserCreatedAccount() {
        Assert.assertEquals("Your account has been created.",Driver.get().getTitle());
    }
}
