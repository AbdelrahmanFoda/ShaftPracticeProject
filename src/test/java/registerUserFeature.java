import com.shaft.driver.SHAFT;
import org.example.AutomationExerciseInfoPage;
import org.example.AutomationExerciseSignUpPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class registerUserFeature {
    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
    private AutomationExerciseSignUpPage AutomationExercisSignUpPage;
    private AutomationExerciseInfoPage AutomationExerciseInfoPage;


    @BeforeMethod
    public void openUrl (){
        AutomationExercisSignUpPage = new AutomationExerciseSignUpPage(driver);
       AutomationExerciseInfoPage = new AutomationExerciseInfoPage(driver);

        AutomationExercisSignUpPage.navigateHomePageUrl("https://automationexercise.com/");
    }

    @Test
    public void register1 () {
        String  EmailN="Foda"+System.currentTimeMillis()+"@gmail.com";
        AutomationExerciseSignUpPage.ClickonSignupLoginbutton();
        AutomationExercisSignUpPage.Enternameandemailaddress("Abdddgepaahman",EmailN);
        AutomationExercisSignUpPage.ClickOnSignupButton();

        AutomationExerciseInfoPage.assertOnValidationMsg("ENTER ACCOUNT INFORMATION");
        AutomationExerciseInfoPage.FullInformationDetails("55454454545",
                "19", "March", "2020");
        AutomationExerciseInfoPage.SelectCheckboxSignup();
        AutomationExerciseInfoPage.SelectCheckboxReceivespecialoffers();
        AutomationExerciseInfoPage.FillUserDetails("Abdelrahman", "Foda",
                "GizaSystems",
                "Cairo", "Cairo",
                "United States",
                "www", "nasrcity", "818",
                "0115584848");
        AutomationExerciseInfoPage.ClickCreateAccountbutton();
        AutomationExerciseInfoPage.AssertSuccessMsg("ACCOUNT CREATED!");

    }



    @AfterMethod
    public void afterMethod() {

        driver.quit();

    }


}
