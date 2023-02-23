package Pilas;

public class Pilas {

    Nodo cabeza = null;

    public class Nodo {

        int dato;
        Nodo siguiente = null;

        public Nodo(int dato) {
            this.dato = dato;
        }

    }

    public void insersionDato(int dato) {
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

    public void imprimirPila() {
        Nodo puntero = cabeza;

        if (cabeza == null) {
            System.out.println("Debes de ingresar datos a la pila para poder imprimirla!!");
            return;
        }

        System.out.println("");
        while (puntero.siguiente != null) {
            System.out.println("Dato: " + puntero.dato);
            puntero = puntero.siguiente;
        }

        System.out.println("Dato: " + puntero.dato);

    }

    public int extraer() {
        Nodo puntero = cabeza;
        int datoExtraido;

        if (cabeza == null) {
            return -1;
        }

        while (puntero.siguiente.siguiente != null) {
            puntero = puntero.siguiente;
        }

        datoExtraido = puntero.siguiente.dato;

        puntero.siguiente = null;

        return datoExtraido;
    }
}
