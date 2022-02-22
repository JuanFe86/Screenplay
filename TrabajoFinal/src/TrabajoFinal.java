import javax.swing.*;


public class TrabajoFinal {


    public static void main(String[] args) {
        DatosMatriz datosMatriz = new DatosMatriz();
        int opcionMenu;
        JOptionPane.showMessageDialog(null, "Bienvenido, ingrese por favor los datos del comercial");
        OperacioneEnMatriz.agregarDatos(datosMatriz);

    }


    /**
     * Metodo para visualizar menu
     */
    public static int menu(){

        return  Integer.parseInt(JOptionPane.showInputDialog("Que operacion desea realizar? \n" +
                "1.	Ingresar gastos\n" +
                "2.	ingresar ventass \n" +
                "0.	Salir del programa \n"
        ));
    }
}
