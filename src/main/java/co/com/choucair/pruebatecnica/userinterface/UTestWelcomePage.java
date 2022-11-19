package co.com.choucair.pruebatecnica.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestWelcomePage extends PageObject {

    public static final Target WELCOME_MESSAGE = Target.the("Extraer mensaje de bienvenida").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));
    public static final String WELCOME_URL = "https://www.utest.com/welcome?from=signup";
}
