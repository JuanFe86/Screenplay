import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston 64gb";
        productos[1] = "sansung galaxy";
        productos[2] = "disco duro";
        productos[3] = "asus";
        productos[4] = "beca";
        productos[5] = "casa";
        productos[6] = "pola";

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
        System.out.println("=== Usando foreach ===");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("=== Usando while ===");
        int i = 0;
        while ( i<total ){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }


        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k = 0; k< total; k++ ){
            numeros[k] = k+3;
        }

        for(int k = 0; k< total; k++ ){
            System.out.println("numeros = " + numeros[k]);
        }


    }


}
