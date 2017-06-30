package ifmetodos;

import java.util.Scanner;

public class Proceso {

    private int nota = 0;//priv para poder encapsular
    Scanner leer = new Scanner(System.in);

    public Proceso() { //constructor
    }

    public void leerNota() { //procedimiento no retorna valor
        System.out.print("ingrese nota:");
        nota = leer.nextInt();//proceso para leer un dato y convertirlo a int

        //condicion();//llamada al metodo
    }

    public void condicion() {
        if (nota <= 10 && nota >= 0) {
            System.out.println("desaprobado");
        } else {
            System.out.println("aprobado");
        }
    }

}
