package ListasSimples;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println(
                "1.- Insertar un nodo al final\n2.- Insertar un nodo en una posicion\n3.- Extraer algun dato\n4.- Imprimir lista\n5.- Salir\nIngresa una opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcionUsuario;
        int dato, posicion, datoExtraido;
        do {

            menu();
            opcionUsuario = sc.nextInt();

            switch (opcionUsuario) {
                case 1:

                    System.out.println("Ingresa el dato para agregarlos al final de la lista:");
                    dato = sc.nextInt();

                    lista.push(dato);

                    System.out.println();
                    lista.imprimirLista();
                    System.out.println();

                    break;

                case 2:

                    System.out.println("Ingresa un dato para agregarlo:");
                    dato = sc.nextInt();

                    System.out.println("Ingresa la posicion donde quieres ingresar ese dato:");
                    posicion = sc.nextInt();

                    lista.push(dato, posicion);

                    System.out.println();
                    lista.imprimirLista();
                    System.out.println();

                    break;

                case 3:
                    System.out.println();
                    lista.imprimirLista();
                    System.out.println();

                    System.out.println("Ingresa el valor del dato que quieres eliminar:");
                    dato = sc.nextInt();

                    datoExtraido = lista.extraer(dato);

                    if(datoExtraido != -1){
                        System.out.println("El dato extraido es: " + datoExtraido);
                    }else {
                        System.out.println("No se econtro el dato que ingresaste!!");
                    }

                    System.out.println();
                    lista.imprimirLista();
                    System.out.println();
                    break;

                case 4:

                    System.out.println();
                    lista.imprimirLista();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion ingresada no valida!!");
                    break;
            }

        } while (opcionUsuario != 5);

        sc.close();

    }
}
