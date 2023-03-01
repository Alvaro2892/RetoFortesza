package co.com.certificacion.RetoFortesza.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Login.feature",
        glue = {"co.com.certificacion.RetoFortesza.stepdefinitions","co.com.certificacion.RetoFortesza.util"},
        snippets = SnippetType.CAMELCASE )


public class Login {
}