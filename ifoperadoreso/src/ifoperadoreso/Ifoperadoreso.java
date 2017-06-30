
package ifoperadoreso;

import java.util.Scanner;

public class Ifoperadoreso {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaracion de variables
        int dia,mes,año;
        System.out.println("ingrese numero de dia:");
        dia=leer.nextInt();
        System.out.println("ingrese numero de mes:");
        mes=leer.nextInt();
        System.out.println("ingrese numero de año:");
        año=leer.nextInt();
        //proceso
        if (mes==1 || mes==2 || mes==3) {
            System.out.println("corresponde al primer trimestre");     
        }
    }
    
}
