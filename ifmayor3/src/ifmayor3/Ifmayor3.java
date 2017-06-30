
package ifmayor3;

import java.util.Scanner;


public class Ifmayor3 {

  
    public static void main(String[] args) {
        //declaracion de variables
     Scanner leer = new Scanner(System.in);
     int n1,n2,n3;
     //ingreso de datos
        System.out.print("Ingrese primer valor:");
            n1=leer.nextInt();
        System.out.print("Ingrese segundo valor:");
            n2=leer.nextInt();
        System.out.print("Ingrese tercer valor:");
            n3=leer.nextInt();
     //proceso verificar el mayor
        if (n1>n2&&n1>n3) {
            System.out.println("el mayor es:"+n1);
        }   else{
            if (n2>n3) {
                System.out.println("el mayor es:"+n2);
            }   else{
                System.out.println("el mayor es:"+n3);
            }
    }
     
    }
    
}
