package co.com.certificacion.RetoFortesza.tasks;

import co.com.certificacion.RetoFortesza.userinterface.OpenWebsite;
import co.com.certificacion.RetoFortesza.userinterface.OpenWebsiteLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class StarLogin implements Task
{

    private OpenWebsiteLogin openWebsiteLogin;

    public static StarLogin inwebSite() {
        return Tasks.instrumented(StarLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(openWebsiteLogin));

    }
}