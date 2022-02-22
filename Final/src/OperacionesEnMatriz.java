import javax.swing.*;

public class OperacionesEnMatriz {

    static int candidatosNoValidos = 0;

    public static boolean edadEnRango(int edad){
        if(edad >= 18 && edad <= 45){
            return true;
        }
        return false;
    }
    public static void candidatosNoValido(){
        candidatosNoValidos++;
    }
    public static int candidatosNoValidos(){
        return candidatosNoValidos;
    }

    public static void agregarDatos(DatosMatriz datosMatriz){
        int edad;

        for (int columna = 0; columna < datosMatriz.matriz().length; columna++) {
            for (int fila = 0; fila < datosMatriz.matriz()[0].length; fila++) {
                if(fila == 0)
                    datosMatriz.agregarDatosMatriz(columna, fila, JOptionPane.showInputDialog("Ingrese el nombre del candidato"));

                if(fila == 1)
                    datosMatriz.agregarDatosMatriz(columna, fila, JOptionPane.showInputDialog("Ingrese cedula del candidato"));

                if(fila == 2){
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del candidato"));

                    if(edadEnRango(edad)==true)
                        datosMatriz.agregarDatosMatriz(columna, fila, Integer.toString(edad));

                    else{
                        datosMatriz.agregarDatosMatriz(columna, 0, null);
                        datosMatriz.agregarDatosMatriz(columna, 1, null);
                        datosMatriz.agregarDatosMatriz(columna, 2, null);
                        candidatosNoValido();
                    }
                }
            }
        }

    }
    public static void busquedaPorCedula(DatosMatriz datosMatriz, String cedula){

        for (int columna = 0; columna < datosMatriz.matriz().length; columna++) {
            if (datosMatriz.matriz()[columna][1].equals(cedula)) {
                JOptionPane.showMessageDialog(null, "Los datos encontrados para el candidato con numero de cedula " + cedula
                        + " son \nNombre: " + datosMatriz.matriz()[columna][0] + "\nEdad: " + datosMatriz.matriz()[columna][2]);
                break;
            }
            else
                JOptionPane.showMessageDialog(null,"Cedula no encontrada, verifique y vuelva a intentar");
            break;

        }

    }

    public static void conteoCandidatosMayores(DatosMatriz datosMatriz){

        int contador = 0;
        for (int columna = 0; columna < datosMatriz.matriz().length; columna++) {
            if (datosMatriz.matriz()[columna][2] !=null && Integer.parseInt(datosMatriz.matriz()[columna][2]) >= 40 ) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"El numero de candidatos mayores o iguales a 40 es " + contador);
    }

    public static void conteoCandidatosMenores(DatosMatriz datosMatriz){

        int contador = 0;
        for (int columna = 0; columna < datosMatriz.matriz().length; columna++) {
            if (datosMatriz.matriz()[columna][2] !=null && Integer.parseInt(datosMatriz.matriz()[columna][2]) <= 20 ) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"El numero de candidatos menores o iguales a 20 es " + contador);
    }
    public static void conteoExacto(DatosMatriz datosMatriz, int edad){

        int contador = 0;
        for (int columna = 0; columna < datosMatriz.matriz().length; columna++) {
            if (datosMatriz.matriz()[columna][2] !=null && Integer.parseInt(datosMatriz.matriz()[columna][2]) == edad ) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"El numero de candidatos con la edad de "+ edad + " es de " + contador);
    }
    public static void promedioEdad(DatosMatriz datosMatriz){

        float contador = 0;
        float sumador = 0;
        for (int columna = 0; columna < datosMatriz.matriz().length; columna++) {
            if (datosMatriz.matriz()[columna][2]!=null) {
                sumador = sumador+Integer.parseInt(datosMatriz.matriz()[columna][2]);
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"El promedio de edad de los candidatos ingresados es de " + sumador/contador);
    }
}
