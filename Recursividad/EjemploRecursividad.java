
public class EjemploRecursividad {

    public static int factorialR (int n){
       if (n>1) {
        return factorialR(n-1)*n;
       }
        return 1;
    }
    public static int fibonacciR(int n) {
        if (n>1) {
            return  fibonacciR(n-1)+fibonacciR(n-2);
        }
        return n;
    }
    public static int potencia(int n, int m ) {
        if (n==0){
            return 1;
        }else {
            return m*potencia(m,n-1);}
        
    }

    public static void main(String[] args) {
        System.out.println(factorialR(5));
        System.out.println("fibonacci:");
        System.out.println(fibonacciR(6));
        System.out.println("Suma sucesiva:");
        System.out.println(potencia(2,4));
    }
}    
