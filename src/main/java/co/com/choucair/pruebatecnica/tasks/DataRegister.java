package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.model.SignUpData;
import co.com.choucair.pruebatecnica.userinterface.SignUpPage;
import co.com.choucair.pruebatecnica.userinterface.UTestWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class DataRegister implements Task {

    private SignUpData signUpData;

    public DataRegister(SignUpData signUpData) {
        this.signUpData = signUpData;
    }

    public static DataRegister onSignUpForm(String parFirstName, String parLastName, String parBirthdayMonth, String parBirthdayDay, String parBirthdayYear, String parEmail, String parPassword, String parPasswordConfirmation, String parCity, String parZip, String parCountry, String parComputerOS, String parComputerVersion, String parComputerLanguage, String parMobileOS, String parMobileBrand, String parMobileModel) {
        return Tasks.instrumented(DataRegister.class, new SignUpData(parFirstName, parLastName, parBirthdayMonth, parBirthdayDay, parBirthdayYear, parEmail, parPassword, parPasswordConfirmation, parCity, parZip, parCountry, parComputerOS, parComputerVersion, parComputerLanguage, parMobileOS, parMobileBrand, parMobileModel));
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        this.EnterPersonalData(actor);
        this.EnterLocationData(actor);
        this.EnterDevicesData(actor);
        this.EnterPasswordData(actor);
    }


    private <T extends Actor> void EnterPersonalData(T actor) {
        actor.attemptsTo(
                Enter.theValue(signUpData.getStrFirstName()).into(SignUpPage.INPUT_FIRST_NAME),
                Enter.theValue(signUpData.getStrLastName()).into(SignUpPage.INPUT_LAST_NAME),
                Enter.theValue(signUpData.getStrEmail()).into(SignUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(signUpData.getStrBirthdayMonth()).from(SignUpPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(signUpData.getStrBirthdayDay()).from(SignUpPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(signUpData.getStrBirthdayYear()).from(SignUpPage.INPUT_YEAR),
                Click.on(SignUpPage.BUTTON_GO_TO_SECOND_STEP)
        );
    }

    private <T extends Actor> void EnterLocationData(T actor) {
        actor.attemptsTo(
                Enter.theValue(signUpData.getStrCity()).into(SignUpPage.INPUT_CITY),
                Click.on(SignUpPage.INPUT_CITY),

                Enter.theValue(signUpData.getStrZip()).into(SignUpPage.INPUT_ZIP),

                Click.on(SignUpPage.DIV_COUNTRY),
                Enter.theValue(signUpData.getStrCountry()).into(SignUpPage.INPUT_COUNTRY),
                Click.on(SignUpPage.INPUT_COUNTRY),

                Click.on(SignUpPage.BUTTON_GO_TO_THIRD_STEP)
        );

    }

    private <T extends Actor> void EnterDevicesData(T actor) {
        actor.attemptsTo(
                Click.on(SignUpPage.DIV_COMPUTER_OS),
                Enter.theValue(signUpData.getStrComputerOS()).into(SignUpPage.INPUT_COMPUTER_OS),
                Click.on(SignUpPage.INPUT_COMPUTER_OS),

                Click.on(SignUpPage.DIV_COMPUTER_VERSION),
                Enter.theValue(signUpData.getStrComputerVersion()).into(SignUpPage.INPUT_COMPUTER_VERSION),
                Click.on(SignUpPage.INPUT_COMPUTER_VERSION),

                Click.on(SignUpPage.DIV_COMPUTER_LANGUAGE),
                Enter.theValue(signUpData.getStrComputerLanguage()).into(SignUpPage.INPUT_COMPUTER_LANGUAGE),
                Click.on(SignUpPage.INPUT_COMPUTER_LANGUAGE),

                Click.on(SignUpPage.DIV_MOBILE_BRAND),
                Enter.theValue(signUpData.getStrMobileBrand()).into(SignUpPage.INPUT_MOBILE_BRAND),
                Hit.the(Keys.ENTER).keyIn(SignUpPage.INPUT_MOBILE_BRAND),

                Click.on(SignUpPage.DIV_MOBILE_MODEL),
                Enter.theValue(signUpData.getStrMobileModel()).into(SignUpPage.INPUT_MOBILE_MODEL),
                Hit.the(Keys.ENTER).keyIn(SignUpPage.INPUT_MOBILE_MODEL),

                Click.on(SignUpPage.DIV_MOBILE_OS),
                Enter.theValue(signUpData.getStrMobileOS()).into(SignUpPage.INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).keyIn(SignUpPage.INPUT_MOBILE_OS),

                Click.on(SignUpPage.BUTTON_GO_TO_FOURTH_STEP)
        );
    }

    private <T extends Actor> void EnterPasswordData(T actor) {
        actor.attemptsTo(
                Enter.theValue(signUpData.getStrPassword()).into(SignUpPage.INPUT_PASSWORD),
                Enter.theValue(signUpData.getStrPasswordConfirmation()).into(SignUpPage.INPUT_PASSWORD_CONFIRMATION),
                Click.on(SignUpPage.CHECKBOX_UTEST),
                Click.on(SignUpPage.CHECKBOX_PRIVACY),
                Click.on(SignUpPage.BUTTON_COMPLETE_SIGN_UP),
                WaitUntil.the(UTestWelcomePage.WELCOME_MESSAGE, WebElementStateMatchers.isVisible())
        );
    }


}
