package switchmetodos;

import java.util.Scanner;

public class Proceso {
    //definir variables

    private int num = 0, op = 0;
    Scanner leer = new Scanner(System.in);
    //imprime las opciones a eleijir
    public void menu() {
        System.out.println("1:Funcion seno");
        System.out.println("2:Funcion coseno");
        System.out.println("3:Raiz cuadrada");
        
        System.out.print("Ingrese una opcion:");
    }
    //lee la opcion q se elejira
    public void leerMenu() {
        //System.out.println("Ingrese una opcion:");
        menu();
        op = leer.nextInt();
        leerNumero();
        menuOpciones();
    }
    //leer el num para realizar la operacion trigonometrica
    public void leerNumero(){
        System.out.print("Ingrese un numero para calcular la operacion:");
        num=leer.nextInt();
    }
    //menu de opciones
    public void menuOpciones(){
        switch (op) {
            case 1: 
                System.out.println("El seno de " +num+" es:"+Math.sin(num));
                break;
            case 2:
                System.out.println("El coseno de " +num+" es:"+Math.cos(num));                
                break;
            case 3: 
                System.out.println("La raiz de " +num+" es:"+Math.sqrt(num));
                break;
            default:
                System.out.println("Opcion incorrecta");
                //menu();
        }
    }
}
