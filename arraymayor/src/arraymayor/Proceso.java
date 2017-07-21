package arraymayor;

import java.util.Scanner;

public class Proceso {

    public Scanner leer;
    public String[] nombre;
    public float[] sueldo;

    public void cargar() {
        leer = new Scanner(System.in);
        nombre = new String[4];
        sueldo = new float[4];
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("ingrese nombre");
            nombre[i] = leer.next();
            System.out.println("ingrese sueldo:");
            sueldo[i] = leer.nextFloat();
        }
    }

    public void mayorSueldo() {
        float mayor = 0;
        mayor = sueldo[0];
        int pos = 0;
        for (int i = 1; i < nombre.length; i++) {
            if (sueldo[i] > mayor) {
                mayor = sueldo[i];
                pos = i;
            }
        }
        System.out.println("el empleado com mayor sueldo es:" + nombre[pos]);
        System.out.println("y es de" + mayor);
    }

}
