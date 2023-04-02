package proyectoestructura;

public class Nodo {
    private Personaje dato;
    private Nodo siguiente;

    public Nodo(Personaje dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Personaje getDato() {
        return dato;
    }

    public void setDato(Personaje dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    


}
