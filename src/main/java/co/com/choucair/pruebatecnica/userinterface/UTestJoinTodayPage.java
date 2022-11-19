package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinTodayPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("Botón de Join Today").located(By.className("unauthenticated-nav-bar__sign-up"));
}
