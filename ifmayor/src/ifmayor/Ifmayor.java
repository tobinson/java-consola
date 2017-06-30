
package ifmayor;

import java.util.Scanner;

public class Ifmayor {

    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       //declaracion de variables
    	int num1,num2;
         //ingreso de datos
    	System.out.print("Ingrese primer valor:");
    	num1=teclado.nextInt();
    	System.out.print("Ingrese segundo valor:");
    	num2=teclado.nextInt();
        //proceso verificar el mayor
    	if (num1>num2) {
    		System.out.print("el numero mayor es:"+num1);
    	} else {
    		System.out.print("el numero mayor es:"+num2);
    	}
    }
    
}
