package ListasDobles;

public class ListaDoble {

    Nodo cabeza = null;
    int length;
    
    public class Nodo{

        int dato;
        Nodo siguiente = null;
        Nodo anterior = null;

        public Nodo(int dato) {
            this.dato = dato;
        }

    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if(cabeza == null) {
            cabeza = nuevoNodo;
            length++;
            return; 
        }

        



    }

}
