package EstRepetitivas;

import java.util.Scanner;
public class Ejercicio37 {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int edad;
        double promedio;
        String resBeca;
        //DATOS DE ENTRADA
        System.out.println("ingrese la edad");
        edad=lt.nextInt();
        System.out.println("ingrese el promedio");
        promedio=lt.nextDouble();
        //PROCESO
        if (edad>18) {
            if (promedio>=18) {
                resBeca="le corresponde el monto de S/ 2000"; 
            }else if (promedio>=15){
                resBeca="le corresponde el monto de S/ 1000";
            }else if (promedio<15 && promedio>=12){
                resBeca="le corresponde el monto de S/ 500";   
            }else {
                resBeca="Enviar una carta para que estudie";
            }
        } else {
            if(promedio>=18){
                resBeca="Le corresponde el monto de S/ 3000";
            }else if(promedio<18 && promedio>=12){
                resBeca="Le corresponde el monto de S/ 2000";
            }else if(promedio<16 && promedio>=12){
                resBeca="Le corresponde el monto de S/ 100";
            }else{
                resBeca="Enviar una carat para que estudie";

            }
        }
        //DATOS DE SALIDA
        System.out.println(resBeca);

        
    }
}