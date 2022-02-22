import javax.swing.*;

public class OperacioneEnMatriz {

    public static void agregarDatos(DatosMatriz datosMatriz) {
        int edad;

        for (int columna = 0; columna < datosMatriz.matriz().length; columna++) {
            for (int fila = 0; fila < datosMatriz.matriz()[0].length; fila++) {
                if (fila == 0)
                    datosMatriz.agregarDatosMatriz(columna, fila, JOptionPane.showInputDialog("Ingrese su nombre"));

                if (fila == 1)
                    datosMatriz.agregarDatosMatriz(columna, fila, JOptionPane.showInputDialog("Ingrese NIT"));

                if (fila == 2) {
                    datosMatriz.agregarDatosMatriz(columna, fila, JOptionPane.showInputDialog("Ingrese direccion"));


                    datosMatriz.agregarDatosMatriz(columna, 0, null);
                    datosMatriz.agregarDatosMatriz(columna, 1, null);
                    datosMatriz.agregarDatosMatriz(columna, 2, null);

                }
            }
        }
    }

}

