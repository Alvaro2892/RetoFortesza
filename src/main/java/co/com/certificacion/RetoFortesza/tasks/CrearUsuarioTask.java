package co.com.certificacion.RetoFortesza.tasks;

import co.com.certificacion.RetoFortesza.interactions.Wait;
import co.com.certificacion.RetoFortesza.model.CrearUsuarioModel;
import co.com.certificacion.RetoFortesza.userinterface.CrearUsuarioUI;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.certificacion.RetoFortesza.util.Constants.ZERO;

public class CrearUsuarioTask implements Task

{
    Faker faker = new Faker();
    String username = faker.internet().emailAddress();



    private List<CrearUsuarioModel> data;

    public CrearUsuarioTask (List<CrearUsuarioModel> data)
    {
        this.data = data;
    }

    public static CrearUsuarioTask fortesza(List<CrearUsuarioModel> crearUsuarioModels)
    {
        return Tasks.instrumented(CrearUsuarioTask.class, crearUsuarioModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        CrearUsuarioModel info = data.get(ZERO);
        actor.attemptsTo(
                Enter.theValue(username).into(CrearUsuarioUI.CLICKONUSER),
                Enter.theValue(info.getPassword()).into(CrearUsuarioUI.CLICKONPASSWORD),
                Click.on(CrearUsuarioUI.CLICKMAYOREDAD),
                Click.on(CrearUsuarioUI.CLICKCREARCUENTA),
                Wait.por(10000)
        );


    }
}
