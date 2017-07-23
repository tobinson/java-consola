package arraymayor;

import java.util.Scanner;

public class Proceso {

    public Scanner leer;
    public String[] nombre;
    public float[] sueldo;

    public void cargar() {
        leer = new Scanner(System.in);
        System.out.print("cunatos datos desea agregar:");
        int n = leer.nextInt();//lee tamaño del vector

        nombre = new String[n];//inicializa vectores
        sueldo = new float[n];

        for (int i = 0; i < sueldo.length; i++) {//recorre para agregar
            System.out.print("ingrese nombre:");
            nombre[i] = leer.next();
            System.out.print("ingrese sueldo:");
            sueldo[i] = leer.nextFloat();
        }
    }

    public void mayorSueldo() {//i hace referencia a los elementos del array
        float mayor = sueldo[0];
        int pos = 0;
        for (int i = 1; i < nombre.length; i++) {
            if (sueldo[i] > mayor) {
                mayor = sueldo[i];
                pos = i;
            }
        }
        System.out.println("el empleado com mayor sueldo es:" + nombre[pos]);
        System.out.println("y es de:" + mayor);
    }

    public void menorElemento() {
        float menor = sueldo[0];
        int pos = 0;
        for (int f = 1; f < sueldo.length; f++) {
            if (sueldo[f] < menor) {
                menor = sueldo[f];
                pos = f;
            }
        }
        System.out.println("El elemento menor :" + menor);
        System.out.println(" es de:" + nombre[pos]);
    }

    public void repiteMenor() {
        int cant = 0;
        float menor = 0;
        for (int f = 0; f < sueldo.length; f++) {
            if (sueldo[f] == menor) {
                cant++;
            }
        }
        if (cant > 1) {
            System.out.println("Se repite el menor en el vector.");
        } else {
            System.out.println("No se repite el menor en el vector.");
        }
    }

}
