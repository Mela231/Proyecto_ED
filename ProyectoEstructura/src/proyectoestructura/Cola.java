package proyectoestructura;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;

    public Cola() {
        frente = null;
        ultimo = null;
    }
    public boolean estaVacia() {
        return frente == null;
    }

    public void agregar(Nodo nuevoNodo) {
         if(frente == null){  // significa que la cola esta vacia
            frente = nuevoNodo;
            ultimo = nuevoNodo;                    
        } else{
            ultimo.setSiguiente(nuevoNodo);
            ultimo=nuevoNodo;
        }
    }
    public Personaje remover() {
        if (frente == null) {
            return null;
        }

        Personaje personaje = frente.getDato();
        frente = frente.getSiguiente();

        if (frente == null) {
            ultimo = null;
        }

        return personaje;
    }

    public String imprimir(){
        String s="";
        Nodo aux=frente;
        while(aux!=null){
            s+=aux.getDato().getTipo()+"\n";
            aux=aux.getSiguiente();
        }
        return s;
    }
}
