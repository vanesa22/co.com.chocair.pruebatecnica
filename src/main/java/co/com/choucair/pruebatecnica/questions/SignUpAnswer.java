package co.com.choucair.pruebatecnica.questions;

import co.com.choucair.pruebatecnica.userinterface.UTestWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SignUpAnswer implements Question<Boolean> {

    public static SignUpAnswer toTheQuestion() {
        return new SignUpAnswer();
    }

    public SignUpAnswer() {
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        String welcomeUrl = UTestWelcomePage.WELCOME_URL;
        WebDriver driver = getDriver();
        if (welcomeUrl.equals(driver.getCurrentUrl())) {
            result = true;
        }
        return result;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
