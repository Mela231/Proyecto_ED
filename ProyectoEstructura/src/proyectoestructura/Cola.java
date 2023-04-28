package proyectoestructura;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int largo;

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }
    
    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }
    
    public boolean estaVacia() {
        return frente == null;
    }

    public void agregar(Nodo nuevoNodo) {
        // significa que la cola esta vacia
         if(frente == null){  
            frente = nuevoNodo;
            ultimo = nuevoNodo;                    
        } else{
            ultimo.setSiguiente(nuevoNodo);
            ultimo=nuevoNodo;
        }largo++;
    }

    public Nodo atiende(){
        Nodo aux = frente;
        if(frente!=null){
            frente=frente.getSiguiente();
            aux.setSiguiente(null);
            largo--;
        }
        return aux;
    }
    
    public String imprimir(){
        String s="";
        Nodo aux=frente;
        while(aux!=null){
            s+=aux.getDato().getNombre()+" "+aux.getDato().getFuerza()+"\n";
            aux=aux.getSiguiente();
        }
        return s;
    }
}