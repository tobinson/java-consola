package foralumnos;

import java.util.Scanner;

public class Foralumnos {

    public static void main(String[] args) {
        int suma,valor,promedio;
        suma=0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
          System.out.print("ingrese un numero:");
          valor=leer.nextInt();
          suma=suma+valor;
        }
        System.out.println("la suma es:"+suma);
        System.out.println("el promedio es:"+suma/10);
        
    }
    
}
