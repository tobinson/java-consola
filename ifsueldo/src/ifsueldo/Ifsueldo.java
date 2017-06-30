package ifsueldo;

import java.util.Scanner;

public class Ifsueldo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sueldo;
        System.out.print("Ingrese el sueldo:");
        sueldo = teclado.nextFloat();
        if (sueldo > 3000) {
            System.out.println("Esta persona debe abonar impuestos");
        }
    }

}
