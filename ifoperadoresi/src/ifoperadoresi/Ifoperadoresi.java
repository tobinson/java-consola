
package ifoperadoresi;

import java.util.Scanner;

public class Ifoperadoresi {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese primer valor:");
        num1=leer.nextInt();
        System.out.print("Ingrese segundo valor:");
        num2=leer.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=leer.nextInt();
        if (num1<10 && num2<10 && num3<10) {
            System.out.print("Todos los números son menores a diez");
        }
    }
    
}
