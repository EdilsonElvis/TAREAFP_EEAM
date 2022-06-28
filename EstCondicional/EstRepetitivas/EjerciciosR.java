package EstRepetitivas;
import java.util.Scanner;
public class EjerciciosR {
    public static void imprimirN1_10While() {
        int numInit=1;
        while (numInit<=10) {
            System.out.println(numInit);
            numInit=numInit+1;     
            }
    }
    public static void imprimirN1_10doWhile() {
        int numInit=1;
        do {
            System.out.println(numInit);
            numInit=numInit+1;
        } while (numInit<=10);
    }
    public static void imprimirN1_10for() {
        for (int numInit = 0; numInit <=10; numInit++) {
            System.out.println(numInit);
        }
    }
    public static void imprimirNombreVertical() {
        //DECLARAR VARIABLES
        String nombre;
        //DATOS DE ENTRADA
        System.out.println("ingrese su nombre:");
        try (Scanner lt = new Scanner(System.in)) {
            nombre=lt.next();
        }
        //PROCESO Y SALIDA
        for(int i=0; i < nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }
    }    
    public static void imprimirNombreRevez() {
        //DECLARAR VARIABLES
        String nombre;
        //DATOS DE ENTRADA
        System.out.println("ingrese su nombre");
        try (Scanner lt = new Scanner(System.in)) {
            nombre=lt.next();
        }
        //PROCESO Y SALISA
        for(int i=nombre.length()-1; i >=0; i--){
            System.out.println(nombre.charAt(i));
        } 
    }
    public static void main(String[] args) {
       /* System.out.println("While");
        imprimirN1_10While();
        System.out.println("Do While");   
        imprimirN1_10doWhile();
        System.out.println();
        System.out.println("For:");
        imprimirN1_10for();
        imprimirNombreVertical();
        System.out.println();
        System.out.println("For:");
        imprimirN1_10for();*/
        imprimirNombreRevez();
    }
    
}
