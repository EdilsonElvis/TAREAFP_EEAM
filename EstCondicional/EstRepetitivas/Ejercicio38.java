package EstRepetitivas;

import java.util.Scanner;
/**
 * Ejercicio 3.8 
 */

public class Ejercicio38 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //DECLARAR VARIABLES
       double sueldo, bonoAnti=0, bonoSueldo, bonoMayor;
        //DATOS DE ENTRADA
        System.out.println("Ingrese anho de antiguedad:");
        bonoAnti=lt.nextDouble();
        System.out.println("Ingrese el sueldo reciente:");
        sueldo=lt.nextDouble();
        //PROCESO
        if (sueldo>3500){
        bonoSueldo=sueldo*0.10;
        } else if (sueldo>=1000 && sueldo<=3500){
        bonoSueldo=sueldo*0.15;
        }else{
            bonoSueldo=sueldo*0.25;
        }


      if (bonoAnti>bonoSueldo){
        bonoMayor=bonoAnti;
        }
      else{
        bonoMayor=bonoSueldo;
        }
    //DATOS DE SALIDA 
    System.out.println("El Bono que corresponde es: "+bonoMayor);
    }
}