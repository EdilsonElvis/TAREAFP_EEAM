package EstRepetitivas;

import java.util.Scanner;
/**
 * Ejercicio 3.6
 */
public class Ejercicio36 {
    static Scanner lt=new Scanner(System.in);
    
    public static void main(String[] args) {
        //DEFINIR VARIABLES
        double costo, precio;
        //DATOS DE ENTRADA
        System.out.println("INGRESE EL PRECIO: ");
        precio=lt.nextDouble();
        //PROCESO
        if (precio>=200) {
            costo=precio*0.20;
            
        } else if(precio>100 && precio<200){
            costo=precio*0.15;
            
        }else{
            costo=precio*0.10;
        }
        //DATOS DE SALIDA
        System.out.println("EL COSTO DEL DESCUENTO ES: "+costo);
    }
}