package EstRepetitivas;
import java.util.Scanner;
public class Ejercicio31 {
    static Scanner lt=new Scanner(System.in);
 public static void main(String[] args) {
     //DECLARAR VARIABLES
     int edad; 
     String mensaje;
     //DATOS DE ENTRADA
     System.out.println("ingrese la edad");
     edad=lt.nextInt();
     //PROCESO
     if (edad>=18) {
         mensaje="puede votar porque su edad es" +edad;
     } else {
         mensaje="no puede votar porque su edad es" +edad;
     }
     //DATOS DE SALIDA
     System.out.println(mensaje);
 }   
}
