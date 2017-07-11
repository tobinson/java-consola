
package dwpromedio;

import java.util.Scanner;

public class Dwpromedio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero,contador,suma,promedio;
        suma=0;
        contador=0;
        do {
            System.out.print("ingrese numero:");
            numero=leer.nextInt();
             if (numero!=0) {
                suma=suma+numero;
                contador++;
            }
        } while (numero!=0);
        if (true) {
           System.out.println("la suma de los numeros es:"+suma);
           System.out.println("la cantidad de numeros ingresados es:"+contador);
           System.out.println("el promedio es:"+suma/contador); 
        }else{
            System.out.println("ingrese un valor numerico");            
        }
    }
    
}
