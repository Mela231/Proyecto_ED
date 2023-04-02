package proyectoestructura;

public class Juego {
    
    //Invocamos clase Cola
    Cola cola = new Cola();
    
    public void agregarPersonaje(Nodo nuevoNodo) {
        cola.agregar(new Nodo(new Personaje("Arturo",5)));
        cola.agregar(new Nodo(new Personaje("Carlos",5)));
        cola.agregar(new Nodo(new Personaje("Ramiro",5)));
    }
    
    public void ImprimirPersonaje(){
        cola.imprimir();
    }
    
}
