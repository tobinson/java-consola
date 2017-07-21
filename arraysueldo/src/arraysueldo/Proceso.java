
package arraysueldo;

import java.util.Scanner;

public class Proceso {
    private Scanner leer;
    private int[]sueldo;
    
    public void cargar(){
        leer=new Scanner(System.in);
        sueldo=new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("ingrese sueldo "+(i+1)+":");
            sueldo[i]=leer.nextInt();
        }
    }
    public void imprimir(){
        for (int i = 0; i < 3; i++) {
            System.out.println("el sueldo "+(i+1)+" es:"+sueldo[i]);
        }
    }
}
