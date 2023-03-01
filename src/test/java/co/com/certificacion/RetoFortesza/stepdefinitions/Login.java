package co.com.certificacion.RetoFortesza.stepdefinitions;

import co.com.certificacion.RetoFortesza.model.CrearUsuarioModel;
import co.com.certificacion.RetoFortesza.questions.RecargarSaldo;
import co.com.certificacion.RetoFortesza.questions.UserCreatedQuestion;
import co.com.certificacion.RetoFortesza.tasks.CrearUsuarioTask;
import co.com.certificacion.RetoFortesza.tasks.LoginTasks;
import co.com.certificacion.RetoFortesza.tasks.StarLogin;
import co.com.certificacion.RetoFortesza.tasks.Start;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Login
{
    @Given("^dado que ingreso a la pagina$")
    public void dadoQueIngresoALaPagina()
    {
        theActorCalled("Alvaro").wasAbleTo(StarLogin.inwebSite());

    }


    @When("^el hace login y navega por la pagina$")
    public void elHaceLoginYNavegaPorLaPagina(List<CrearUsuarioModel> data)
    {
        theActorInTheSpotlight().attemptsTo(LoginTasks.inFortesza(data));


    }

    @Then("^verifica que esta navegando correctamente en la opcion (.*)$")
    public void verificaQueEstaNavegandoCorrectamenteEnLaOpcion(String questionv)
    {

        theActorInTheSpotlight().should(seeThat(RecargarSaldo.fortesza(questionv)));

    }

}
