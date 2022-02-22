package co.com.puntoscolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCalculadora {

    public static final Target LIMPIAR = Target.the("el botón limpiar").locatedBy("//*[@text='DEL']");
    public static final Target VALOR = Target.the("el botón del primer valor").locatedBy("//*[@text='{0}']");
    public static final Target OPERADOR_SUMA = Target.the("el botón suma").locatedBy("//*[@text='+']");
    public static final Target IGUAL = Target.the("botón igual").locatedBy("//*[@text='=']");
    public static final Target RESULTADO = Target.the("el resultado es").locatedBy("//*[@text and @class='android.widget.EditText']");
}
