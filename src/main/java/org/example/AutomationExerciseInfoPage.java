package org.example;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomationExerciseInfoPage {
    SHAFT.GUI.WebDriver driver;
    private By ValidationMessage= By.xpath("//b[contains(text(),'Enter Account Information')]");
    private By GenderType= By.id("id_gender1");
    private By password= By.id("password");
    private By days= By.id("days");
    private By months= By.id("months");
    private By years= By.id("years");
    private By newsletterCheckbox=By.id("newsletter");
    private By checkboxReceivespecialoffers=By.id("optin");
    private By FirstName= By.id("first_name");
    private  By LastName= By.id("last_name");
    private By CompanyName= By.id("company");
    private By Address1= By.name("address1");
    private By Address2= By.name("address2");
    private  By Country= By.name("country");
    private By State= By.id("state");
    private By City= By.id("city");
    private  By ZipCode= By.id("zipcode");
    private  By MobileNumber= By.id("mobile_number");
    private  By CreateAccountbutton= By.xpath("//button[@data-qa=\"create-account\"]");
    private  By Sucmsg= By.xpath("//b[contains(text(),'Account Created!')]");

    public AutomationExerciseInfoPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void assertOnValidationMsg(String ValidationMsg) {

        driver.element().assertThat(ValidationMessage)
                .text().isEqualTo(ValidationMsg)
                .perform();

    }
    public void FullInformationDetails(String PleaseenteryourPassword, String Chooseyourbirthday , String Choosebirthmonth , String Choosebirthyear) {

        driver.element().click(GenderType);
        driver.element().type(password, PleaseenteryourPassword);
        driver.element().select(days, Chooseyourbirthday);
        driver.element().select(months, Choosebirthmonth);
        driver.element().select(years, Choosebirthyear);
    }

    public void SelectCheckboxSignup(){
        driver.element().click(newsletterCheckbox);

    }
    public void SelectCheckboxReceivespecialoffers(){
        driver.element().click(checkboxReceivespecialoffers);

    }

    public void FillUserDetails(String First_Name, String last_name , String Company ,String address1, String address2 , String country , String state, String city , String zipcode , String mobilenumber){

        driver.element().type(FirstName, First_Name);
        driver.element().type(LastName, last_name);
        driver.element().type(CompanyName, Company);
        driver.element().type(Address1, address1);
        driver.element().type(Address2, address2);
        driver.element().click(Country);
        driver.element().type(State, state);
        driver.element().type(City, city);
        driver.element().type(ZipCode, zipcode);
        driver.element().type(MobileNumber, mobilenumber);


    }
    public void ClickCreateAccountbutton(){
        driver.element().click(CreateAccountbutton);

    }
    public void AssertSuccessMsg(String Msg) {


        driver.element().assertThat(Sucmsg)
                .text().isEqualTo(Msg)
                .perform();
    }
}