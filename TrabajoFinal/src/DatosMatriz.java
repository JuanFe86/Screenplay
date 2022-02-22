public class DatosMatriz {

    String[][] matrizEmpleados;

    public DatosMatriz() {

        matrizEmpleados = new String[3][3];
    }

    public String [][] matriz(){

        return matrizEmpleados;
    }

    public void agregarDatosMatriz(int columna, int fila, String dato){

        matrizEmpleados [columna][fila] = dato;
    }

    public String imprimirMatriz(){
        String matriz = "Nombre \t Nit \t Direccion \n";
        for (int i = 0; i < matrizEmpleados.length; i++) {
            for (int j = 0; j < matrizEmpleados[0].length; j++) {
                if(matrizEmpleados[i][j]!=null)
                    matriz = matriz + matrizEmpleados[i][j] + "  \t";
            }
            matriz = matriz + "\n";
        }
        return matriz;
    }
}
