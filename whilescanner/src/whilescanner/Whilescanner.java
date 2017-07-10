
package whilescanner;

import java.util.Scanner;

public class Whilescanner {

    public static void main(String[] args) {
        int cantidad;
        int inicio=1;
        int suma=0;
        double promedio=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("ingrese el ultimo numero de la progresion:");
        cantidad=leer.nextInt();
        
        while (inicio<=cantidad) {            
            System.out.print(inicio);
            System.out.print("+");
            suma=suma+inicio;
            inicio++;
        }
        System.out.println("="+suma);
        promedio=suma/cantidad;
        System.out.println("el promedio es"+promedio);
    }
    
}
