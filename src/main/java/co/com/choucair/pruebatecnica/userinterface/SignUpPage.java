package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage extends PageObject {
    //Registro datos personales
    public static final Target INPUT_FIRST_NAME = Target.the("Donde escribimos el nombre").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Donde escribimos el apellido").located(By.id("lastName"));
    public static final Target INPUT_MONTH = Target.the("Donde se escoge el mes de cumpleaños").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Donde se escoge el dia de cumpleaños").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Donde se escoge el año de cumpleaños").located(By.id("birthYear"));
    public static final Target INPUT_EMAIL = Target.the("Donde escribimos el correo ").located(By.id("email"));
    public static final Target BUTTON_GO_TO_SECOND_STEP = Target.the("Botón que pasa al segundo paso del formulario").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    //Registro de dirreccion
    public static final Target INPUT_CITY = Target.the("Donde escribimos la ciudad").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Donde escribimos el código postal").located(By.id("zip"));
    public static final Target DIV_COUNTRY = Target.the("Div que obtiene los paises").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target INPUT_COUNTRY = Target.the("Donde escribimos escribimos el pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_GO_TO_THIRD_STEP = Target.the("Botón que pasa al tercer paso del formulario").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    //Registro de Dispositivo

    public static final Target DIV_COMPUTER_OS = Target.the("Extrae el sistema operativo del computador").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_COMPUTER_OS = Target.the("Donde escribimos el sistema operativo del computador").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target DIV_COMPUTER_VERSION = Target.the("Extrae la version del computador").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER_VERSION = Target.the("Donde escribimos la version del computador").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target DIV_COMPUTER_LANGUAGE = Target.the("Extrae el lenguaje del computador").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER_LANGUAGE = Target.the("Donde escribimos el lenguaje del computador").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target DIV_MOBILE_BRAND = Target.the("Extrae la marca del dispositivo movil").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target INPUT_MOBILE_BRAND = Target.the("Donde escribimos la marca del dispositivo movil").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target DIV_MOBILE_MODEL = Target.the("Extrae el modelo del dispositivo movil").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("Donde escribimos el modelo del dispositivo movil").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target DIV_MOBILE_OS = Target.the("Extrae el sistema operativo del dispositivo movil").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target INPUT_MOBILE_OS = Target.the("Donde escribimos el sistema operativo del dispositivo movil").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));



    public static final Target BUTTON_GO_TO_FOURTH_STEP = Target.the("Botón que pasa al cuarto paso del formulario").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));

    //Registro  de Contraseña y confirmacion de privacidad
    public static final Target INPUT_PASSWORD = Target.the("Input donde escribimos la contraseña").located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRMATION = Target.the("Input donde escribimos la confirmacion de la contraseña").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_UTEST = Target.the("Acepta haber leido los terminos de uTest  ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACY = Target.the("Acepta haber leido los terminos de seguridad y privacidad ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE_SIGN_UP = Target.the("Botón que registra los datos del usuario ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
