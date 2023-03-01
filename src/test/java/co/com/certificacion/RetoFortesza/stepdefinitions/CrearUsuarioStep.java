package co.com.certificacion.RetoFortesza.stepdefinitions;

import co.com.certificacion.RetoFortesza.model.CrearUsuarioModel;
import co.com.certificacion.RetoFortesza.questions.UserCreatedQuestion;
import co.com.certificacion.RetoFortesza.tasks.CrearUsuarioTask;
import co.com.certificacion.RetoFortesza.tasks.Start;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuarioStep
{
    @Given("^Dado que un usuario entra al sitio web de la empresa y quiero crear un usuario$")
    public void dadoQueUnUsuarioEntraAlSitioWebDeLaEmpresaYQuieroCrearUnUsuario()
    {
        theActorCalled("Alvaro").wasAbleTo(Start.webSite());

    }


    @When("^el usuario crea la cuenta y esta disponible para usar los beneficios$")
    public void elUsuarioCreaLaCuentaYEstaDisponibleParaUsarLosBeneficios(List<CrearUsuarioModel> data)
    {
        theActorInTheSpotlight().attemptsTo(CrearUsuarioTask.fortesza(data));


    }

    @Then("^El usuarioverifica que el usuario se creo correctamente (.*)$")
    public void elUsuarioverificaQueElUsuarioSeCreoCorrectamente(String questionv)
    {

        theActorInTheSpotlight().should(seeThat(UserCreatedQuestion.wasCreate(questionv)));
    }
}
