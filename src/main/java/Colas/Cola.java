package Colas;

public class Cola {

    Nodo cabeza = null;

    public class Nodo {
        int dato;
        Nodo siguiente = null;

        public Nodo(int dato) {
            this.dato = dato;
        }
    }

    public void inserarDato(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }

        Nodo puntero = cabeza;

        while (puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        puntero.siguiente = nuevoNodo;

    }

    public int extraerDato() {

        int datoExtraido;

        if (cabeza == null) {
            return -1;
        } else if (cabeza.siguiente == null) {
            datoExtraido = cabeza.dato;
            cabeza = null;
            return datoExtraido;
        }

        Nodo puntero = cabeza;
        datoExtraido = cabeza.dato;
        cabeza = puntero.siguiente;

        puntero.siguiente = null;
        puntero = null;

        return datoExtraido;
    }

    public void imprimirCola() {
        if (cabeza == null) {
            System.out.println("Debes de ingresar datos para imprimir la cola!!");
            return;
        }

        Nodo puntero = cabeza;

        while (puntero.siguiente != null) {
            System.out.println("Dato: " + puntero.dato);
            puntero = puntero.siguiente;
        }

        System.out.println("Dato: " + puntero.dato);

    }

}
