
package dowhile;

import java.util.Scanner;

public class Dowhile {

    public static void main(String[] args) {
        int valor;
        Scanner leer=new Scanner(System.in);
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor=leer.nextInt();
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 dígitos.");
                } else {
                    System.out.println("Tiene 1 dígito.");
                }
            }
        } while (valor!=0);
        
    }
    
}
