package proyectoestructura;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int FILAS = 5;
    private static final int COLUMNAS = 10;
    public static void main(String[] args)throws InterruptedException {
        //Prueba para crear una matriz de personajes
        Cola colaPersonajes = agregarPersonajesUsuario();
        Personaje[][] matriz = new Personaje[FILAS][COLUMNAS];
        
        // Pelear hasta que solo quede un personaje en la cola       
        while (!colaPersonajes.estaVacia()) { 
         
           Nodo nodoPersonaje1 = colaPersonajes.atiende();
           Personaje personaje1 = nodoPersonaje1.getDato();
           Personaje personaje2 = crearPersonajeAleatorio();

            if (personaje1.getFuerza() > personaje2.getFuerza()) {
                System.out.println(personaje1.getNombre() + " ha ganado!");
            } else if (personaje2.getFuerza() > personaje1.getFuerza()) {
                System.out.println(personaje2.getNombre() + " ha ganado!");
            } else {
                System.out.println("¡Empate!");
            }
        // Agregar personajes de vuelta a la cola
            //colaPersonajes.agregar(newNodo(new Personaje(personaje1));
            //colaPersonajes.agregar(personaje2);

            // Mover personajes hacia el centro
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS / 2; j++) {
                    if (j == COLUMNAS / 2 - 1) {
                        matriz[i][j] = personaje1;
                        matriz[i][COLUMNAS - j - 1] = personaje2;
                    } else {
                        matriz[i][j] = matriz[i][j + 1];
                        matriz[i][COLUMNAS - j - 1] = matriz[i][COLUMNAS - j - 2];
                    }
                }
            }

            // Mostrar la matriz actualizada
            imprimirPersonajesMovibles(matriz, 5);

            // Esperar 2 segundos
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        //Aqui podemos elegir cual de los caminos ingresar el personaje
        /*int op=1;
        // Insertar los personajes en la matriz
        if (op==1) {
            matriz[0][0] = personajeMovible;
            matriz[0][9] = personaje2;
        // Mover los personajes hacia el centro de la matriz
        for (int i = 1; i < 5; i++) {
            matriz[0][i] = personajeMovible;
            matriz[0][9-i] = personaje2;
            imprimirPersonajesMovibles(matriz,i);
            Thread.sleep(2000);
        }
        
        // Evaluar el enfrentamiento de los personajes
        if (personajeMovible.getFuerza() > personaje2.getFuerza()) {
            System.out.println(personajeMovible.getNombre() + " gana el enfrentamiento");
        } else if (personaje2.getFuerza() > personajeMovible.getFuerza()) {
            System.out.println(personaje2.getNombre() + " gana el enfrentamiento");
        } else {
            System.out.println("Empate en el enfrentamiento");
        }
        
        }else if(op==2){
            matriz[3][0] = personajeMovible;
            matriz[3][9] = personaje2;
            // Mover los personajes hacia el centro de la matriz
        for (int i = 1; i < 5; i++) {
            matriz[3][i] = personajeMovible;
            matriz[3][9-i] = personaje2;
            imprimirPersonajesMovibles(matriz,i);
            Thread.sleep(2000);
        }
        // Evaluar el enfrentamiento de los personajes
        if (personajeMovible.getFuerza() > personaje2.getFuerza()) {
            System.out.println(personajeMovible.getNombre() + " gana el enfrentamiento");
        } else if (personaje2.getFuerza() > personajeMovible.getFuerza()) {
            System.out.println(personaje2.getNombre() + " gana el enfrentamiento");
        } else {
            System.out.println("Empate en el enfrentamiento");
        }
        }else{
            System.out.println("La opcion de camino no es valida");
        }*/
        
}   
    public static Cola agregarPersonajesUsuario() {
    Scanner scanner = new Scanner(System.in);
    Cola cola = new Cola();

    System.out.println("Ingrese los nombres y la fuerza de los personajes que desea agregar:");
    for (int i = 0; i < 5; i++) {
        System.out.print("Nombre del personaje " + (i+1) + ": ");
        String nombre = scanner.next();

        System.out.print("Fuerza del personaje " + (i+1) + ": ");
        int fuerza = scanner.nextInt();

        Personaje personaje = new Personaje(nombre, fuerza);
        Nodo nodo = new Nodo(personaje); // crear nuevo Nodo que contenga el Personaje
        cola.agregar(nodo); // agregar el nuevo Nodo a la cola
    }

    return cola;
    }
    
    public static Personaje crearPersonajeAleatorio() {
    Random rand = new Random();
    int tipo = rand.nextInt(3); // Genera un número aleatorio entre 0 y 2
    String nombre = "";
    int fuerza = 0;
    

    switch (tipo) {
        case 0: // Arquero
            nombre = "A";
            fuerza = 1; // Genera un número aleatorio entre 5 y 9
            
            break;
        case 1: // Caballero
            nombre = "C";
            fuerza = 2; // Genera un número aleatorio entre 8 y 13
            
            break;
        case 2: // Mago
            nombre = "M";
            fuerza = 3; // Genera un número aleatorio entre 3 y 6
           
            break;
    }

    return new Personaje(nombre, fuerza);
    }
    
    //Este es el imprime que muestra movimiento
    public static void imprimirPersonajesMovibles(Personaje[][] matriz, int indice) {
    System.out.println("----------------------------");

        for (int i = 0; i < matriz.length; i++) {
        System.out.print("|");
        for (int j = 0; j < matriz[0].length; j++) {
            if (matriz[i][j] == null) {
            System.out.print("- ");
            } else if (i == 0 && (j < indice || j > matriz[0].length-1-indice)) {
            System.out.print("- ");
            } else if (matriz[i][j] == null) {
            System.out.print("- ");
            } else {
            System.out.print(matriz[i][j].getNombre() + "(" + matriz[i][j].getFuerza() + ")");
            matriz[i][j] = null; // establecer la posición actual en null
            }
                }
                System.out.println("|");
                }
                System.out.println("----------------------------");
        }
    }

        
        
        
        
        
        
        /*
        Juego j =new Juego();
        Scanner scanner = new Scanner(System.in);
        char tipo;
        System.out.println("Ingrese los 5 personajes:");
        for (int i = 1; i <= 5; i++) {
         do {
         System.out.print("Personaje " + i + ": ");
         tipo = scanner.nextLine().charAt(0);

            switch (tipo) {
            case 'a':
            case 'c':
            case 'm':
                j.agregarPersonaje(new Nodo(new Personaje(tipo)));
                break;
            default:
                System.out.println("Tipo de personaje inválido. Intente de nuevo.");
                break;
        }
            } while (tipo != 'a' && tipo != 'c' && tipo != 'm');
        }
        
        j.ingresarPersonajesEnMatriz();
        j.matriz();
        
        //System.out.println("Personajes ingresados:");
        //System.out.println(cola.imprimir());
        //j.solicitarPersonajes();
        //j.ingresarPersonajesEnMatriz();
        //j.imprimirMatriz();
     
*/
    
    
