package co.com.certificacion.RetoFortesza.tasks;

import co.com.certificacion.RetoFortesza.interactions.Wait;
import co.com.certificacion.RetoFortesza.model.CrearUsuarioModel;
import co.com.certificacion.RetoFortesza.userinterface.LoginUI;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.certificacion.RetoFortesza.util.Constants.ZERO;

public class LoginTasks implements Task

{




    private List<CrearUsuarioModel> data;

    public LoginTasks (List<CrearUsuarioModel> data)
    {
        this.data = data;
    }

    public static LoginTasks inFortesza(List<CrearUsuarioModel> crearUsuarioModels)
    {
        return Tasks.instrumented(LoginTasks.class, crearUsuarioModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        CrearUsuarioModel info = data.get(ZERO);
        actor.attemptsTo(
                Enter.theValue(info.getEmail()).into(LoginUI.CLICKONEMAILLOGIN),
                Enter.theValue(info.getPassword()).into(LoginUI.CLICKONPASSWORDLOGIN),
                Click.on(LoginUI.CLICKONINICIARSESION),
                Wait.por(10000),
                Click.on(LoginUI.CLICKONBUTTON),
                Click.on(LoginUI.CLICKONFACTORING),
                Click.on(LoginUI.CLICKONRECARGARSALDO),
                Wait.por(6000)

        );


    }
}
