package Pilas;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n1.- Ingresar dato\n2.- Extraer dato\n3.- Imprimir pila\n4.- Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcionUsuario;

        GestorPilas gestor = new GestorPilas();

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
                    gestor.imprimirPila();
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
