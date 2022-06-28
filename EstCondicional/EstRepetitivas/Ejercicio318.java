package EstRepetitivas;

import java.util.Scanner;
 /**
 * Ejercicio 3.18
 */
    public class Ejercicio318 {
        static Scanner lt=new Scanner(System.in);
        public static void main(String[] args) {
            //DECLARAR VARIABLES 
            double bono, antiguedad, sueldo;
            //DATOS DE ENTRADA
            System.out.println("Ingrese el sueldo: ");
            sueldo=lt.nextDouble();
            System.out.println("Ingrese la antiguedad: ");
            antiguedad=lt.nextInt();
            //PROCESO
            if (antiguedad>4 || sueldo<2000) {
                bono=sueldo*0.25;    
            } else {
                bono=sueldo*0.20;
            }
            //DATOS DE SALIDA
            System.out.println("El bono que le corresponde es: "+bono);
                
        }
    }   
