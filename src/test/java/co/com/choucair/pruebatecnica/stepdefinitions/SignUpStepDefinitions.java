package co.com.choucair.pruebatecnica.stepdefinitions;

import co.com.choucair.pruebatecnica.exceptions.GeneralException;
import co.com.choucair.pruebatecnica.model.SignUpData;
import co.com.choucair.pruebatecnica.questions.SignUpAnswer;
import co.com.choucair.pruebatecnica.tasks.DataRegister;
import co.com.choucair.pruebatecnica.tasks.JoinToday;
import co.com.choucair.pruebatecnica.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SignUpStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Vanesa wants to sign up on the uTest platform$")
    public void vanesaWantsToSignUpOnTheUTestPlatform() {
        OnStage.theActorCalled("Vanesa").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^she entered all the data requested by the platform$")
    public void sheEnteredAllTheDataRequestedByThePlatform(List<SignUpData> parSignUpData) {
        OnStage.theActorInTheSpotlight().attemptsTo(DataRegister.onSignUpForm(
                        parSignUpData.get(0).getStrFirstName(),
                        parSignUpData.get(0).getStrLastName(),
                        parSignUpData.get(0).getStrBirthdayMonth(),
                        parSignUpData.get(0).getStrBirthdayDay(),
                        parSignUpData.get(0).getStrBirthdayYear(),
                        parSignUpData.get(0).getStrEmail(),
                        parSignUpData.get(0).getStrPassword(),
                        parSignUpData.get(0).getStrPasswordConfirmation(),
                        parSignUpData.get(0).getStrCity(),
                        parSignUpData.get(0).getStrZip(),
                        parSignUpData.get(0).getStrCountry(),
                        parSignUpData.get(0).getStrComputerOS(),
                        parSignUpData.get(0).getStrComputerVersion(),
                        parSignUpData.get(0).getStrComputerLanguage(),
                        parSignUpData.get(0).getStrMobileOS(),
                        parSignUpData.get(0).getStrMobileBrand(),
                        parSignUpData.get(0).getStrMobileModel()
                )
        );
    }

    @Then("^she will be signed up$")
    public void sheWillBeSignedUp() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SignUpAnswer.toTheQuestion()).orComplainWith(GeneralException.class, "No fue posible realizar el registro"));
    }

}
