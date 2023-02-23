package ListasSimples;

public class ListaEnlazada {
    
    Nodo cabeza = null;
    int contador = 0;

    public class Nodo {
        int dato;
        Nodo siguiente = null;

        public Nodo(int dato) {
            this.dato = dato;
        }
    }


    public void push(int dato, int posicion) {
        Nodo nuevoDato = new Nodo(dato);
        Nodo puntero = cabeza;

        if(cabeza == null) {
            cabeza = nuevoDato;
            contador ++;
            return;
        }else if (posicion < 0 || posicion == 1) {
            nuevoDato.siguiente = cabeza;
            cabeza = nuevoDato;
            contador++;
            return;
        }else if(posicion > contador) {
            while(puntero.siguiente != null){
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nuevoDato;
            contador++;
            return;
        }

        for(int contadorAux = 1; contadorAux < posicion - 1; contadorAux ++) {
            puntero = puntero.siguiente;
        }

        Nodo aux = puntero.siguiente;
        puntero.siguiente = nuevoDato;
        nuevoDato.siguiente = aux;
        contador++;
        return;
    }

    public void push(int dato) {

        Nodo nuevoDato = new Nodo(dato);
        if(cabeza == null) {
            cabeza = nuevoDato;
            contador++;
            return;
        }

        Nodo puntero = cabeza;

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }
        puntero.siguiente = nuevoDato;
        contador++;
    }

    public int extraer(int dato) {
        Nodo puntero = cabeza;
        int datoExtraido = -1;

        if(cabeza == null) {
            System.out.println("Necesitas ingresar datos para poder exraer!!");
            return datoExtraido;
        }

        if(cabeza.siguiente == null) {
            if(cabeza.dato == dato) {
                datoExtraido = cabeza.dato;
                cabeza = null;
                return datoExtraido;
            }else {
                return -1;
            }

        }

        if(dato == puntero.dato) {

            Nodo punteroAux = puntero.siguiente;
            datoExtraido = puntero.dato;
            puntero.siguiente = null;
            puntero = null;
            cabeza = punteroAux;

            contador--;

            return datoExtraido;
        }

        for(int contadorFor = 1; contadorFor < contador; contadorFor++) {
            if(puntero.siguiente.dato == dato) {

                if(puntero.siguiente.siguiente == null){
                    datoExtraido = puntero.siguiente.dato;
                    puntero.siguiente = null;

                    return datoExtraido;
                }
                Nodo punteroAux = puntero.siguiente.siguiente;
                datoExtraido = puntero.siguiente.dato;
                puntero.siguiente = null;
                puntero.siguiente = punteroAux;

                contador--;

                return datoExtraido;
            }
            puntero = puntero.siguiente;
        }


        return datoExtraido;
    }

    public void imprimirLista() {
        if(cabeza == null) {
            System.out.println("Para poder imprimir la lista primero debes de agregar elementos!!");
            return;
        }
        Nodo puntero = cabeza;
        while(puntero.siguiente != null){
            System.out.println("Dato: " + puntero.dato);
            puntero = puntero.siguiente;
        }
        System.out.println("Dato: " + puntero.dato);
    }
}
