package arrayparalelo;

import java.util.Scanner;

public class Proceso {

    private Scanner leer;
    private String[] nombre;
    private int[] edad;

    public void cargar() {
        leer = new Scanner(System.in);
        System.out.println("cuantos datos desea ingresar:");
        int cant;
        cant = leer.nextInt();  //leo el tamaño del vector
        nombre = new String[cant]; //inicializo el array nombre y edad
        edad = new int[cant];
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("ingrese el nombre:");
            nombre[i] = leer.next();
            System.out.println("ingrese la edad");
            edad[i] = leer.nextInt();
        }
    }

    public void mayorMenor() {
        int may = 0;
        int men = 0;
        for (int i = 0; i < edad.length; i++) {
            if (edad[i] >= 18) {
                may = may + 1;
            } else {
                men = men + 1;
            }
        }
        System.out.println("la cantidad de mayores de edad es:" + may);
        System.out.println("la cantidad de menore de edad es:" + men);
    }
}
