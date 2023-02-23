package Colas;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n1.- Ingresar dato\n2.- Extraer dato\n3.- Imprimir cola\n4.- Salir\nIngresa una opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorCola gestor = new GestorCola();
        int opcionUsuario;

        do {

            menu();
            opcionUsuario = sc.nextInt();

            switch (opcionUsuario) {
                case 1:
                    gestor.agregarNodo();
                    break;
                case 2:
                    gestor.extraerDato();
                    break;
                case 3:
                    gestor.imprimirCola();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida!!");
                    break;
            }

        } while (opcionUsuario != 4);

        sc.close();
    }
}
