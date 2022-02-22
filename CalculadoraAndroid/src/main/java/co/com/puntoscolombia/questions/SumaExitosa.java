package co.com.puntoscolombia.questions;

import co.com.puntoscolombia.userinterfaces.PaginaCalculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.puntoscolombia.userinterfaces.PaginaCalculadora.RESULTADO;

public class SumaExitosa implements Question<String> {

    private String resultado;

    public SumaExitosa(String resultado) {

        this.resultado = resultado;
    }

    @Override


    public String answeredBy(Actor actor) {
        return Text.of(RESULTADO).viewedBy(actor).asString();
    }

    public static SumaExitosa aSuma(String resultado) {
        return new SumaExitosa(resultado);
    }
}
