package proyectoestructura;

public class Juego {
    
    //private Cola colaPersonajes;
    Cola cola = new Cola();
    String[][] matriz = new String[15][15];
    char tipo;
    
    public void agregarPersonaje(Nodo nuevoNodo) {
        cola.agregar(new Nodo(new Personaje(tipo)));
    }
    
    public void ingresarPersonajesEnMatriz() {
        int i = 5;
        int j = 0;

        while (!cola.estaVacia() && j < 3) {
            Personaje personaje = cola.remover();
            matriz[i][j] = String.valueOf(personaje.getTipo());
            j++;
        }
    }
    
        public void matriz(){
        // Rellenar la matriz con la letra "O"
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "O";
            }
        }
        
        // Colocar los caminos de la letra "I"
        for (int i = 0; i < matriz.length; i++) {
            if (i == 3 || i == 11) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = "I";
                }
            }
        }
        //insertar personajes en la cola
        
        
        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
