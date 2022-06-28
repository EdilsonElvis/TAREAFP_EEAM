import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //2.2
        //DEFINIR VARIABLES
        double soles, dolares;
        //DATOS DE ENTRADA
        try (Scanner hc =new Scanner(System.in)) {
            System.out.println("ingrese total de soles");
            soles = hc.nextDouble();
        }
        //PROCESO
        dolares = soles / 3.75;
        //DATOS DE SALIDA
        System.out.println("el total de dolares es: " + dolares);
        
    }
    
}
