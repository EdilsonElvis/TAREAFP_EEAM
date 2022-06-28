package EstRepetitivas;

import java.util.Scanner;
/**
 * Ejercicio 3.3
 */
public class Ejercicio33 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int costo; 
        String mensaje;
        //DATOS DE ENTRADA
        System.out.print("INGRESE EL COSTO: ");
        costo=lt.nextInt();
        //PROCESO
        if (costo<=100) {
            mensaje="Puede comprar porque entra en el presupuesto "+costo;
        } else {
            mensaje="No puede comprar porque no entra en el presupuesto "+costo; 
        }
        //DATOS DE SALIDA
        System.out.println(mensaje);
    }
    
}