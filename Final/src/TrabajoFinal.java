import javax.swing.*;
import javax.swing.JOptionPane;


public class TrabajoFinal {

    DatosMatriz datosMatriz = new DatosMatriz();
    int opcionMenu;
     JOptionPane.showMessageDialog(null, "Bienvenido, ingrese por favor los datos de los candidatos");
    agregarDatos(datosMatriz);

    opcionMenu = menu();
     while(opcionMenu!=8){
        switch(opcionMenu){
            case 1 :
                OperacionesEnMatriz.busquedaPorCedula(datosMatriz, JOptionPane.showInputDialog("Ingrese cedula del candidato ca buscar"));
                break;
            case 2 :
                OperacionesEnMatriz.conteoCandidatosMayores(datosMatriz);
                break;
            case 3 :
                OperacionesEnMatriz.conteoCandidatosMenores(datosMatriz);
                break;
            case 4 :
                OperacionesEnMatriz.promedioEdad(datosMatriz);
                break;
            case 5 :
                OperacionesEnMatriz.conteoExacto(datosMatriz, 18);
                break;
            case 6 :
                OperacionesEnMatriz.conteoExacto(datosMatriz, 45);
                break;
            case 7 :
                JOptionPane.showMessageDialog(null, datosMatriz.imprimirMatriz());
                break;
        }
        opcionMenu = menu();
    }
            JOptionPane.showMessageDialog(null, "Muchas gracias por su participacion ¡Feliz dia!");

}

    public static int menu(){

        return  Integer.parseInt(JOptionPane.showInputDialog("Que operacion desea realizar? \n" +
                "1.	Consultar el nombre y edad del candidato ingresando solo la cedula\n" +
                "2.	Conteo total de candidatos mayores o iguales a 40 años \n" +
                "3.	Conteo total de candidatos menores o iguales a 20 años \n" +
                "4.	Promedio de edades de todos los candidatos \n"+
                "5.	Conteo total de candidatos que tienen exactamente 18 años \n"+
                "6.	Conteo total de candidatos que tienen exactamente 45 años \n"+
                "7.	Imprimir matriz \n" +
                "8.	Salir del programa \n"
        ));
    }
}
