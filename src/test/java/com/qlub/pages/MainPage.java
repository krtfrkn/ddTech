package com.qlub.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement nameBox;

    @FindBy(id = "Input_LastName")
    public WebElement surnameBox;

    @FindBy(name = "Input.Email")
    public WebElement emailBox;

    @FindBy(id = "phone-1")
    public WebElement phoneBox;

    @FindBy(name = "Input.Password")
    public WebElement passwordBox;

    @FindBy(name = "Input.ConfirmPassword")
    public WebElement rePasswordBox;

    @FindBy(xpath = "//span[@class='checkmark']")
    public WebElement checkBox;

    @FindBy(xpath = "//button[.='Sign Up']")
    public WebElement signUp;

}
