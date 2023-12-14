package org.example;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationExerciseSignUpPage {
   private static SHAFT.GUI.WebDriver driver;

    //lactors
    private static By loginbutton = By.linkText("Signup / Login");
    private By Name = By.name("name");
    private By Email= By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]");
    private By Signupbutton= By.xpath("//button[@data-qa=\"signup-button\"]");


    public AutomationExerciseSignUpPage(SHAFT.GUI.WebDriver driver)
    {
        this.driver = driver;
    }
    //Actions
    public void navigateHomePageUrl(String HomePageUrl){
        driver = new SHAFT.GUI.WebDriver();

        driver.browser().navigateToURL(HomePageUrl);

    }

    public static void ClickonSignupLoginbutton(){

        driver.element().click(loginbutton);
    }

    public void  Enternameandemailaddress(String username,String EmailN) {

        driver.element().type(Name,username);
        driver.element().type(Email,EmailN);

    }
    public void ClickOnSignupButton() {
        driver.element().click(Signupbutton);
    }

}

