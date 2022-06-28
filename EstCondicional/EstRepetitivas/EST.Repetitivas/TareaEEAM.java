import java.io.*;
import java.util.Scanner;

public class TareaEEAM {
    static  Scanner lt=new Scanner(System.in);
    static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void ejercicio42EEAM(){

		int hamburguesa;
		int n;
		int tarjeta;
		double total=0;
		double x;
		System.out.print("Cuantas hamburguesas desea comprar: ");
		n = lt.nextInt();
		for (x=1;x<=n;x++) {
			System.out.println("Seleccione el numero del tipo de hamburguesa: ");
			System.out.println("  1.- S sencilla s/. 10");
			System.out.println("  2.- D doble s/.12");
			System.out.println("  3.- T triples s/.14 ");
			hamburguesa = lt.nextInt();
			switch (hamburguesa) {
			case 1:
				total = total+10;
				break;
			case 2:
				total = total+12;
				break;
			case 3:
				total = total+14;
				break;
			default:
			}
		}
		System.out.println("Elige el tipo de pago:");
		System.out.println("    1.- Efectivo");
		System.out.println("    2.- Tarjeta de credito");
		tarjeta = lt.nextInt();
		switch (tarjeta) {
		case 1:
			System.out.println("El total a pagar es de: "+total+" soles");
			break;
		case 2:
			total = total+(total*.05);
			System.out.println("El total a pagar es de: "+total+" soles");
			break;
		default:
        }
    }
    public static void ejercicio43EEAM() {
    int cantNumMayorcero=0, cantNumMenorIgualCero=0;
    double numN=0;
    String continuar="S";
    while (continuar.equals("S")) {
        System.out.println("Ingrese un numero:");
        numN=lt.nextDouble();
        if (numN<=0) {
            cantNumMenorIgualCero++;
        }else{
            cantNumMayorcero++;
        }
        System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
        continuar=lt.next().toUpperCase().equals("S")?"S":"N";
    }  
    System.out.println("Cantidad de numeros Mayores de cero: "+cantNumMayorcero);
    System.out.println("Cantidad de numeros menores e iguales a cero: "+cantNumMenorIgualCero);
    System.out.println("Total de numeros introducidos: "+(cantNumMayorcero+cantNumMenorIgualCero));
 }
 public static void ejercicio45EEAM() {
    //Definir variables
    int n;
    //Datos de entrada
    System.out.println("Ingrese el proceso deseado \n1.-While \n2.-For");
    n=lt.nextInt();
    switch (n) {
        case 1://Definir variables
                int v=0;
                double salario=1500;
                while (v<6) {
                salario=salario+(salario*0.10);
                System.out.println("Su salario el "+(v+1)+" año sera de:"+salario);
                v++;
                }; break;
        case 2://Definir variables
            double total=1500;
            for (int i = 0; i < 6; i++) {
            total=total+(total*0.10);
            System.out.println("Su salario el "+(i+1)+" año sera de:"+total);
            }break;
        default:
            break;
    }
}
public static void ejercicio46EEAM() {
    //Definir variables
    int v;
    //Datos de entrada
    System.out.println("Ingrese el proceso deseado \n1.-While \n2.-For");
    v=lt.nextInt();
    switch (v) {
        case 1:ejercicio42EEAM(); break;
        case 2://Definir variables
            int i=0,n,tarjeta,hamburguesa;
            double total=0;
            //Datos de entrada
            System.out.println("Sencillo(1) \nDoble(2) \nTriple(3)");
            while (i<3) {
            hamburguesa=i+1;
            System.out.println("Ingrese la cantidad de hamburguesas del tipo "+(i+1)+":");
            n=lt.nextInt();
            switch (hamburguesa) {
                case 1:total=total+10*n; break;
                case 2:total=total+12*n; break;
                case 3:total=total+14*n; break;
                default: break;
            }
            i++;
            }
            System.out.println("Elige el tipo de pago: \n1.- Efectivo \n2.-Trajeta de credito");
            tarjeta=lt.nextInt();
            switch (tarjeta) {
                case 1:System.out.println("El total a pagar es de: "+total+" pesos"); break;
                case 2:total=total+(total*0.05); System.out.println("El total a pagar es de: "+total+" pesos"); break;
                default: break;
            }
        default:break;
    }
}
public static void ejercicio48EEAM() {
    //Definir variables
    int años;
    double saldo=0, interes=0, total=0, deposito=0;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de años ahorrados: ");
    años=lt.nextInt();
    //Proceso
    while (años>0) {
        for (int i = 0; i < 12; i++) {
        System.out.println("Ingrese el deposito del mes "+(i+1)+":");
        deposito=lt.nextDouble();
        saldo=saldo+deposito;
    }
    interes=interes+(saldo*0.10);
    total=saldo+interes;
    años=años-1;
    }
    //Datos de salida
    System.out.println("Tu ahorro en el año es: "+saldo);
    System.out.println("El interes ganado es: "+interes);
    System.out.println("Tu ahorro ya con interes es: "+total);
    System.out.println("");
}
public static void ejercicio49EEAM() {
    //Definir datos
    int n,salones,edad,suma=0,total=0,alumnos=0;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de salones: ");
    salones=lt.nextInt();
    while (salones>0) {
        System.out.println("Ingrese la cantidad de alumnos: ");
        n=lt.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la edad del alumno: "+(i+1));
            edad=lt.nextInt(); 
            suma=suma+edad;
        }
        System.out.println("El promedio del salon "+salones+" es: "+(suma/n)+" años");
        alumnos = alumnos + n;
        total = total + suma;
        salones = salones - 1;
        suma=suma*0;
    }
    System.out.println("El promedio de toda la escuela es: "+(total/alumnos)+" años");
}

