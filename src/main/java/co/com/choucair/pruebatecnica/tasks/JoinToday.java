package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.userinterface.UTestJoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class JoinToday implements Task{

    public JoinToday() { }

    public static JoinToday onThePage()
    {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(UTestJoinTodayPage.SIGNUP_BUTTON));
    }

}
