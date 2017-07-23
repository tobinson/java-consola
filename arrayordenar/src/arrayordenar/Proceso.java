package arrayordenar;

import java.util.Arrays;
import java.util.Scanner;

public class Proceso {

    public Scanner leer;
    public int cant;
    public int[] numeros;

    public void cargar() {
        System.out.println("cuantos datos desea ingresar:");
        leer = new Scanner(System.in);//inicializa scanner
        cant = leer.nextInt();//lee tamaño del array

        numeros = new int[cant];//inicializa array

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese numero " + (i + 1) + ":");
            numeros[i] = leer.nextInt();
        }
    }

    public void menor() {
        Arrays.sort(numeros);//ordena de menor a mayor
        System.out.println("el menor es:" + numeros[0]);
    }

    public void mayor() {
        int y = numeros.length;//array.reverse solo en c sharp
        System.out.println("el mayor es:" + numeros[y - 1]);
    }

    public void mostrar() {
        //Mostramos el array ya ordenado
        for (int i : numeros) {
            System.out.print(i + ", ");
        }
    }
}
