package arrayleer;

import java.util.Scanner;

public class Proceso {

    private Scanner leer;
    private int[] sueldos;

    public void cargar() {
        leer = new Scanner(System.in);
        System.out.print("cuantos sueldos desea ingresar:");
        int cant;
        cant = leer.nextInt();
        sueldos = new int[cant];//inicializamos el array
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("ingrese sueldo " + (i + 1) + ":");
            sueldos[i] = leer.nextInt();//lo almacena en el array posicion i
        }
    }

    public void imprimir() {
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(sueldos[i]);
        }
    }

    public void sumaSueldos() {
        int suma = 0;
        for (int i = 0; i < sueldos.length; i++) {
            suma = suma + sueldos[i];
        }
        System.out.println("la suma de sueldos es:" + suma);
    }

}
