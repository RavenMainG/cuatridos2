package Colas;

import java.util.Scanner;

public class GestorCola {
    Scanner sc = new Scanner(System.in);
    int dato;
    Cola colaDatos = new Cola();

    public void agregarNodo() {
        System.out.println("Ingresa el dato: ");
        dato = sc.nextInt();

        colaDatos.inserarDato(dato);
    }

    public void extraerDato() {
        int datoExtraido = colaDatos.extraerDato();

        if (datoExtraido == -1) {
            System.out.println("Debes de ingresar datos para poder extraer!!");
            return;
        }

        System.out.println("Se extrajo correctamente el dato ( " + datoExtraido + " )");
    }

    public void imprimirCola() {
        colaDatos.imprimirCola();
    }

}
