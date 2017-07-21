package arraynotas;

import java.util.Scanner;

public class Proceso {

    private int arreglo[] = new int[4];
    Scanner leer = new Scanner(System.in);

    public void leerNotas() {
        System.out.println("el numero de notas es " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese nota " + (i + 1) + ":");
            arreglo[i] = leer.nextInt();
        }
        imprimirNotas();
    }

    public void imprimirNotas() {
        System.out.print("las notas ingresadas son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("-" + arreglo[i] + "-");
        }
    }

    public void promedio() {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        System.out.println("el promedio es:" + suma / arreglo.length);
    }

}
