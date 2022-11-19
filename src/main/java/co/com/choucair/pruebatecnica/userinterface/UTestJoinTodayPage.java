package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinTodayPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("Botón de Join Today").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    }