public static void ejercicio411EEAM() {
     //Definir Variables
     int cantidad;
     double tipo, total=0;
     String continuar="S";
     //Datos de entrada y proceso
     while (continuar.equals("S")) {
         System.out.println("Elige el tipo de billete o moneda: \nBilletes \n1.- 200 \n2.- 100 \n3.- 50 \n4.- 20 \n5.- 10 \nMonedas \n6.- 5 \n7.- 2 \n8.- 1 \n9.- 0.50 \n10.- 0.20 \n11.- 0.10");
         tipo=lt.nextDouble();
         System.out.println("Cuanto es la cantidad de ese tipo: ");
         cantidad=lt.nextInt();
         if (tipo==1) {
             total=total+(cantidad*200);
         } else if (tipo==2) {
             total=total+(cantidad*100);
         }else if (tipo==3) {
             total=total+(cantidad*50);
         }else if (tipo==4) {
             total=total+(cantidad*20);
         }else if (tipo==5) {
             total=total+(cantidad*10);
         }else if (tipo==6) {
             total=total+(cantidad*5);
         }else if (tipo==7) {
             total=total+(cantidad*2);
         }else if (tipo==8) {
             total=total+(cantidad*1);
         }else if (tipo==9) {
             total=total+(cantidad*0.5);
         }else if (tipo==10) {
             total=total+(cantidad*0.2);
         }else{
             total=total+(cantidad*0.1);
         }
         System.out.println("Tiene mas dinero?:\nS=Si\tN=No");
         continuar=lt.next().toUpperCase().equals("S")?"S":"N";
     }
     //Datos de salida
     System.out.println("El dinero total es: "+total);
}
public static void ejercicio412EEAM() {
    //Definir variables
    int n,venta;
    double a=0,b=0,c=0,total=0,total1=0,total2=0,total3=0;
    //datos de entrada
    System.out.println("Ingresa el numero de ventas: ");
    n=lt.nextInt();
    while (n>0) {
        System.out.println("Ingresa el monto de la venta "+n);
        venta=lt.nextInt();
        if (venta>=20000){
            a = a + 1;
            total1 = total1+venta;
        }else if (venta>=10000 && venta<20000){
            b = b + 1;
            total2 = total2 + venta;
        }else{
            c = c + 1;
            total3 = total3 + venta;
        }
        total = total + venta;
        n = n - 1;
   }
    System.out.println("El numero de ventas mayores a $20,000 es: "+a);
    System.out.println("El total de las ventas mayores a $20,000 es: "+total1);
    System.out.println("El numero de ventas mayores a $10,000 y menores a $20,000 es: "+b);
    System.out.println("El total de las ventas mayores a $10,000 y menores a $20,000 es: "+total2);
    System.out.println("El numero de ventas menores a $10,000 es: "+c);
    System.out.println("El total de las ventas menores a $10,000: "+total3);
    System.out.println("El monto total de la ventas es: $"+total);
}
public static void ejercicio414EEAM() {
    int i, n;
    double descuento, HrsTrabajo, sueldoxhora, sueldoxsemana;
    String nombretrabajador;
    System.out.print("Ingresa el valor de numero de trabajadores: ");
    n = lt.nextInt();
    
    for (i=1; i<=n; i++) {
        System.out.print(+ i);
        System.out.print("Ingresa el nombre del trabajador: ");
        nombretrabajador = lt.nextLine();
        System.out.print("Ingresa las horas trabajadas: ");
        HrsTrabajo = lt.nextDouble();
        System.out.print("Ingresa el sueldo por hora: ");
        sueldoxhora = lt.nextDouble();
        sueldoxsemana=HrsTrabajo*sueldoxhora;
        descuento=0;
        if(sueldoxsemana>0&&sueldoxsemana<=150)
            descuento=sueldoxsemana*0.05;
        if(sueldoxsemana>150&&sueldoxsemana<=300)
            descuento=sueldoxsemana*0.07;
        if(sueldoxsemana>300&&sueldoxsemana<=450)
            descuento=sueldoxsemana*0.09;
        sueldoxsemana=sueldoxsemana-descuento;
        System.out.println("Nombre del trabajador: " + nombretrabajador);
        System.out.println("Valor de descuento: " + descuento);
        System.out.println("Valor de sueldo semanal: " + sueldoxsemana);
        System.out.println("");
    }
}
public static void ejercicio417EEAM() {
    double P, ahorros, i;
    int n;
    n=2022-1961;
    P=1500.0;
    i=0.15;
    ahorros=P*Math.pow(1+i,n);
    System.out.println("Dinero colocado al banco: " + P);
    System.out.println("Su inversion ahora vale: " + ahorros);
    System.out.println("Paga: " + i+"% anual");
    System.out.println(+ n+" Años invertidos: " );
}

public static void main(String[] args) {
    ejercicio414EEAM();
}

}

