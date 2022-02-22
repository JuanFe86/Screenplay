package co.com.puntoscolombia.tasks;

import co.com.puntoscolombia.userinterfaces.PaginaCalculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.puntoscolombia.userinterfaces.PaginaCalculadora.*;

public class Calcular implements Task {

    private String primeValor;
    private String segundoValor;

    public Calcular(String primeValor, String segundoValor) {
        this.primeValor = primeValor;
        this.segundoValor = segundoValor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LIMPIAR),
                Click.on(VALOR.of(primeValor)),
                Click.on(OPERADOR_SUMA),
                Click.on(VALOR.of(segundoValor)),
                Click.on(IGUAL)
        );

    }

    public static Calcular elValor(String primeValor, String segundoValor) {
        return Tasks.instrumented(Calcular.class, primeValor, segundoValor);
    }
}
