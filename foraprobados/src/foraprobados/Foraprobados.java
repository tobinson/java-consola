
package foraprobados;

import java.util.Scanner;

public class Foraprobados {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aprobados=0,reprobados=0,nota;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese nota:");
            nota=leer.nextInt();
            if (nota>10) {
                aprobados=aprobados+1;
            }else{
                reprobados=reprobados+1;
            }
        }
        System.out.println("la cantidad de aprobados es:"+aprobados);
        System.out.println("la cantidad de desaprobados es:"+reprobados);
    }
    
}
