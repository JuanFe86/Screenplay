package co.com.puntoscolombia.stepdefinitions;

import co.com.puntoscolombia.questions.SumaExitosa;
import co.com.puntoscolombia.tasks.Calcular;
import co.com.puntoscolombia.utils.drivers.MiDriverDeAppium;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.hamcrest.Matchers;

public class CalculadoraAndroidStepDefinition {

    private Actor juan;

    @Dado("^que (.*) se encuentra en la calculadora de Android$")
    public void queDianaSeEncuentraEnLaCalculadoraDeAndroid(String nombre) {
        juan = Actor.named(nombre);
        juan.can(BrowseTheWeb.with(MiDriverDeAppium.suNavegador().mobile()));

    }

    @Cuando("^ella suma los valores (.*) y (.*) en la calculadora$")
    public void ellaSumaLosValoresYEnLaCalculadora(String primerValor, String segundoValor) {

        juan.wasAbleTo(Calcular.elValor(primerValor, segundoValor));

    }

    @Entonces("^ella puede ver el resultado (.*) en la pantalla$")
    public void ellaPuedeVerElResultadoEnLaPantalla(String resultado) {

        juan.should(GivenWhenThen.seeThat(SumaExitosa.aSuma(resultado), Matchers.equalTo(resultado)));
    }
}
