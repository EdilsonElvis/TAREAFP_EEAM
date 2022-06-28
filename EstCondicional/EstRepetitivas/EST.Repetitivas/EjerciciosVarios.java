
import java.math.BigInteger;
import java.util.Scanner;
public class EjerciciosVarios {
    static Scanner leerT=new Scanner(System.in);
    public static void factorialXnum() {
        int n; 
        long result=1;
        System.out.println("Ingrese un numero:");
        n=leerT.nextInt();
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }
        System.out.println("El factorial de "+n+" es:"+result);
    }
    public static long factorialXNum(int n) {        
        long result=1;
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }       
        return result;
    }
        public static BigInteger factorialNumBig(int n) {        
            BigInteger result=new BigInteger("1");
            if(n>1){
            for (int i = 1; i <=n; i++) {
                result=result.multiply(new BigInteger(String.valueOf(i)));
                }
            }       
            return result;
    } 
    
    public static void funcionExponencial(int x) {
        double result=0;
        for (int i = 1; i <=x; i++) {
            result=result+(Math.pow(x, i)/factorialNum(i));  
        }
        System.out.println("Funcion Exponencial es:"+result);
    }
    private static double factorialNum(int i) {
        return 0;
    }
    public static void main(String[] args) {
        factorialXnum();
        /*factorialXnum();
        long resultado=factorialNum(5);
        System.out.println("Resultado:"+resultado);*/

        /*System.out.println("Ingrese un numero:");
        int numero=leerT.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Factorial de "+i+"! =" + factorialNumBig(i));
        }*/
        funcionExponencial(5);
    }
}