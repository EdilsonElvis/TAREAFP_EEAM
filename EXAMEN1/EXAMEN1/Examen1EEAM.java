package EXAMEN1;

import java.util.Scanner;

class pregunta5EEAM{
    static Scanner st=new Scanner(System.in);
    public static void pregunta1EEAM() {
        //DEFINIR VARIABLES
        String Nl;
    double Nec, NE, Ntp; 
    //DATOS DE ENTRADA
    System.out.println("Ingrese las notas: ");
    System.out.println("Ingrese la nota del examen de conocimiento: ");
    Nec=st.nextDouble();
    System.out.println("Ingrese la nota de entrevista personal: ");
    NE=st.nextDouble();
    System.out.println("Ingrese la nota del test psicologico: ");
    Ntp=st.nextDouble();
    //PROCESO
    double PEC = (Nec * 0.40);
    double PEP = (NE * 0.35);
    double PTP = (Ntp * 0.25);
    double promedio = (PEC + PEP + PTP);
    if (promedio>=17 && promedio<=20) {
        Nl="Su nivel es 4";
    } else if(promedio<17 && promedio>=14){
        Nl="Su nivel es 3";
    } else if(promedio<14 && promedio>=11){
        Nl="Su nivel es 2";
    } else if(promedio<11){
        Nl="usted No puede obtener vacante";
    } else {
        Nl="Notas no validas ";
    }
    // DATOS DE SALIDA
    System.out.println(Nl);       
    }

    public static void pregunta2EEAM() {
        //DEFINIR VARIABLES
        double igv, precio, descuento, importetotal;
        //DATOS DE ENTRADA
        try (Scanner st = new Scanner(System.in)) {
            System.out.println("ingrese el monto base: ");
            precio = st.nextDouble();
        }
        //PROCESO
        igv = precio+0.18 ;
        if (precio<2000){
            igv = precio*0.18;
            descuento = precio*0.10;
            importetotal = precio - descuento + igv ;
        }else  if (precio>1000){
                igv = precio*0.18;
                descuento = precio*0.05;
                importetotal = precio - descuento + igv ;
            }else if (precio>500){
                igv = precio*0.18;
                descuento = precio*0.02;
                importetotal = precio - descuento + igv ;
            }else{ 
                    descuento = 0;
                    importetotal =0;
            }
            //DATOS DE SALIDA
            System.out.println("el descuento aplicado es: "+ descuento);
            System.out.println("el igv es: "+ igv);
            System.out.println("el importe total es de : "+ importetotal);   
    }

    public static void pregunta3EEAM() {
        int v1, v2;
        double R;
        System.out.print("ingrese el primer valor: ");
        v1 = st.nextInt();
        System.out.print("ingrese el segundo valor: ");
        v2 = st.nextInt();
        char operador=st.next().charAt(0);
        R = Math.sqrt(v1);
        switch (operador){
            case '+': System.out.println(v1+v2); break;
            case '-': System.out.println(v1-v2); break;
            case '/': System.out.println(v1/v2); break;
            case 'x': System.out.println(v1*v2); break;
            case '%': System.out.println(v1%2); break;
            case '^': System.out.println(v1^v2); break;
            case 'R': System.out.println(+R); break;
            default: break;
        }
    }

   public static void pregunta4EEAM() {
    int edad;
    String vacuna; 
    try (
    Scanner lt = new Scanner(System.in)) {
        System.out.print("Ingrese la edad del paciente: ");
        edad=lt.nextInt();
      
        if (edad>69) {
            vacuna="La vacuna que le corresponde es 'C'";
        }else if(edad>16){
            System.out.println("Ingrese el genero (F = Femenino , M = Masculino)");
            vacuna="La vacuna que le corresponde es 'B'"; 
        } else if(edad<16){
            vacuna="La vacuna que le corresponde es 'A'";
        } else {
            vacuna="La vacuna que le corresponde es  'A'";
        }
    }
    
    System.out.println(vacuna);
}
    public static void main(String[] args) {
        System.out.println("Ingrese la pregunta: (1),(2),(3),(4)");
        int pregunta = st.nextInt();
        switch (pregunta) {
          case 1:
            pregunta1EEAM(); break;
            
          case 2:
            pregunta2EEAM(); break;
          case 3:
            pregunta3EEAM(); break;
          case 4:
            pregunta4EEAM(); break;  
            default: break;
        }
    }
}