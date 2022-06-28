package EstRepetitivas;

import java.util.Scanner;
/**
 * Ejercicio 3.17
 */
public class Ejercicio317 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //DEFINIR VARIABLES
        double dinero; 
        String puede;
        //DATOS DE ENTRADA
        System.out.print("DINERO QUE RECIBIRA EN EL MES DE DICIEMBRE: ");
        dinero=lt.nextDouble();
        //PROCESO
        if (dinero>50000) {
            puede="COMPRAR EL PAQUETE A";
        } else if(dinero<50000 && dinero>=20000){
            puede="COMPRAR EL PAQUETE B";   
        } else if(dinero<20000 && dinero>=10000){
            puede="COMPRAR EL PAQUETE C";
        } else {
            puede="SE CONFORMARA CON EL PAQUETE D";
        }
        //DATOS DE SALIDA
        System.out.println(puede);
    }
}